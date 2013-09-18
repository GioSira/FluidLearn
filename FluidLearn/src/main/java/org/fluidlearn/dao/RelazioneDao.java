package org.fluidlearn.dao;

import java.util.List;

import org.fluidlearn.core.model.unitadidattica.Relazione;

public interface RelazioneDao {
	
	public Relazione searchByPK(Long id);
	
	public List<Relazione> getAllRelazioni();

	public void insert(Relazione r);

	public void update(Relazione r);

	public void delete(Relazione r);

}
