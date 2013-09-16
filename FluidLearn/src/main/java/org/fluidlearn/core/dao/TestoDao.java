package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.*;
import org.fluidlearn.core.model.corpo.Testo;

public interface TestoDao {

	public Testo searchByPK(Long id);
	
	public List<Testo> getAllTesto();

	public void insert(Testo t);

	public void update(Testo t);

	public void delete(Testo t);

}
