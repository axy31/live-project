package com.project.DAO;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Places;

public interface PlacesDAOImpl extends CrudRepository<Places,Long>{

	public interface ProjectDAOImpl extends CrudRepository<Places,Long>{
		
	}
}
