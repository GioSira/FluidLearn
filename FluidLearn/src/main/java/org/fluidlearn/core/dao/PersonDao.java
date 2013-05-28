package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.*;

public interface PersonDao {

	public Person searchByPK(Long id);
	
	public List<Person> getAllPerson();

	public void insert(Person p);

	public void update(Person p);

	public void delete(Person p);

}
