package org.fluidlearn.core.common;

import org.fluidlearn.core.dao.PersonDao;
import org.fluidlearn.core.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonComm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

    	ApplicationContext appContext = 
        		new ClassPathXmlApplicationContext("spring/config/beans.xml");
    	
        PersonDao personDao = (PersonDao)appContext.getBean("personDao");
        
        /*insert*/
        Person person = new Person();
        person.setId(000154L);
        person.setName("Giovanni");
        person.setSurname("Siragusa");
		personDao.insert(person);
        System.out.println(person);
        
        /* test stampa */
        Person p = (Person) personDao.searchByPK(000154L);
        System.out.println(p);
        System.out.println("Expected: " + person);
        
        /*update*/
        Person p2 = personDao.searchByPK(000154L);
        p2.setName("John");
        personDao.update(p2);
        System.out.println(p2);
        
        /*delete*/
		personDao.delete(p2);

	}

}
