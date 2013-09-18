package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.dao.CorpoDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CorpoDaoImpl implements CorpoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Corpo searchByPK(Long id) {
		Corpo c = (Corpo) getSessionFactory().getCurrentSession().get(Corpo.class, id);
		return c;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Corpo> getAllCorpi() {
		return getSessionFactory().getCurrentSession().createQuery("from Corpo").list();
	}

	@Transactional
	public void insert(Corpo c) {
		getSessionFactory().getCurrentSession().saveOrUpdate(c);
		
	}

	@Transactional
	public void update(Corpo c) {
		getSessionFactory().getCurrentSession().saveOrUpdate(c);
		
	}

	@Transactional
	public void delete(Corpo c) {
		getSessionFactory().getCurrentSession().delete(c);
		
	}

}
