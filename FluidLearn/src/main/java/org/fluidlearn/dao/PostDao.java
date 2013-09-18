package org.fluidlearn.dao;

import java.util.List;

import org.fluidlearn.core.model.*;

public interface PostDao {

	public Post searchByPK(Long id);
	
	public List<Post> getAllPost();

	public void insert(Post p);

	public void update(Post p);

	public void delete(Post p);

}