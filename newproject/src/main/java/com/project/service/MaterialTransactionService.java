package com.project.service;

import java.util.List;

import com.project.model.MaterialTransaction;

public interface MaterialTransactionService {
	
	public List<MaterialTransaction> create(MaterialTransaction materialtransaction1);
	public List<MaterialTransaction> getAll();
}
