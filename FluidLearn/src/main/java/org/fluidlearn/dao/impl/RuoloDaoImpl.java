package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.attori.Ruolo;
import org.fluidlearn.dao.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class RuoloDaoImpl implements RuoloDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Ruolo searchByPK(Long id) {
		Ruolo r = (Ruolo) getSessionFactory().getCurrentSession().get(Ruolo.class, id);
		return r;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Ruolo> getAllRuoli() {
		return getSessionFactory().getCurrentSession().createQuery("from Ruolo").list();
	}

	@Transactional
	public void insert(Ruolo r) {
		getSessionFactory().getCurrentSession().saveOrUpdate(r);
		
	}

	@Transactional
	public void update(Ruolo r) {
		getSessionFactory().getCurrentSession().saveOrUpdate(r);
		
	}

	@Transactional
	public void delete(Ruolo r) {
		getSessionFactory().getCurrentSession().delete(r);
		
	}
	
}
