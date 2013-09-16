package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.Prototipo;

public interface PrototipoDao {

	public Prototipo searchByPK(Long id);
	
	public List<Prototipo> getAllPrototipi();

	public void insert(Prototipo p);

	public void update(Prototipo p);

	public void delete(Prototipo p);
	
}
