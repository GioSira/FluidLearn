package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.NodeDao;
import org.fluidlearn.core.model.Node;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class NodeDaoSupport implements NodeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Node searchByPK(Long id) {
		Node n = (Node) getSessionFactory().getCurrentSession().get(Node.class, id);
		return n;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Node> getAllNode() {
		return getSessionFactory().getCurrentSession().createQuery("from Node").list();
	}

	@Transactional
	public void insert(Node n) {
		getSessionFactory().getCurrentSession().saveOrUpdate(n);
		
	}

	@Transactional
	public void update(Node n) {
		getSessionFactory().getCurrentSession().saveOrUpdate(n);
		
	}

	@Transactional
	public void delete(Node n) {
		getSessionFactory().getCurrentSession().delete(n);
		
	}



}
