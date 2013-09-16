package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.PartecipanteDao;
import org.fluidlearn.core.model.attori.Partecipante;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PartecipanteDaoImpl implements PartecipanteDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Partecipante searchByPK(Long id) {
		Partecipante p = (Partecipante) getSessionFactory().getCurrentSession().get(Partecipante.class, id);
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Partecipante> getAllPartecipanti() {
		return getSessionFactory().getCurrentSession().createQuery("from Partecipante").list();
	}

	@Transactional
	public void insert(Partecipante p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);
		
	}

	@Transactional
	public void update(Partecipante p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);
		
	}

	@Transactional
	public void delete(Partecipante p) {
		getSessionFactory().getCurrentSession().delete(p);
		
	}

}
