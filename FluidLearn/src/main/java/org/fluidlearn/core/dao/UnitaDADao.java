package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.unitadidattica.UnitaDA;

public interface UnitaDADao {

	public UnitaDA searchByPK(Long id);
	
	public List<UnitaDA> getAllUDA();

	public void insert(UnitaDA uda);

	public void update(UnitaDA uda);

	public void delete(UnitaDA uda);
	
}
