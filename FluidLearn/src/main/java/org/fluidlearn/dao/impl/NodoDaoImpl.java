package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.Node;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.dao.NodoDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class NodoDaoImpl implements NodoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Nodo searchByPK(Long id) {
		Nodo n = (Nodo) getSessionFactory().getCurrentSession().get(Nodo.class, id);
		return n;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Nodo> getAllNode() {
		return getSessionFactory().getCurrentSession().createQuery("from Nodo").list();
	}

	@Transactional
	public void insert(Nodo n) {
		getSessionFactory().getCurrentSession().saveOrUpdate(n);
		
	}

	@Transactional
	public void update(Nodo n) {
		getSessionFactory().getCurrentSession().saveOrUpdate(n);
		
	}

	@Transactional
	public void delete(Nodo n) {
		getSessionFactory().getCurrentSession().delete(n);
		
	}



}
