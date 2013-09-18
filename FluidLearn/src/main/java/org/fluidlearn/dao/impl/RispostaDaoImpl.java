package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.compito.Risposta;
import org.fluidlearn.core.model.compito.Sollecitazione;
import org.fluidlearn.dao.RispostaDao;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class RispostaDaoImpl implements RispostaDao {


	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Risposta searchByPK(Long id) {
		Risposta r = (Risposta) getSessionFactory().getCurrentSession().get(Risposta.class, id);
		return r;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Risposta> getAllRisposte() {
		return getSessionFactory().getCurrentSession().createQuery("from Risposta").list();
	}

	@Transactional
	public void insert(Risposta r) {
		getSessionFactory().getCurrentSession().saveOrUpdate(r);
		
	}

	@Transactional
	public void update(Risposta r) {
		getSessionFactory().getCurrentSession().saveOrUpdate(r);
		
	}

	@Transactional
	public void delete(Risposta r) {
		getSessionFactory().getCurrentSession().delete(r);
		
	}
	
		
	@Transactional
	public void deleteByID(Long id) {
		Session session = getSessionFactory().getCurrentSession();
		session.delete(session.get(Sollecitazione.class, id));
	}
		

}
