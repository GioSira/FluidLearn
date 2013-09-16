package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.corpo.Corpo;

public interface CorpoDao {
	
	public Corpo searchByPK(Long id);
	
	public List<Corpo> getAllCorpi();

	public void insert(Corpo c);

	public void update(Corpo c);

	public void delete(Corpo c);

}
