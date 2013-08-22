package org.fluidlearn.test.dao;

import org.fluidlearn.core.dao.TestoDao;
import org.fluidlearn.core.model.Testo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestoTest extends TestCase {

	private BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));
    private TestoDao testoDao = (TestoDao) ctx.getBean("testoDaoProxy");
	
	protected Testo testo;
	
	public TestoTest(String name) {
		super(name);
		testo = new Testo();
	}
	
	protected void setUp() {
		testo.setId(00123L);
		testo.setTitolo("Informatica");
		testo.setDescrizione("Lorem Ipsum Sit Dolor Amet...");
	    testoDao.insert(testo);
	}
	
	public static Test suite() {
		return new TestSuite(TestoTest.class);
	}
	
	public void testTitolo() {
		assertEquals(testo.getTitolo(), testoDao.searchByPK(00123L).getTitolo());
	}
	
	public void testDescrizione() {
		assertEquals(testo.getDescrizione(), testoDao.searchByPK(00123L).getDescrizione());
	}
	
	public void testDelete() {
		testoDao.delete(testoDao.searchByPK(00123L));
		assert(testoDao.searchByPK(00123L) == null);
	}
	
}
