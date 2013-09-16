package org.fluidlearn.core.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fluidlearn.core.dao.*;
import org.fluidlearn.core.model.Corso;
import org.fluidlearn.core.model.Date;
import org.fluidlearn.core.model.attori.Partecipante;
import org.fluidlearn.core.model.compito.Sollecitazione;
import org.fluidlearn.core.model.corpo.Corpo;
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
    
	public ModelAndView creaCompito(Partecipante part, Boolean isTesto, Long id_corso) throws Exception {
		
		// creo il corpo
		Corpo corpo = Corpo.creaCorpo(isTesto);
		
		// prendo l'oggetto corso dal DB
		Corso corso = corsoDao.searchByPK(id_corso);
		
		// prendo l'ultima uda attiva
		UnitaDA uda = corso.getLastUDAAttiva();
		
		Sollecitazione compito = new Sollecitazione(part, corpo, uda);
		
		request.getSession().setAttribute("bozza", compito);
		
		return new ModelAndView("CompitoPage", "compito", compito);
		
	}
	
	public ModelAndView setInfo(String titolo, String testo, Date data_scadenza, int visibilita) throws Exception {
		
		Sollecitazione compito = (Sollecitazione)request.getSession().getAttribute("bozza");
		
		// creo il corpo, qui è solo testo
		Corpo corpo = compito.getCorpo();
		corpo.set(testo);
		compito.setCorpo(corpo);
		
		// imposto la data
		Date data = new Date();
		Calendar c = Calendar.getInstance();
		
		data.setGiorno(c.get(Calendar.DAY_OF_MONTH));
		data.setMese(c.get(Calendar.MONTH));
		data.setAnno(c.get(Calendar.YEAR));
		data.setOra(c.getTime());
		compito.setDatetime(data);
		
		// imposto la data di scadenza
		compito.setDataScadenza(data_scadenza);
		
		// inserisco il titolo
		compito.setTitolo(titolo);
		
		//imposto la visibilità
		compito.setVisibilita(visibilita);
		
		// salvo il compito
		request.getSession().setAttribute("bozza", compito);
		
		return new ModelAndView("CompitoPage", "compito", compito);
		
	}
	
	
	public ModelAndView setUDA(UnitaDA uda) {
		
		Sollecitazione compito = (Sollecitazione)request.getSession().getAttribute("bozza");
		
		// imposto l'unità didattica di riferimento
		compito.setUnitaDAAppartenenza(uda);
		
		return new ModelAndView("CompitoPage", "compito", compito);
		
	}
	
	
	/**
	 * 
	 * Allegare risorse al compito viene fatto tramite l'apposito UC di 
	 * Risorse
	 *
	 */
	
	
	public ModelAndView inviaCompito(Boolean isDraft) {
		
		Sollecitazione bozzaCompito = (Sollecitazione) request.getSession().getAttribute("bozza");
		// setto il valore di draft
		bozzaCompito.setIsDraft(isDraft);
		
		//Salvataggio su db (richiama gli altri dao per salvare)
		sollecitazioneDao.insert(bozzaCompito);
		
		// elimino il compito dalla session
		request.getSession().removeAttribute("bozza");
		
		return new ModelAndView("CompitoPage", "compito", bozzaCompito);
		
	}
	
	
	public ModelAndView elimina(Long idCompito) {
				
		//Salvataggio su db (richiama gli altri dao per salvare)
		sollecitazioneDao.deleteByID(idCompito);
		
		// creazione degli oggetti compito
		
		return new ModelAndView("CompitoPage", "compito", "ecc...");
		
	}
	
	
	
}
