package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.ContributoDao;
import org.fluidlearn.core.model.Contributo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ContributoDaoImpl implements ContributoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Contributo searchByPK(Long id) {
		Contributo c = (Contributo) getSessionFactory().getCurrentSession().get(Contributo.class, id);
		return c;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Contributo> getAllContributi() {
		return getSessionFactory().getCurrentSession().createQuery("from Contributo").list();
	}

	@Transactional
	public void insert(Contributo c) {
		getSessionFactory().getCurrentSession().saveOrUpdate(c);
		
	}

	@Transactional
	public void update(Contributo c) {
		getSessionFactory().getCurrentSession().saveOrUpdate(c);
		
	}

	@Transactional
	public void delete(Contributo c) {
		getSessionFactory().getCurrentSession().delete(c);
		
	}

}
