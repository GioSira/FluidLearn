package org.fluidlearn.test.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.fluidlearn.core.dao.NodoDao;
import org.fluidlearn.core.model.Node;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NodeDaoTest {


	private ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
    private NodoDao nodeDao = (NodoDao) appContext.getBean("nodeDao");
	
	Node node = new Node();
	
	@Before
	public void setUp() {
		node.setTitle("Informatica");
		node.setId(0004514L);
		node.setFather(null);
	    nodeDao.insert(node);
	}
	
	@Test
	public void testAdd() {
		Node n = new Node();
		ArrayList<Node> fathers = new ArrayList<Node>();
		fathers.add(node);
		//n.setFather(fathers);
		n.setTitle("risposta Informatica");
		n.setId(0004515L);
		//node.add(n);
		nodeDao.insert(n);
		nodeDao.insert(n);
		assert(nodeDao.searchByPK(0004515L) != null);
	}
	
	@Test
	public void testDelete() {
		Node n = nodeDao.searchByPK(0004515L);
		nodeDao.delete(n);
		assert(nodeDao.searchByPK(0004515L) == null);
	}
	
	@Test
	public void testTitle() {
		assertEquals(node.getTitle(), nodeDao.searchByPK(0004514L).getTitle());
	}

}
