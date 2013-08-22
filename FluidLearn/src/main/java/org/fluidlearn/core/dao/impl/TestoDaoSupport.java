package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.TestoDao;
import org.fluidlearn.core.model.Testo;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class TestoDaoSupport extends HibernateDaoSupport implements TestoDao {

	@Transactional(readOnly = true)
	public Testo searchByPK(Long id) {
		Testo t = getHibernateTemplate().get(Testo.class, id);
		return t;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Testo> getAllTesto() {
		return getHibernateTemplate().find("from Testo");
	}

	@Transactional
	public void insert(Testo t) {
		getHibernateTemplate().saveOrUpdate(t);
		
	}

	@Transactional
	public void update(Testo t) {
		getHibernateTemplate().saveOrUpdate(t);
		
	}
	
	@Transactional
	public void delete(Testo t) {
		getHibernateTemplate().delete(t);
		
	}



}
