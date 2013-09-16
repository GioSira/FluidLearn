package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.Contributo;

public interface ContributoDao {

	public Contributo searchByPK(Long id);
	
	public List<Contributo> getAllContributi();

	public void insert(Contributo r);

	public void update(Contributo r);

	public void delete(Contributo r);
	
}
