package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.unitadidattica.Mappa;

public interface MappaDao {
	
	public Mappa searchByPK(Long id);
	
	public List<Mappa> getAllMappa();

	public void insert(Mappa m);

	public void update(Mappa m);

	public void delete(Mappa m);

}
