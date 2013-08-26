package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.UserDao;
import org.fluidlearn.core.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoSupport implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public User searchByPK(String name) {
		User u = (User) getSessionFactory().getCurrentSession().get(User.class, name);
		return u;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<User> getAllUsers() {
		return getSessionFactory().getCurrentSession().createQuery("from User").list();
	}

	@Transactional
	public void insert(User u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);

	}

	@Transactional
	public void update(User u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);

	}

	@Transactional
	public void delete(User u) {
		getSessionFactory().getCurrentSession().delete(u);

	}

}
