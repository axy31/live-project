package com.project.service;

import java.util.List;


import com.project.model.MaterialPurchase;

public interface MaterialPurchaseService {
	public List<MaterialPurchase> create(MaterialPurchase materialpurchase1);
	public List<MaterialPurchase> getAll();

}
