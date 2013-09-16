package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.ArtefattoDao;
import org.fluidlearn.core.model.corpo.Artefatto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ArtefattoDaoImpl implements ArtefattoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Artefatto searchByPK(Long id) {
		Artefatto a = (Artefatto) getSessionFactory().getCurrentSession().get(Artefatto.class, id);
		return a;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Artefatto> getAllArtefatti() {
		return getSessionFactory().getCurrentSession().createQuery("from Artefatto").list();
	}

	@Transactional
	public void insert(Artefatto a) {
		getSessionFactory().getCurrentSession().saveOrUpdate(a);
		
	}

	@Transactional
	public void update(Artefatto a) {
		getSessionFactory().getCurrentSession().saveOrUpdate(a);
		
	}

	@Transactional
	public void delete(Artefatto a) {
		getSessionFactory().getCurrentSession().delete(a);
		
	}

}
