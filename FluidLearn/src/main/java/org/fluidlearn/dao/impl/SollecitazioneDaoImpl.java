package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.compito.Sollecitazione;
import org.fluidlearn.dao.SollecitazioneDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class SollecitazioneDaoImpl implements SollecitazioneDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Sollecitazione searchByPK(Long id) {
		Sollecitazione s = (Sollecitazione) getSessionFactory().getCurrentSession().get(Sollecitazione.class, id);
		return s;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Sollecitazione> getAllSollecitazione() {
		return getSessionFactory().getCurrentSession().createQuery("from Sollecitazione").list();
	}

	@Transactional
	public void insert(Sollecitazione s) {
		getSessionFactory().getCurrentSession().saveOrUpdate(s);

	}

	@Transactional
	public void update(Sollecitazione s) {
		getSessionFactory().getCurrentSession().saveOrUpdate(s);

	}

	@Transactional
	public void delete(Sollecitazione s) {
		getSessionFactory().getCurrentSession().delete(s);

	}
	
	@Transactional
	public void deleteByID(Long id) {
		Session session = getSessionFactory().getCurrentSession();
		session.delete(session.get(Sollecitazione.class, id));
	}

}
