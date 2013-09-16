package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.compito.*;

public interface SollecitazioneDao {

	public Sollecitazione searchByPK(Long id);
	
	public List<Sollecitazione> getAllSollecitazione();

	public void insert(Sollecitazione s);

	public void update(Sollecitazione s);

	public void delete(Sollecitazione s);
	
	public void deleteByID(Long id);
	
}
