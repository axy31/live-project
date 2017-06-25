package com.project.service;

import java.util.List;

import com.project.model.Project;

public interface ProjectService {

	
	String index();
	public List<Project> create(Project project1);
	public List<Project> getAll();
	public Project findByProjectName(String ProjectName);
}
