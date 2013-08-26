package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.PluginDao;
import org.fluidlearn.core.model.Plugin;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PluginDaoSupport implements PluginDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Transactional(readOnly = true)
	public Plugin searchByPK(Long id) {
		Plugin p = (Plugin) getSessionFactory().getCurrentSession().get(Plugin.class, id);
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Plugin> getAllPlugin() {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().createQuery("from Plugin").list();
	}

	@Transactional
	public void insert(Plugin p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);

	}

	@Transactional
	public void update(Plugin p) {
		getSessionFactory().getCurrentSession().saveOrUpdate(p);

	}

	@Transactional
	public void delete(Plugin p) {
		getSessionFactory().getCurrentSession().delete(p);

	}

}
