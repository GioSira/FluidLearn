package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.CorsoDao;
import org.fluidlearn.core.model.Corso;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CorsoDaoImpl implements CorsoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Corso searchByPK(Long id) {
		Corso c = (Corso) getSessionFactory().getCurrentSession().get(Corso.class, id);
		return c;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Corso> getAllCorso() {
		return getSessionFactory().getCurrentSession().createQuery("from Corso").list();
	}

	@Transactional
	public void insert(Corso c) {
		getSessionFactory().getCurrentSession().saveOrUpdate(c);
		
	}

	@Transactional
	public void update(Corso c) {
		getSessionFactory().getCurrentSession().saveOrUpdate(c);
		
	}

	@Transactional
	public void delete(Corso c) {
		getSessionFactory().getCurrentSession().delete(c);
		
	}

}
