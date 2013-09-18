package org.fluidlearn.dao.impl;

import java.util.List;

import org.fluidlearn.core.model.Post;
import org.fluidlearn.dao.PostDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PostDaoImpl implements PostDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Post searchByPK(Long id) {
		Post p = (Post) getSessionFactory().getCurrentSession().get(Post.class, id);
		return p;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Post> getAllPost() {
		return getSessionFactory().getCurrentSession().createQuery("from Post").list();
	}

	@Transactional
	public void insert(Post p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);

	}

	@Transactional
	public void update(Post p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);

	}

	@Transactional
	public void delete(Post p) {
		getSessionFactory().getCurrentSession().delete(p);

	}

}
