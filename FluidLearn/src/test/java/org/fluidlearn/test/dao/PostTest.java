package org.fluidlearn.test.dao;

import org.fluidlearn.core.dao.PostDao;
import org.fluidlearn.core.model.Post;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PostTest extends TestCase {

	private BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));
    private PostDao postDao = (PostDao) ctx.getBean("postDaoProxy");
	
	protected Post post;
	
	public PostTest(String name) {
		super(name);
		post = new Post();
	}
	
	protected void setUp() {
		post.setId(00147L);
		post.setPersonID(004545L);
		post.setPluginID(00415L);
		post.setTestoID(00400L);
		post.setTitolo("Informatica");
	    postDao.insert(post);
	}
	
	public static Test suite() {
		return new TestSuite(PostTest.class);
	}
	
	public void testPersonID() {
		assertEquals(postDao.searchByPK(00147L).getPersonID(), post.getPersonID());
	}
	
	public void testPluginID() {
		assertEquals(postDao.searchByPK(00147L).getPluginID(), post.getPluginID());
	}
	
	public void testTestoID() {
		assertEquals(postDao.searchByPK(00147L).getTestoID(), post.getTestoID());
	}
	
	public void testTitolo() {
		assertEquals(postDao.searchByPK(00147L).getTitolo(), post.getTitolo());
	}
	
	public void testDelete() {
		postDao.delete(postDao.searchByPK(00147L));
		assert(postDao.searchByPK(00147L) == null);
	}
	
}
