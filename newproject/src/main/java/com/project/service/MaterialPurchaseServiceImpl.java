package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.InventoryDAOImpl;
import com.project.DAO.MaterialPurchaseDAOImpl;
import com.project.model.Inventory;
import com.project.model.Material;
import com.project.model.MaterialPurchase;
import com.project.model.Project; 


@Service
public class MaterialPurchaseServiceImpl implements MaterialPurchaseService{
	@Autowired 
	MaterialPurchaseDAOImpl materialPurchaseDao;
	@Autowired
	InventoryDAOImpl inventoryDao;
  public List<MaterialPurchase> getAll() {
	 
      List<MaterialPurchase> materialpurchases=new ArrayList<>();
      System.out.println("/n enter into method");
      long id=(long) 1;
	  Inventory i=new Inventory();
	  i=inventoryDao.findByProjectIdAndMaterialId(id,id);
	  System.out.println("This is inventory id"+i.getInventoryId());
      
      
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
		 Inventory i=new Inventory();
		 i=inventoryDao.findByProjectIdAndMaterialId(materialpurchase.getProjectId(), materialpurchase.getProjectId()) ;
	     System.out.println("Stock before material purchase"+i.getStock());
		 i.setStock(i.getStock()+materialpurchase.getQuantity());
		 System.out.println("Stock after material purchase"+i.getStock());
		 materialPurchaseDao.save(materialpurchase);     
	     System.out.println("This output after project save : "+materialpurchase.getPurchaseId());
	     
	    }
	    catch (Exception ex) { 
	      System.out.println("Error creating material purchase : " + ex.toString());
	    }
	   System.out.println("Material purchase succesfully created! (id = " + materialpurchase.getPurchaseId() + ")");
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
