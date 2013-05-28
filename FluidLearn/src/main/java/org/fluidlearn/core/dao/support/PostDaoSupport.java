package org.fluidlearn.core.dao.support;

import java.util.List;

import org.fluidlearn.core.dao.PostDao;
import org.fluidlearn.core.model.Post;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class PostDaoSupport extends HibernateDaoSupport implements PostDao {

	@Transactional(readOnly = true)
	public Post searchByPK(Long id) {
		Post p = getHibernateTemplate().get(Post.class, id);
		return p;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Post> getAllPost() {
		return getHibernateTemplate().find("from Post");
	}

	@Transactional
	public void insert(Post p) {
		getHibernateTemplate().saveOrUpdate(p);

	}

	@Transactional
	public void update(Post p) {
		getHibernateTemplate().saveOrUpdate(p);

	}

	@Transactional
	public void delete(Post p) {
		getHibernateTemplate().delete(p);

	}

}
