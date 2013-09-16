package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.compito.Risposta;

public interface RispostaDao {

	public Risposta searchByPK(Long id);
	
	public List<Risposta> getAllRisposte();

	public void insert(Risposta r);

	public void update(Risposta r);

	public void delete(Risposta r);

	public void deleteByID(Long idRisposta);
	
}
