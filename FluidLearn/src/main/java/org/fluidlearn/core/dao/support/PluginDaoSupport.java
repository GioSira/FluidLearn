package org.fluidlearn.core.dao.support;

import java.util.List;

import org.fluidlearn.core.dao.PluginDao;
import org.fluidlearn.core.model.Plugin;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class PluginDaoSupport extends HibernateDaoSupport implements PluginDao {

	@Transactional(readOnly = true)
	public Plugin searchByPK(Long id) {
		Plugin p = getHibernateTemplate().get(Plugin.class, id);
		return p;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Plugin> getAllPlugin() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Plugin");
	}

	@Transactional
	public void insert(Plugin p) {
		getHibernateTemplate().saveOrUpdate(p);

	}

	@Transactional
	public void update(Plugin p) {
		getHibernateTemplate().saveOrUpdate(p);

	}

	@Transactional
	public void delete(Plugin p) {
		getHibernateTemplate().delete(p);

	}

}
