package com.project.DAO; 

import org.springframework.data.repository.CrudRepository;

import com.project.model.Inventory;

public interface InventoryDAOImpl extends CrudRepository<Inventory,Long>{
public Inventory  findByProjectIdAndMaterialId(long id,long pid);
}
