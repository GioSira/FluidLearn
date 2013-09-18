package org.fluidlearn.core.common;

import org.fluidlearn.core.model.User;
import org.fluidlearn.core.model.attori.PartecipanteConcreto;
import org.fluidlearn.core.model.attori.Utente;
import org.fluidlearn.dao.UtenteDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserComm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
    	ApplicationContext appContext = 
        		new ClassPathXmlApplicationContext("spring/config/beans.xml");
    	
        UtenteDao userDao = (UtenteDao)appContext.getBean("utenteDao");
		
        
        Utente user = new PartecipanteConcreto("Giovanni", "pincopallo", "giovanni@gmail.com", "Giovanni", "Siragusa");
        
        /* inserimento */
        userDao.insert(user);
        System.out.println(user.toString());
        
        /* aggiornamento */
        user.setPassword(user.getPassword()+"02");
        userDao.update(user);
        System.out.println(user.toString());
        
        /* estrazione e modifica */
        Utente user2 = userDao.searchByPK(user.getId());
        user2.setUser("Luca");
        user2.setPassword("ciccio");
        userDao.insert(user2);
        System.out.println(user2.toString());
        
        /* cancellazione */
        userDao.delete(user2);
	}

}
