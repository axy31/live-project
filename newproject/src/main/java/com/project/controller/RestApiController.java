package com.project.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
	
  @CrossOrigin
  @RequestMapping("/test")  
  public String index()
  {
	  return  projectService.index();
  }
   
  @CrossOrigin
  @RequestMapping(value="/project",method=RequestMethod.GET)
   public List<Project> getAll()
   {
	  System.out.println("in get all");
	  return projectService.getAll();
   }
  
  @CrossOrigin
  @RequestMapping(value="/project/{pname}",method=RequestMethod.GET)
   public Project getProject(@PathVariable String pname)
   {
	  System.out.println("in get project");
	  return projectService.findByProjectName(pname);
   }  
  
  
  @CrossOrigin
  @RequestMapping(value="/project",method=RequestMethod.POST,produces = "application/json")
  public String insert(@RequestBody Project prj)
  {
	  if(prj!=null){
		  System.out.println(prj);	
		  return projectService.create(prj);
	  }
	  else return "NULLLLLLLL :(";
  }
  
  @CrossOrigin
  @RequestMapping(value="/",method=RequestMethod.POST)
	public ResponseEntity<Project> update(@RequestBody Project prj){
		if(prj!=null)
		{
			System.out.println(prj.getProjectName());
			
		}		

		return new ResponseEntity<Project>(prj,HttpStatus.OK);		
	}
}
