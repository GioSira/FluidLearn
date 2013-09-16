package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.unitadidattica.Nodo;

public interface NodoDao {

	public Nodo searchByPK(Long id);
	
	public List<Nodo> getAllNode();

	public void insert(Nodo n);

	public void update(Nodo n);

	public void delete(Nodo n);

}
