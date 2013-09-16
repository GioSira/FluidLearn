package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.PrototipoDao;
import org.fluidlearn.core.model.Prototipo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PrototipoDaoImpl implements PrototipoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Prototipo searchByPK(Long id) {
		Prototipo p = (Prototipo) getSessionFactory().getCurrentSession().get(Prototipo.class, id);
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Prototipo> getAllPrototipi() {
		return getSessionFactory().getCurrentSession().createQuery("from Prototipo").list();
	}

	@Transactional
	public void insert(Prototipo p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);
		
	}

	@Transactional
	public void update(Prototipo p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);
		
	}

	@Transactional
	public void delete(Prototipo p) {
		getSessionFactory().getCurrentSession().delete(p);
		
	}

}
