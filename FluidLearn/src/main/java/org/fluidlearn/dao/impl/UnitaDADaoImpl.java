package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.unitadidattica.UnitaDA;
import org.fluidlearn.dao.UnitaDADao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UnitaDADaoImpl implements UnitaDADao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public UnitaDA searchByPK(Long id) {
		UnitaDA uda = (UnitaDA) getSessionFactory().getCurrentSession().get(UnitaDA.class, id);
		return uda;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<UnitaDA> getAllUDA() {
		return getSessionFactory().getCurrentSession().createQuery("from UnitaDA").list();
	}

	@Transactional
	public void insert(UnitaDA uda) {
		getSessionFactory().getCurrentSession().saveOrUpdate(uda);
		
	}

	@Transactional
	public void update(UnitaDA uda) {
		getSessionFactory().getCurrentSession().saveOrUpdate(uda);
		
	}

	@Transactional
	public void delete(UnitaDA uda) {
		getSessionFactory().getCurrentSession().delete(uda);
		
	}

}
