package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.Risorsa;

public interface RisorsaDao {

	public Risorsa searchByPK(Long id);
	
	public List<Risorsa> getAllRisorse();

	public void insert(Risorsa r);

	public void update(Risorsa r);

	public void delete(Risorsa r);
	
}
