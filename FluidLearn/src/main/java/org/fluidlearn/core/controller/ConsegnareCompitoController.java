package org.fluidlearn.core.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fluidlearn.core.dao.RispostaDao;
import org.fluidlearn.core.dao.SollecitazioneDao;
import org.fluidlearn.core.model.Date;
import org.fluidlearn.core.model.attori.Partecipante;
import org.fluidlearn.core.model.compito.Risposta;
import org.fluidlearn.core.model.compito.Sollecitazione;
import org.fluidlearn.core.model.corpo.Corpo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class ConsegnareCompitoController extends MultiActionController {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	private final ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
	
	private SollecitazioneDao sollecitazioneDao = (SollecitazioneDao)appContext.getBean("sollecitazioneDao");
	private RispostaDao rispostaDao = (RispostaDao)appContext.getBean("rispostaDao");
	
	public ModelAndView creaRispostaCompito(Partecipante part, boolean isTesto) throws Exception{
		
		// creo il corpo
		Corpo corpo = Corpo.creaCorpo(isTesto);
		
		// creo la risposta
		Risposta risposta = new Risposta(corpo);
		
		// salvo la risposta nella session
		request.getSession().setAttribute("risposta", risposta);
		
		return new ModelAndView("RispostaPage", "risposta", risposta);
		
	}
	
	
	public ModelAndView setInfoRisposta(Long id_compito, String testo, String titolo, int visibilita) throws Exception {
		
		Risposta risposta = (Risposta)request.getSession().getAttribute("riposta");
		
		// creo e imposto la data
		Date data = new Date();
		Calendar c = Calendar.getInstance();
		data.setGiorno(c.get(Calendar.DAY_OF_MONTH));
		data.setMese(c.get(Calendar.MONTH));
		data.setAnno(c.get(Calendar.YEAR));
		data.setOra(c.getTime());
		
		risposta.setDatetime(data);
		
		// imposto il titolo
		risposta.setTitolo(titolo);
		
		// imposto il corpo
		Corpo corpo = risposta.getCorpo();
		corpo.set(testo);
		risposta.setCorpo(corpo);
		
		// prendo il compito dal db
		Sollecitazione sollecitazione = sollecitazioneDao.searchByPK(id_compito);
		
		// imposto la sollecitazione
		risposta.setUnitaDAAppartenenza(sollecitazione.getUnitaDAAppartenenza());
		
		// imposto la sollecitazione pradre di rispota
		risposta.setSollecitazione(sollecitazione);
		
		// imposto la visibilita
		risposta.setVisibilita(visibilita);
		
		return new ModelAndView("RispostaPage", "risposta", risposta);
		
	}
	
	public ModelAndView inviaRisposta(boolean isDraft) throws Exception {
		
		Risposta risposta = (Risposta)request.getSession().getAttribute("riposta");
		
		if(risposta.getDatetime().isLessThan(risposta.getSollecitazione().getDataScadenza()));
			throw new Exception("data scadenza superata"); // far ritornare alla pagina che si è suprati la scandenza
		
			
		// vedere il perché da errore...
		risposta.setIsDraft(isDraft);
		
		// la inserisco nel db
		rispostaDao.insert(risposta);
		
		// elimino il compito dalla session
		request.getSession().removeAttribute("risposta");
		
		return new ModelAndView("RispostaPage", "risposta", risposta);
		
	}
	
	public ModelAndView elimina(Long idRisposta) {
		
		//Salvataggio su db (richiama gli altri dao per salvare)
		rispostaDao.deleteByID(idRisposta);
		
		// creazione degli oggetti compito
		
		return new ModelAndView("RispostaPage", "risposta", "ecc...");
		
	}
	 
}
