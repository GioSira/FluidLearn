package org.fluidlearn.controller;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fluidlearn.controller.CompitoController;
import org.fluidlearn.core.model.Date;
import org.fluidlearn.core.model.attori.Partecipante;
import org.fluidlearn.core.model.compito.Sollecitazione;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GuiController {

	private final ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
	
	// aggiunta dei controller
	private static CompitoController compitoController = new CompitoController();

	@RequestMapping(value="/sollecitazione/new", method=RequestMethod.POST)
	public String creaCompito(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
				
		// prendo il partecipante, è stato creato in precedenza
		Partecipante part = (Partecipante) request.getSession().getAttribute("utente");
		
		//prendo valore isTesto
		String testo = (String) request.getAttribute("isTesto");
		boolean isTesto = false;
		if(testo.equalsIgnoreCase("testo"))
			isTesto = true;
		
		//prendo valore id corso
		Long id_corso = (Long)request.getAttribute("id_corso");
		
		Sollecitazione compito = compitoController.creaCompito(part, isTesto, id_corso);
		
		request.getSession().setAttribute("bozza", compito);
		
		//aggiunta del compito al model
		model.addAttribute("compito", compito);
		
		if(isTesto)
			return "/sollecitazione/aggiungi";
		else
			return "redirect:/plugin/aggiungi"; // la aggiungi viene fatta richiamando il GuiController
	}
	
	@RequestMapping(value="/sollecitazione/addInfo", method=RequestMethod.POST)
	public String aggiungiInfo(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
				
		// prendo dati testo e titolo
		String titolo = (String)request.getAttribute("titolo");
		String testo = (String)request.getAttribute("testo");
		
		// creo data scadenza
		Date data_scadenza = new Date();
		Calendar c = Calendar.getInstance();
		int giorno = (Integer)request.getAttribute("giorno");
		int mese = (Integer)request.getAttribute("mese");
		int anno = (Integer)request.getAttribute("anno");
		
		data_scadenza.setGiorno(giorno);
		data_scadenza.setMese(mese);
		data_scadenza.setAnno(anno);
		data_scadenza.setOra(c.getTime());
		
		// prendo la visibilità del compito
		int visibilita = (Integer)request.getAttribute("visibilita");
		
		model.addAttribute(compitoController.setInfo(titolo, testo, data_scadenza, visibilita));
		
		return "/sollecitazione/aggiungi";
	}
	
	@RequestMapping(value="/sollecitazione/modificaUDA", method=RequestMethod.POST)
	public String modificaUDA(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		UnitaDA uda = (UnitaDA)request.getAttribute("uda");
			
		model.addAttribute("compito", compitoController.setUDA(uda));
		
		return "/sollecitazione/setUDA";
		
	}
	
	@RequestMapping(value="/sollecitazione/elimina", method=RequestMethod.POST)
	public String elimina(HttpServletRequest request, HttpServletResponse response) {
		
		// prendo l'id da eliminare
		Long idCompito = (Long)request.getAttribute("idCompito");
		
		// elimino il compito
		compitoController.elimina(idCompito);
		
		// re-indirizzo a corso
		return "redirect: /corso";
		
	}
	
	
}
