package com.project.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.model.Project;

public interface ProjectDAOImpl extends ProjectDao,CrudRepository<Project,Long>{

	//Project findByProjectName(String projectName);

	   // @Query("SELECT id FROM Project p p.project_name = ?1")
	    //Project  findByProjectName(String projectName);
}
