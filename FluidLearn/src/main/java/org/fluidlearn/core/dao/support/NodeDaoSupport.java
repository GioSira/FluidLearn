package org.fluidlearn.core.dao.support;

import java.util.List;

import org.fluidlearn.core.dao.NodeDao;
import org.fluidlearn.core.model.Node;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class NodeDaoSupport extends HibernateDaoSupport implements NodeDao {

	@Transactional(readOnly = true)
	public Node searchByPK(Long id) {
		Node n = getHibernateTemplate().get(Node.class, id);
		return n;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Node> getAllNode() {
		return getHibernateTemplate().find("from Node");
	}

	@Transactional
	public void insert(Node n) {
		getHibernateTemplate().saveOrUpdate(n);
		
	}

	@Transactional
	public void update(Node n) {
		getHibernateTemplate().saveOrUpdate(n);
		
	}

	@Transactional
	public void delete(Node n) {
		getHibernateTemplate().delete(n);
		
	}



}
