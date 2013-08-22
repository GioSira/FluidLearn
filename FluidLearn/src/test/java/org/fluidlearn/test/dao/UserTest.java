package org.fluidlearn.test.dao;

import org.fluidlearn.core.dao.UserDao;
import org.fluidlearn.core.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import junit.framework.*;

public class UserTest extends TestCase {
	
   private BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));
   private UserDao userDao = (UserDao) ctx.getBean("userDaoProxy");
	
	protected User user;
	
	public UserTest(String name) {
		super(name);
		user = new User();
	}
	
	protected void setUp() {
	    user.setUsername("Giovanni");
	    user.setPwd("pincopallo");
	    userDao.insert(user);
	}
	
	public static Test suite() {
		return new TestSuite(UserTest.class);
	}
	
	public void testUsername() {
		User usr = userDao.searchByPK("Giovanni");
		assertEquals(usr.getUsername(), user.getUsername());
	}
	
	public void testPwd() {
		User usr = userDao.searchByPK("Giovanni");
		assertEquals(usr.getPwd(), user.getPwd());
	}
	
	public void testAdd() {
		User u = new User();
		u.setUsername("Geanina");
		u.setPwd("caiomaio");
		userDao.insert(u);
		assert(userDao.searchByPK("Geanina") != null);
	}
	
	public void testDelete() {
		User u = userDao.searchByPK("Giovanni");
		userDao.delete(u);
		assert(userDao.searchByPK("Giovanni") == null);
	}

}
