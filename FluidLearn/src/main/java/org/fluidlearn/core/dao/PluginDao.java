package org.fluidlearn.core.dao;

import java.util.List;

import org.fluidlearn.core.model.*;
import org.fluidlearn.core.model.corpo.Plugin;

public interface PluginDao {

	public Plugin searchByPK(Long id);
	
	public List<Plugin> getAllPlugin();

	public void insert(Plugin p);

	public void update(Plugin p);

	public void delete(Plugin p);

}