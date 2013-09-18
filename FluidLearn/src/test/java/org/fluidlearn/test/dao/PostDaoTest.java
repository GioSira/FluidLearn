package org.fluidlearn.test.dao;

import static org.junit.Assert.*;

import org.fluidlearn.core.model.Post;
import org.fluidlearn.dao.PostDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostDaoTest {

	private ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
	 private PostDao postDao = (PostDao) appContext.getBean("postDao");
	
	Post post = new Post();
	
	@Before
	public void setUp() {
		post.setId(00147L);
		post.setPersonID(004545L);
		post.setPluginID(00415L);
		post.setTestoID(00400L);
		post.setTitolo("Informatica");
	    postDao.insert(post);
	}
	
	@Test
	public void testPersonID() {
		assertEquals(postDao.searchByPK(00147L).getPersonID(), post.getPersonID());
	}
	
	@Test
	public void testPluginID() {
		assertEquals(postDao.searchByPK(00147L).getPluginID(), post.getPluginID());
	}
	
	@Test
	public void testTestoID() {
		assertEquals(postDao.searchByPK(00147L).getTestoID(), post.getTestoID());
	}
	
	@Test
	public void testTitolo() {
		assertEquals(postDao.searchByPK(00147L).getTitolo(), post.getTitolo());
	}
	
	@Test
	public void testDelete() {
		postDao.delete(postDao.searchByPK(00147L));
		assert(postDao.searchByPK(00147L) == null);
	}

}
