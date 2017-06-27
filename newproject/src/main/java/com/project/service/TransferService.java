package com.project.service;

import java.util.List;


import com.project.model.Transfer;

public interface TransferService {
	public List<Transfer> create(Transfer transfer1);
	public List<Transfer> getAll();

}
