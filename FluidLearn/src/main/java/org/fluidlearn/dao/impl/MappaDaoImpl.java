package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.unitadidattica.Mappa;
import org.fluidlearn.dao.MappaDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class MappaDaoImpl implements MappaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Mappa searchByPK(Long id) {
		Mappa m = (Mappa) getSessionFactory().getCurrentSession().get(Mappa.class, id);
		return m;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Mappa> getAllMappa() {
		return getSessionFactory().getCurrentSession().createQuery("from Mappa").list();
	}

	@Transactional
	public void insert(Mappa m) {
		getSessionFactory().getCurrentSession().saveOrUpdate(m);
		
	}

	@Transactional
	public void update(Mappa m) {
		getSessionFactory().getCurrentSession().saveOrUpdate(m);
		
	}

	@Transactional
	public void delete(Mappa m) {
		getSessionFactory().getCurrentSession().delete(m);
		
	}

}
