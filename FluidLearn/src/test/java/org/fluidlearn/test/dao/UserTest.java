package org.fluidlearn.test.dao;

import org.fluidlearn.core.dao.UserDao;
import org.fluidlearn.core.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class UserTest {
	
	public static void main(String[] args) {
		
	    BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));
	    UserDao userDao = (UserDao) ctx.getBean("userDaoProxy");
	    
	    // Insert
	    User us1 = new User();
	    us1.setUsername("Giovanni");
	    us1.setPwd("pincopallo6");
	    userDao.insert(us1);
	    
	    User us2 = new User();
	    us2.setUsername("Geanina");
	    us2.setPwd("caiomaio");
	    userDao.insert(us2);
	    
	    // Update
	    us2.setUsername("Geanina1");
	    userDao.update(us2);
	    
	    // Delete
	    userDao.delete(us1);
	    
	    // stampa DB
	    
		
	}

}
