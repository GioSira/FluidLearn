package org.fluidlearn.test.dao;

import static org.junit.Assert.*;

import org.fluidlearn.core.dao.UserDao;
import org.fluidlearn.core.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

	private ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
    private UserDao userDao = (UserDao) appContext.getBean("userDao");
    
    private User user = new User();
	
    @Before
	public void setUp() {
    	user.setId(0L);
	    user.setUsername("Giovanni");
	    user.setPwd("pincopallo");
	    userDao.insert(user);
	}
	
    @Test
	public void testUsername() {
		User usr = userDao.searchByPK(0L);
		assertEquals(usr.getUsername(), user.getUsername());
	}
	
    @Test
	public void testPwd() {
		User usr = userDao.searchByPK(0L);
		assertEquals(usr.getPwd(), user.getPwd());
	}
	
    @Test
	public void testAdd() {
		User u = new User();
		u.setId(1L);
		u.setUsername("Geanina");
		u.setPwd("caiomaio");
		userDao.insert(u);
		assert(userDao.searchByPK(1L) != null);
	}
	
    @Test
	public void testDelete() {
		User u = userDao.searchByPK(0L);
		userDao.delete(u);
		assertNull(userDao.searchByPK(0L));
	}

}
