package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.DAO.PlacesDAOImpl;
import com.project.model.Material;
import com.project.model.Places;

@Service
public class PlacesServiceImpl implements PlacesService{
	
	@Autowired 
	PlacesDAOImpl  placesDao;
	
	public List<Places> getAll() {
		 
	      List<Places> materials=new ArrayList<>();
		  placesDao.findAll().forEach(materials::add);
		  return materials; 
		  
		}
	
	public List<Places> create(Places places1) {
		   Places places = places1;
		   List<Places> place=new ArrayList<>();
		   place.add(places);
		   System.out.println(places);
		    try {
		     
		     System.out.println("This output before project save : "+places.getPlacesId());
		     placesDao.save(places);
		     System.out.println("This output after project save : "+places.getPlacesId());
		     
		    }
		    catch (Exception ex) { 
		      System.out.println("Error creating the user: " + ex.toString());
		    }
		    System.out.println("User succesfully created! (id = " + places.getPlacesId() + ")");
		    return place;
		  } 

	public List<Places> update(Places places1) {
		   Places places = places1;
		   List<Places> place=new ArrayList<>();
		   place.add(places);
		   System.out.println(places);
		    try {
		     
		     System.out.println("This output before project save : "+places.getPlacesId());
		     placesDao.save(places);
		     System.out.println("This output after project save : "+places.getPlacesId());
		     
		    }
		    catch (Exception ex) { 
		      System.out.println("Error creating the user: " + ex.toString());
		    }
		    System.out.println("User succesfully created! (id = " + places.getPlacesId() + ")");
		    return place;
		  } 
	
	 public List<Places> deletePlaces(Long plid) {
		  
		  List<Places> place=new ArrayList<>();		  
		  place.add(placesDao.findOne(plid));
		  placesDao.delete(plid);
		  return place; 
	  }
}
