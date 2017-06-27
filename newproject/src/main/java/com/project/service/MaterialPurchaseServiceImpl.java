package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.MaterialPurchaseDAOImpl;
import com.project.model.Material;
import com.project.model.MaterialPurchase;
import com.project.model.Project;


@Service
public class MaterialPurchaseServiceImpl implements MaterialPurchaseService{
	@Autowired 
	MaterialPurchaseDAOImpl materialPurchaseDao;
	
  public List<MaterialPurchase> getAll() {
	 
      List<MaterialPurchase> materialpurchases=new ArrayList<>();
      System.out.println("/n enter into method");
      materialPurchaseDao.findAll().forEach(materialpurchases::add);
      System.out.println("/n "+materialpurchases.toString());
	  return materialpurchases; 
	  
	}

  public List<MaterialPurchase> create(MaterialPurchase materialpurchase1) {
	  MaterialPurchase materialpurchase = materialpurchase1;
	  List<MaterialPurchase> materialpurchases=new ArrayList<>();
	  materialpurchases.add(materialpurchase1);
	   System.out.println(materialpurchase);
	    try {
	     
	     System.out.println("This output before project save : "+materialpurchase.getPurchaseId());
	     materialPurchaseDao.save(materialpurchase);
	     System.out.println("This output after project save : "+materialpurchase.getPurchaseId());
	     
	    }
	    catch (Exception ex) { 
	      System.out.println("Error creating the user: " + ex.toString());
	    }
	   System.out.println("User succesfully created! (id = " + materialpurchase.getPurchaseId() + ")");
	   return materialpurchases;
	  } 
  public List<MaterialPurchase> update(MaterialPurchase materialpurchase1) {
	  MaterialPurchase materialpurchase = materialpurchase1;
	  List<MaterialPurchase> materialpurchases=new ArrayList<>();
	  materialpurchases.add(materialpurchase1);
	   System.out.println(materialpurchase);
	    try {
	     
	     System.out.println("This output before project save : "+materialpurchase.getPurchaseId());
	     materialPurchaseDao.save(materialpurchase);
	     System.out.println("This output after project save : "+materialpurchase.getPurchaseId());
	     
	    }
	    catch (Exception ex) { 
	      System.out.println("Error creating the user: " + ex.toString());
	    }
	   System.out.println("User succesfully created! (id = " + materialpurchase.getPurchaseId() + ")");
	   return materialpurchases;
	  } 
  
  
  public List<MaterialPurchase> deleteMaterialPurchase(Long mpid) {
	  
	  List<MaterialPurchase> materialpurchase=new ArrayList<>();		  
	  materialpurchase.add(materialPurchaseDao.findOne(mpid));
	  materialPurchaseDao.delete(mpid);
	  return materialpurchase; 
  }
}
