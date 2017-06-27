package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.DAO.MaterialTransactionDAOImpl;
import com.project.model.Material;
import com.project.model.MaterialTransaction;

@Service
public class MaterialTransactionServiceImpl implements MaterialTransactionService{

	@Autowired 
	MaterialTransactionDAOImpl materialtransactionDao;
	
	
	public List<MaterialTransaction> getAll() {
		 
	      List<MaterialTransaction> materials=new ArrayList<>();
	      materialtransactionDao.findAll().forEach(materials::add);
		  return materials; 
		  
		}


public List<MaterialTransaction> create(MaterialTransaction materialtransaction1) {
	  MaterialTransaction materialtransaction = materialtransaction1;
	  List<MaterialTransaction> materialtransactions=new ArrayList<>();
	  materialtransactions.add(materialtransaction1);
	   System.out.println(materialtransaction);
	    try {
	     
	     System.out.println("This output before project save : "+materialtransaction.getMaterialTransactionId());
	     materialtransactionDao.save(materialtransaction);
	     System.out.println("This output after project save : "+materialtransaction.getMaterialTransactionId());
	     
	    }
	    catch (Exception ex) { 
	      System.out.println("Error creating the user: " + ex.toString());
	    }
	    System.out.println("User succesfully created! (id = " + materialtransaction.getMaterialTransactionId() + ")");
	    return  materialtransactions;
	  } 

public List<MaterialTransaction> update(MaterialTransaction materialtransaction1) {
	  MaterialTransaction materialtransaction = materialtransaction1;
	  List<MaterialTransaction> materialtransactions=new ArrayList<>();
	  materialtransactions.add(materialtransaction1);
	   System.out.println(materialtransaction);
	    try {
	     
	     System.out.println("This output before project save : "+materialtransaction.getMaterialTransactionId());
	     materialtransactionDao.save(materialtransaction);
	     System.out.println("This output after project save : "+materialtransaction.getMaterialTransactionId());
	     
	    }
	    catch (Exception ex) { 
	      System.out.println("Error creating the user: " + ex.toString());
	    }
	    System.out.println("User succesfully created! (id = " + materialtransaction.getMaterialTransactionId() + ")");
	    return  materialtransactions;
	  } 


public List<MaterialTransaction> deleteMaterialTransaction(Long mtid) {
	  
	  List<MaterialTransaction> materialtransaction=new ArrayList<>();		  
	  try{materialtransaction.add(materialtransactionDao.findOne(mtid));
	  materialtransactionDao.delete(mtid);}
	  catch(Exception e){ System.out.println("Error is "+e);}
	  return materialtransaction; 
}
}