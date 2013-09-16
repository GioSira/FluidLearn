package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.UtenteDao;
import org.fluidlearn.core.model.User;
import org.fluidlearn.core.model.attori.Utente;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UtenteDaoImpl implements UtenteDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Utente searchByPK(long id) {
		Utente u = (Utente) getSessionFactory().getCurrentSession().get(Utente.class, id);
		return u;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Utente> getAllUsers() {
		return getSessionFactory().getCurrentSession().createQuery("from User").list();
	}

	@Transactional
	public void insert(Utente u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);

	}

	@Transactional
	public void update(Utente u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);

	}

	@Transactional
	public void delete(Utente u) {
		getSessionFactory().getCurrentSession().delete(u);

	}

}
