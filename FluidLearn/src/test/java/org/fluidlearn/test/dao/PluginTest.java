package org.fluidlearn.test.dao;

import org.fluidlearn.core.dao.PluginDao;
import org.fluidlearn.core.model.Plugin;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PluginTest extends TestCase {

	private BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));
    private PluginDao pluginDao = (PluginDao) ctx.getBean("pluginDaoProxy");
	
	protected Plugin plugin;
	
	public PluginTest(String name) {
		super(name);
		plugin = new Plugin();
	}
	
	protected void setUp() {
		plugin.setId(000157L);
		plugin.setName("Facebook");
		plugin.setType("Application");
		plugin.setPath("/A/B/C/D");
	    pluginDao.insert(plugin);
	}
	
	public static Test suite() {
		return new TestSuite(PluginTest.class);
	}
	
	public void testName() {
		assertEquals(pluginDao.searchByPK(000157L).getName(), plugin.getName());
	}
	
	public void testType() {
		assertEquals(pluginDao.searchByPK(000157L).getType(), plugin.getType());
	}
	
	public void testPath() {
		assertEquals(pluginDao.searchByPK(000157L).getPath(), plugin.getPath());
	}
	
	public void testDelete() {
		pluginDao.delete(pluginDao.searchByPK(00157L));
		assert(pluginDao.searchByPK(000157L) == null);
	}
	
}
