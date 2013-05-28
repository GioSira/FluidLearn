package org.fluidlearn.core.dao.support;

import java.util.List;

import org.fluidlearn.core.dao.PersonDao;
import org.fluidlearn.core.model.Person;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class PersonDaoSupport extends HibernateDaoSupport implements PersonDao {

	@Transactional(readOnly = true)
	public Person searchByPK(Long id) {
		Person p = (Person) getHibernateTemplate().get(Person.class, id);
		return p;
	}

	@Transactional
	public void insert(Person p) {
		getHibernateTemplate().saveOrUpdate(p);
	}

	@Transactional
	public void update(Person p) {
		getHibernateTemplate().saveOrUpdate(p);
	}

	@Transactional
	public void delete(Person p) {
		getHibernateTemplate().delete(p);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Person> getAllPerson() {
		return getHibernateTemplate().find("from Person");
	}

}
