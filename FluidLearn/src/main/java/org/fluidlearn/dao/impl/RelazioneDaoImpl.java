package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.unitadidattica.Relazione;
import org.fluidlearn.dao.RelazioneDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class RelazioneDaoImpl implements RelazioneDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Relazione searchByPK(Long id) {
		Relazione r = (Relazione) getSessionFactory().getCurrentSession().get(Relazione.class, id);
		return r;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Relazione> getAllRelazioni() {
		return getSessionFactory().getCurrentSession().createQuery("from Relazione").list();
	}

	@Transactional
	public void insert(Relazione r) {
		getSessionFactory().getCurrentSession().saveOrUpdate(r);
		
	}

	@Transactional
	public void update(Relazione r) {
		getSessionFactory().getCurrentSession().saveOrUpdate(r);
		
	}

	@Transactional
	public void delete(Relazione r) {
		getSessionFactory().getCurrentSession().delete(r);
		
	}

}
