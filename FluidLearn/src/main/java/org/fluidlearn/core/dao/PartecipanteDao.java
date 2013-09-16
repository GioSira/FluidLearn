package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.attori.Partecipante;

public interface PartecipanteDao {
	
	public Partecipante searchByPK(Long id);
	
	public List<Partecipante> getAllPartecipanti();

	public void insert(Partecipante part);
	
	public void update(Partecipante part);
	
	public void delete(Partecipante part);
	
}
