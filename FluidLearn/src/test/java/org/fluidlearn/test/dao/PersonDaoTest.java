package org.fluidlearn.test.dao;

import static org.junit.Assert.*;

import org.fluidlearn.core.dao.PersonDao;
import org.fluidlearn.core.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonDaoTest {

	private ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
	 private PersonDao personDao = (PersonDao) appContext.getBean("personDao");
		
	private Person person;
	
	@Before
	public void setUp() {
		person = new Person();
		person.setId(004545L);
		person.setName("Luca");
		person.setSurname("Rossi");
	    personDao.insert(person);
	}
	
	@Test
	public void testName() {
		Person p = personDao.searchByPK(004545L);
		assertEquals(p.getName(), person.getName());
	}
	
	@Test
	public void testSurname() {
		Person p = personDao.searchByPK(004545L);
		assertEquals(p.getSurname(), person.getSurname());
	}
	
	@Test
	public void testInsert() {
		Person p = new Person();
		p.setId(004546L);
		p.setName("John");
		p.setSurname("Smith");
		personDao.insert(p);
		assert(personDao.searchByPK(004546L) != null);
	}
	
	@Test
	public void testDelete() {
		Person p = new Person();
		p.setId(004546L);
		p.setName("John");
		p.setSurname("Smith");
		personDao.insert(p);
		personDao.delete(personDao.searchByPK(004546L));
		assert(personDao.searchByPK(004546L) == null);
	}

}
