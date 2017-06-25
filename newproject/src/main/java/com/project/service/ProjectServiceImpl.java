package com.project.service;
 
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.project.DAO.ProjectDAOImpl;
import com.project.model.Project;
import com.project.service.ProjectService;
import java.util.List;


@Service
public class ProjectServiceImpl implements ProjectService {
	public String index() 
	{
		  return "LIVE PROJECT G#1";
	}
	
	@Autowired 
	ProjectDAOImpl projectDao;
	
  public List<Project> getAll() {
	 
      List<Project> projects=new ArrayList<>();
	  projectDao.findAll().forEach(projects::add);
	  return projects; 
	  
	}
  
  public Project findByProjectName(String ProjectName)
  {
	  //return projects.stream().filter(t->t.getProjectName().equals(Pname)).findFirst.get();
	  return projectDao.findOne((long) 1);
	  //return projectDao.findByProjectName(ProjectName);
	  
  }
	
  public List<Project> create(Project project1) {
	   Project project = project1;
	   List <Project> projects=new ArrayList<>();
	   projects.add(project1);
	   System.out.println(project);
	    try {
	     
	     System.out.println("This output before project save : "+project.getProjectName());
	     projectDao.save(project);
	     System.out.println("This output after project save : "+project.getProjectName());
	     
	    }
	    catch (Exception ex) { 
	      System.out.println("Error creating the user: " + ex.toString());
	    }
	    System.out.println( "User succesfully created! (id = " + project.getProjectId() + ")");
	    return  projects;
	  } 

  public List<Project> update(Project project1) {
	   Project project = project1;
	   List <Project> projects=new ArrayList<>();
	   projects.add(project1);
	   System.out.println(project);
	    try {
	     
	     System.out.println("This output before project save : "+project.getProjectName());
	     projectDao.save(project);
	     System.out.println("This output after project save : "+project.getProjectName());
	     
	    }
	    catch (Exception ex) { 
	      System.out.println("Error creating the user: " + ex.toString());
	    }
	    System.out.println( "User succesfully created! (id = " + project.getProjectId() + ")");
	    return  projects;
	  } 
  
  public List<Project> delete(Long pid) {
	  
	  List<Project> projects=new ArrayList<>();
	  projects.add(projectDao.findOne(pid));
	  projectDao.delete(pid);
	  return projects; 
  }

}
