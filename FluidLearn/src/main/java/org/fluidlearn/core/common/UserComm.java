package org.fluidlearn.core.common;

import org.fluidlearn.core.dao.UserDao;
import org.fluidlearn.core.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserComm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
    	ApplicationContext appContext = 
        		new ClassPathXmlApplicationContext("spring/config/beans.xml");
    	
        UserDao userDao = (UserDao)appContext.getBean("userDao");
		
        
        User user = new User(00001L, "Giovanni", "pincopallo");
        
        /* inserimento */
        userDao.insert(user);
        System.out.println(user.toString());
        
        /* aggiornamento */
        user.setPwd(user.getPwd()+"02");
        userDao.update(user);
        System.out.println(user.toString());
        
        /* estrazione e modifica */
        User user2 = userDao.searchByPK(user.getId());
        user2.setUsername("Luca");
        user2.setPwd("ciccio");
        userDao.insert(user2);
        System.out.println(user2.toString());
        
        /* cancellazione */
        userDao.delete(user2);
	}

}
