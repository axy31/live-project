package com.project.DAO;

import org.springframework.data.repository.CrudRepository;

import com.project.model.MaterialTransaction;

public interface MaterialTransactionDAOImpl extends  CrudRepository<MaterialTransaction,Long>{
	public interface ProjectDAOImpl extends  CrudRepository<MaterialTransaction,Long>{
		
	}
}
