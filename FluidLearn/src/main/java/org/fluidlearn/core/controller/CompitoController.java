package org.fluidlearn.core.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fluidlearn.core.dao.*;
import org.fluidlearn.core.model.Corso;
import org.fluidlearn.core.model.Date;
import org.fluidlearn.core.model.Risorsa;
import org.fluidlearn.core.model.attori.Partecipante;
import org.fluidlearn.core.model.compito.Sollecitazione;
import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.corpo.Plugin;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CompitoController extends MultiActionController {

	private HttpServletRequest request;
	private HttpServletResponse response;
	
	private final ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
	
    private CorsoDao corsoDao = (CorsoDao)appContext.getBean("corsoDao");
	private SollecitazioneDao sollecitazioneDao = (SollecitazioneDao)appContext.getBean("sollecitazioneDao");
    
	public ModelAndView creaPost(Partecipante part, Boolean isTesto, Long id_corso,
			Risorsa ris, Nodo nodo, String testo, String titolo, Date data_scadenza, 
			Boolean visibilita, Date data_time) throws Exception {
		
		// creo il corpo
		Corpo corpo = Corpo.creaCorpo(isTesto);
		corpo.set(testo);
		
		// prendo l'oggetto corso dal DB
		Corso corso = corsoDao.searchByPK(id_corso);
		
		// prendo l'ultima uda attiva
		UnitaDA uda = corso.getLastUDAAttiva();
		
		Sollecitazione compito = new Sollecitazione(data_time, visibilita, false, ris, nodo, uda, 
				corpo, titolo, data_scadenza, part);
		
		request.getSession().setAttribute("bozza", compito);
		
		return new ModelAndView("CompitoPage", "compitoBozza", compito);
		
	}
	
	public ModelAndView creaPostPlugin(Partecipante part, Boolean isTesto, Long id_corso,
			Risorsa ris, Nodo nodo, Plugin plugin, String titolo, Date data_scadenza, 
			Boolean visibilita, Date data_time) throws Exception {
		
		// creo il corpo
		Corpo corpo = Corpo.creaCorpo(isTesto);
		corpo.set(plugin);
		
		// prendo l'oggetto corso dal DB
		Corso corso = corsoDao.searchByPK(id_corso);
		
		// prendo l'ultima uda attiva
		UnitaDA uda = corso.getLastUDAAttiva();
		
		Sollecitazione compitoPlugin = new Sollecitazione(data_time, visibilita, false, ris, nodo, uda, 
				corpo, titolo, data_scadenza, part);
		
		request.getSession().setAttribute("bozza", compitoPlugin);
		
		return new ModelAndView("CompitoPage", "compitoPluginBozza", compitoPlugin);
		
	}
	
	public ModelAndView salva(Boolean isDraft) {
		
		Sollecitazione bozzaCompito = (Sollecitazione) request.getSession().getAttribute("bozza");
		// setto il valore di draft
		bozzaCompito.setIsDraft(isDraft);
		
		// creazione di SollecitazioneDao...
		
		//Salvataggio su db (richiama gli altri dao per salvare)
		sollecitazioneDao.insert(bozzaCompito);
		
		return new ModelAndView("CompitoPage", "compito", bozzaCompito);
		
	}
	
	
	public ModelAndView elimina(Long idCompito) {
		
		// creazione di SollecitazioneDao...
		
		//Salvataggio su db (richiama gli altri dao per salvare)
		sollecitazioneDao.deleteByID(idCompito);
		
		// creazione degli oggetti compito
		
		return new ModelAndView("CompitoPage", "compito", "ecc...");
		
	}
	
	
	
}
