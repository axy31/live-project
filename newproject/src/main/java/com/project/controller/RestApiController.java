package com.project.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Project;
import com.project.service.ProjectService;
import com.project.service.ProjectServiceImpl;
 

 

@RestController
public class RestApiController {
	
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	ProjectServiceImpl projectService;

  @RequestMapping("/test")  
  public String index()
  {
	  return  projectService.index();
  }
   
  @RequestMapping(value="/",method=RequestMethod.POST)
  public String insert(@RequestBody Project prj)
  {
	  if(prj!=null){
	  System.out.println(prj);
	  return projectService.create(prj);
	  }
	  else return "NULLLLLLLL :(";
  }
  
  @RequestMapping(value="/project",method=RequestMethod.POST)
	public ResponseEntity<Project> update(@RequestBody Project prj){
		if(prj!=null)
		{
			System.out.println(prj.getProjectName());
			
		}		

		return new ResponseEntity<Project>(prj,HttpStatus.OK);		
	}
}
