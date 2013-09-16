package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.attori.Ruolo;

public interface RuoloDao {

	public Ruolo searchByPK(Long id);
	
	public List<Ruolo> getAllRuoli();

	public void insert(Ruolo r);

	public void update(Ruolo r);

	public void delete(Ruolo r);
	
}
