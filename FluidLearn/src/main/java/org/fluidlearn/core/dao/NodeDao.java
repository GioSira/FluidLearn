package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.*;

public interface NodeDao {

	public Node searchByPK(Long id);
	
	public List<Node> getAllNode();

	public void insert(Node n);

	public void update(Node n);

	public void delete(Node n);

}
