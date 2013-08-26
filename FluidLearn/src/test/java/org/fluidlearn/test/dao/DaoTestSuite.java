package org.fluidlearn.test.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({NodeDaoTest.class, PersonDaoTest.class, PluginDaoTest.class,
	PostDaoTest.class, TestoDaoTest.class, UserDaoTest.class})
public class DaoTestSuite {
}
