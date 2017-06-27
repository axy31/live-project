package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.DAO.MaterialDAOImpl; 
import com.project.model.Material;
 



@Service
public class MaterialServiceImpl implements MaterialService{
	
	@Autowired 
	MaterialDAOImpl materialDao; 
	
	public List<Material> getAll() {
		 
	      List<Material> materials=new ArrayList<>();
		  materialDao.findAll().forEach(materials::add);
		  return materials; 
		  
		}
	public List<Material> create(Material material1) {
		   Material material = material1;
		   List<Material> materials=new ArrayList<>();
		   materials.add(material1);
		   System.out.println(material);
		    try {
		     
		     System.out.println("This output before project save : "+material.getMaterialName());
		     materialDao.save(material);
		     System.out.println("This output after project save : "+material.getMaterialName());
		     
		     
		    }
		    catch (Exception ex) { 
		      System.out.println( "Error creating the user: " + ex.toString());
		    }
		    System.out.println("User succesfully created! (id = " + material.getMaterialId() + ")");
		    return  materials;
		  } 
	
	public List<Material> update(Material material1) {
		   Material material = material1;
		   List <Material> materials=new ArrayList<>();
		   materials.add(material1);
		   System.out.println(material);
		    try {
		     
		     System.out.println("This output before project save : "+material.getMaterialName());
		     materialDao.save(material);
		     System.out.println("This output after project save : "+material.getMaterialName());
		     
		    }
		    catch (Exception ex) { 
		      System.out.println("Error creating the user: " + ex.toString());
		    }
		    System.out.println( "User succesfully created! (id = " + material.getMaterialId() + ")");
		    return  materials;
		  } 
	
	 public List<Material> deleteMaterial(Long mid) {
		  
		  List<Material> material=new ArrayList<>();		  
		  try{material.add(materialDao.findOne(mid));
		  materialDao.delete(mid);}
		  catch(Exception e){ System.out.println("Error is "+e);}
		  return material; 
	  }

}



