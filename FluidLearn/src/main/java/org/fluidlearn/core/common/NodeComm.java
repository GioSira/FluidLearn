package org.fluidlearn.core.common;


import org.fluidlearn.core.dao.NodoDao;
import org.fluidlearn.core.model.Node;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NodeComm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

    	ApplicationContext appContext = 
        		new ClassPathXmlApplicationContext("spring/config/beans.xml");
    	
        NodoDao nodeDao = (NodoDao)appContext.getBean("nodeDao");
        
        /*insert*/
        Node node = new Node();
        node.setId(00145L);
        node.setTitle("Informatica");
        node.setFather(null);
        nodeDao.insert(node);
        
        /*select*/
        Node nd = nodeDao.searchByPK(00145L);
        System.out.println(nd);
        
        /*update*/
        nd.setId(00146L);
        nodeDao.update(nd);
        
        /*delete*/
        nodeDao.delete(nd);
        	
	}

}
