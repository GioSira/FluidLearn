package org.fluidlearn.test.dao;

import java.util.ArrayList;

import org.fluidlearn.core.dao.NodeDao;
import org.fluidlearn.core.model.Node;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import junit.framework.*;

public class NodeTest extends TestCase {
	
    private BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));
    private NodeDao nodeDao = (NodeDao) ctx.getBean("nodeDaoProxy");
	
	protected Node node;
	
	public NodeTest(String name) {
		super(name);
		node = new Node();
	}
	
	protected void setUp() {
		node.setTitle("Informatica");
		node.setId(0004514L);
		node.setFather(null);
	    nodeDao.insert(node);
	}
	
	public static Test suite() {
		return new TestSuite(NodeTest.class);
	}
	
	public void testAdd() {
		Node n = new Node();
		ArrayList<Node> fathers = new ArrayList<Node>();
		fathers.add(node);
		n.setFather(fathers);
		n.setTitle("risposta Informatica");
		n.setId(0004515L);
		node.add(n);
		nodeDao.insert(n);
		nodeDao.insert(n);
		assert(nodeDao.searchByPK(0004515L) != null);
	}
	
	public void testFather() {
		Node n = nodeDao.searchByPK(0004515L);
		Node father = n.getNode("Informatica");
		assertEquals(father.getTitle(), node.getTitle());
	}
	
	public void testDelete() {
		Node n = nodeDao.searchByPK(0004515L);
		nodeDao.delete(n);
		assert(nodeDao.searchByPK(0004515L) == null);
	}
	
	public void testTitle() {
		assertEquals(node.getTitle(), nodeDao.searchByPK(0004514L).getTitle());
	}
	


}
