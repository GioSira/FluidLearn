package org.fluidlearn.core.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fluidlearn.core.dao.NodeDao;
import org.fluidlearn.core.dao.PostDao;
import org.fluidlearn.core.model.Post;
import org.fluidlearn.core.model.Testo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class PostController extends MultiActionController {
	
	public ModelAndView creaPost(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
				
		
		// creo il testo
		Testo testo = new Testo();
		testo.setId(00001L);
		testo.setTitolo((String) request.getAttribute("titolo_post"));
		// salvo il testo
		
		// creo eventuale plugin
		// DA COMPLETARE
		//salvo il plugin
		
		// creo il post
		Post post = new Post();
		// setto le info [DA COMPLETARE]
		
		// salvo il post (conviene inserirlo dentro post)
    	ApplicationContext appContext = 
        		new ClassPathXmlApplicationContext("spring/config/beans.xml");
        PostDao postDao = (PostDao)appContext.getBean("postDao");
        postDao.insert(post);
		
		// ModelAndView prende il nome della vista a cui inviare, il nome del model e l'oggetto model
		return new ModelAndView("PostPage", "post", post);
		
	}
	
	public ModelAndView modify(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		return new ModelAndView("PostPage in cui inviare", "msg da visualizzare", "modify() method here");
		
	}
	
	public ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		return new ModelAndView("PostPage in cui inviare", "msg da visualizzare", "delete() method here");
		
	}
	

}
