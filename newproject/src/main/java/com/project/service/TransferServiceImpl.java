package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.DAO.TransferDAOImpl;
import com.project.model.Places;
import com.project.model.Transfer;

@Service
public class TransferServiceImpl implements TransferService{
	
	@Autowired 
	TransferDAOImpl TransferDao;
	
	public List<Transfer> getAll() {
		 
	      List<Transfer> transfer=new ArrayList<>();
		  TransferDao.findAll().forEach(transfer::add);
		  return transfer; 
		  
		}

	public List<Transfer> create(Transfer transfer1) {
		   Transfer transfer = transfer1;
		   List<Transfer> transfers=new ArrayList<>();
		   transfers.add(transfer1);
		   System.out.println(transfer);
		    try {
		     
		     System.out.println("This output before project save : "+transfer.getTransferId());
		     TransferDao.save(transfer);
		     System.out.println("This output after project save : "+transfer.getTransferId());
		     
		    }
		    catch (Exception ex) { 
		      System.out.println("Error creating the user: " + ex.toString());
		    }
		    System.out.println("User succesfully created! (id = " + transfer.getTransferId() + ")");
		    return transfers;
		  } 
	
	public List<Transfer> update(Transfer transfer1) {
		   Transfer transfer = transfer1;
		   List<Transfer> transfers=new ArrayList<>();
		   transfers.add(transfer1);
		   System.out.println(transfer);
		    try {
		     
		     System.out.println("This output before project save : "+transfer.getTransferId());
		     TransferDao.save(transfer);
		     System.out.println("This output after project save : "+transfer.getTransferId());
		     
		    }
		    catch (Exception ex) { 
		      System.out.println("Error creating the user: " + ex.toString());
		    }
		    System.out.println("User succesfully created! (id = " + transfer.getTransferId() + ")");
		    return transfers;
		  } 
	
	public List<Transfer> deleteTransfer(Long tid) {
		  
		  List<Transfer> transfer=new ArrayList<>();		  
		  transfer.add(TransferDao.findOne(tid));
		  TransferDao.delete(tid);
		  return transfer; 
	  }
	
}
