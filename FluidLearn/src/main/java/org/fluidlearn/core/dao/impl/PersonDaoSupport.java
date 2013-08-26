package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.PersonDao;
import org.fluidlearn.core.model.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class PersonDaoSupport implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Person searchByPK(Long id) {
		Person p = (Person) getSessionFactory().getCurrentSession().get(Person.class, id);
		return p;
	}

	@Transactional
	public void insert(Person p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);
	}

	@Transactional
	public void update(Person p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);
	}

	@Transactional
	public void delete(Person p) {
		getSessionFactory().getCurrentSession().delete(p);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Person> getAllPerson() {
		return getSessionFactory().getCurrentSession().createQuery("from Person").list();
	}

}
