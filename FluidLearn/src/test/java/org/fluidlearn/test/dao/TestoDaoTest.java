package org.fluidlearn.test.dao;

import static org.junit.Assert.*;

import org.fluidlearn.core.dao.TestoDao;
import org.fluidlearn.core.model.corpo.Testo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestoDaoTest {

	private ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
    private TestoDao testoDao = (TestoDao) appContext.getBean("testoDao");
	
	Testo testo = new Testo();
	
	@Before
	public void setUp() {
		testo.setId(00123L);
		testo.setTesto("Informatica");
	    testoDao.insert(testo);
	}
	
	@Test
	public void testTitolo() {
		assertEquals(testo.getTesto(), testoDao.searchByPK(00123L).getTesto());
	}
	
	@Test
	public void testDelete() {
		testoDao.delete(testoDao.searchByPK(00123L));
		assert(testoDao.searchByPK(00123L) == null);
	}

}
