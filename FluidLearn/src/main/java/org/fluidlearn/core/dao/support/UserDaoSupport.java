package org.fluidlearn.core.dao.support;

import java.util.List;

import org.fluidlearn.core.dao.UserDao;
import org.fluidlearn.core.model.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoSupport extends HibernateDaoSupport implements UserDao {

	@Transactional(readOnly = true)
	public User searchByPK(Long id) {
		User u = getHibernateTemplate().get(User.class, id);
		return u;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<User> getAllUsers() {
		return getHibernateTemplate().find("from User");
	}

	@Transactional
	public void insert(User u) {
		getHibernateTemplate().saveOrUpdate(u);

	}

	@Transactional
	public void update(User u) {
		getHibernateTemplate().saveOrUpdate(u);

	}

	@Transactional
	public void delete(User u) {
		getHibernateTemplate().delete(u);

	}

}
