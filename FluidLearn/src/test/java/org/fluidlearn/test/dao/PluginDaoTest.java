package org.fluidlearn.test.dao;

import static org.junit.Assert.*;

import org.fluidlearn.core.model.corpo.Plugin;
import org.fluidlearn.dao.PluginDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PluginDaoTest {

	private ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/beans.xml");
	 private PluginDao pluginDao = (PluginDao) appContext.getBean("pluginDao");
	 
	 private Plugin plugin = new Plugin();
	 
	 @Before
	 public void setUp() {
		 plugin.setId(000157L);
		 plugin.setName("Facebook");
		 plugin.setType("Application");
		 plugin.setPath("/A/B/C/D");
		 pluginDao.insert(plugin);
	 }
	
	@Test
	public void testName() {
		assertEquals(pluginDao.searchByPK(000157L).getName(), plugin.getName());
	}

	@Test
	public void testType() {
		assertEquals(pluginDao.searchByPK(000157L).getType(), plugin.getType());
	}

	@Test
	public void testPath() {
		assertEquals(pluginDao.searchByPK(000157L).getPath(), plugin.getPath());
	}

	@Test
	public void testDelete() {
		pluginDao.delete(pluginDao.searchByPK(00157L));
		assert (pluginDao.searchByPK(000157L) == null);
	}

}
