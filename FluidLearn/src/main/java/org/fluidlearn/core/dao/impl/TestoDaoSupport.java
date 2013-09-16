package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.TestoDao;
import org.fluidlearn.core.model.corpo.Testo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class TestoDaoSupport implements TestoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Testo searchByPK(Long id) {
		Testo t = (Testo) getSessionFactory().getCurrentSession().get(Testo.class, id);
		return t;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Testo> getAllTesto() {
		return getSessionFactory().getCurrentSession().createQuery("from Testo").list();
	}

	@Transactional
	public void insert(Testo t) {
		getSessionFactory().getCurrentSession().saveOrUpdate(t);
		
	}

	@Transactional
	public void update(Testo t) {
		getSessionFactory().getCurrentSession().saveOrUpdate(t);
		
	}
	
	@Transactional
	public void delete(Testo t) {
		getSessionFactory().getCurrentSession().delete(t);
		
	}



}
