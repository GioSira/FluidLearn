package org.fluidlearn.test.dao;

import org.fluidlearn.core.dao.PersonDao;
import org.fluidlearn.core.model.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PersonTest extends TestCase {
	
	 private BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));
	    private PersonDao personDao = (PersonDao) ctx.getBean("personDaoProxy");
		
		protected Person person;
		
		public PersonTest(String name) {
			super(name);
			person = new Person();
		}
		
		protected void setUp() {
			person.setId(004545L);
			person.setName("Luca");
			person.setSurname("Rossi");
		    personDao.insert(person);
		}
		
		public static Test suite() {
			return new TestSuite(PersonTest.class);
		}
		
		public void testName() {
			Person p = personDao.searchByPK(004545L);
			assertEquals(p.getName(), person.getName());
		}
		
		public void testSurname() {
			Person p = personDao.searchByPK(004545L);
			assertEquals(p.getSurname(), person.getSurname());
		}
		
		public void testInsert() {
			Person p = new Person();
			p.setId(004546L);
			p.setName("John");
			p.setSurname("Smith");
			personDao.insert(p);
			assert(personDao.searchByPK(004546L) != null);
		}
		
		public void testDelete() {
			personDao.delete(personDao.searchByPK(004546L));
			assert(personDao.searchByPK(004546L) == null);
		}
		

}
