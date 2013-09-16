package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.RisorsaDao;
import org.fluidlearn.core.model.Risorsa;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class RisorsaDaoImpl implements RisorsaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Risorsa searchByPK(Long id) {
		Risorsa r = (Risorsa) getSessionFactory().getCurrentSession().get(Risorsa.class, id);
		return r;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Risorsa> getAllRisorse() {
		return getSessionFactory().getCurrentSession().createQuery("from Risorsa").list();
	}

	@Transactional
	public void insert(Risorsa r) {
		getSessionFactory().getCurrentSession().saveOrUpdate(r);
		
	}

	@Transactional
	public void update(Risorsa r) {
		getSessionFactory().getCurrentSession().saveOrUpdate(r);
		
	}

	@Transactional
	public void delete(Risorsa r) {
		getSessionFactory().getCurrentSession().delete(r);
		
	}

}
