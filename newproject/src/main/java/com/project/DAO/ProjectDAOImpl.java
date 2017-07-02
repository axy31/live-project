package com.project.DAO;
 
import org.springframework.data.repository.CrudRepository;

import com.project.model.Project;


public interface ProjectDAOImpl extends ProjectDao,CrudRepository<Project,Long>{

	
}
