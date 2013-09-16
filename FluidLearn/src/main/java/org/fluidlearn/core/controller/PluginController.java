package org.fluidlearn.core.controller;

import org.fluidlearn.core.model.corpo.Artefatto;
import org.fluidlearn.core.model.corpo.Plugin;
import org.springframework.stereotype.Controller;

@Controller
public class PluginController {

	public Artefatto creArtefatto() {
		
		Plugin plugin = new Plugin();
		Artefatto artefatto = plugin.creaArtefatto();
		
		return artefatto;
		
	}
	
}
