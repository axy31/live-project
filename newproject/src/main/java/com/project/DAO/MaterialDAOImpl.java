package com.project.DAO;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Material;

 
public interface MaterialDAOImpl extends MaterialDao,CrudRepository<Material,Long>{

	public interface ProjectDAOImpl extends MaterialDao,CrudRepository<Material,Long>{
		
	}
}
