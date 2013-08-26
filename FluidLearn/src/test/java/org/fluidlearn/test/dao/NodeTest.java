package org.fluidlearn.test.dao;

import java.util.ArrayList;

import org.fluidlearn.core.dao.NodeDao;
import org.fluidlearn.core.model.Node;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import junit.framework.*;

public class NodeTest extends TestCase {
	
	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
    private NodeDao nodeBo = (NodeDao) appContext.getBean("nodeDao");
	
	protected Node node;
	
	public NodeTest(String name) {
		super(name);
		node = new Node();
	}
	
	protected void setUp() {
		node.setTitle("Informatica");
		node.setId(0004514L);
		node.setFather(null);
	    nodeBo.insert(node);
	}
	
	public static Test suite() {
		return new TestSuite(NodeTest.class);
	}
	
	public void testAdd() {
		Node n = new Node();
		ArrayList<Node> fathers = new ArrayList<Node>();
		fathers.add(node);
		//n.setFather(fathers);
		n.setTitle("risposta Informatica");
		n.setId(0004515L);
		//node.add(n);
		nodeBo.insert(n);
		nodeBo.insert(n);
		assert(nodeBo.searchByPK(0004515L) != null);
	}
	
	public void testFather() {
		Node n = nodeBo.searchByPK(0004515L);
		//Node father = n.getNode("Informatica");
		//assertEquals(father.getTitle(), node.getTitle());
	}
	
	public void testDelete() {
		Node n = nodeBo.searchByPK(0004515L);
		nodeBo.delete(n);
		assert(nodeBo.searchByPK(0004515L) == null);
	}
	
	public void testTitle() {
		assertEquals(node.getTitle(), nodeBo.searchByPK(0004514L).getTitle());
	}
	
	
	/*public static void main(String[] args) {
		NodeTest nt = new NodeTest("test nodo");
		nt.suite();
		nt.setUp();
		nt.testTitle();
		nt.toString();
		nt.testAdd();
		nt.testFather();
		nt.testDelete();
	} */
	


}
