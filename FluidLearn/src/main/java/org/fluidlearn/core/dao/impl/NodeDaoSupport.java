package org.fluidlearn.core.dao.impl;

import java.util.List;

import org.fluidlearn.core.dao.NodeDao;
import org.fluidlearn.core.model.Node;
import org.fluidlearn.core.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("stockDao")
public class NodeDaoSupport extends CustomHibernateDaoSupport implements NodeDao {

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
