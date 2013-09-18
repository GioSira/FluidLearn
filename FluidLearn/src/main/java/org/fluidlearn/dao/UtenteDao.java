package org.fluidlearn.dao;

import java.util.List;

import org.fluidlearn.core.model.*;
import org.fluidlearn.core.model.attori.Utente;

public interface UtenteDao {

	public Utente searchByPK(long id);
	
	public List<Utente> getAllUsers();

	public void insert(Utente u);

	public void update(Utente u);

	public void delete(Utente u);

}
