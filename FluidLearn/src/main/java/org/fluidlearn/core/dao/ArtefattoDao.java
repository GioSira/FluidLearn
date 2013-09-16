package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.corpo.Artefatto;

public interface ArtefattoDao {
	
	public Artefatto searchByPK(Long id);
	
	public List<Artefatto> getAllArtefatti();

	public void insert(Artefatto a);

	public void update(Artefatto a);

	public void delete(Artefatto a);

}
