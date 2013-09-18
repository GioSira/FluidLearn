package org.fluidlearn.dao;

import java.util.List;

import org.fluidlearn.core.model.Corso;

public interface CorsoDao {

	public Corso searchByPK(Long id);
	
	public List<Corso> getAllCorso();

	public void insert(Corso c);

	public void update(Corso c);

	public void delete(Corso c);
	
}
