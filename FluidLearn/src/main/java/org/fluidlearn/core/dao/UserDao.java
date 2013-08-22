package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.*;

public interface UserDao {

	public User searchByPK(String name);
	
	public List<User> getAllUsers();

	public void insert(User u);

	public void update(User u);

	public void delete(User u);

}
