package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="inventory")
public class Inventory {
 	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long inventoryId;
private Long materialId;
private Long projectId;
 private Long stock;



public Inventory() {
 
}


public Inventory(Long inventoryId, Long materialId, Long projectId, Long stock) {
	super();
	this.inventoryId = inventoryId;
	this.materialId = materialId;
	this.projectId = projectId;
	this.stock = stock;
}






public Long getInventoryId() {
	return inventoryId;
}

public void setInventoryId(Long inventoryId) {
	this.inventoryId = inventoryId;
}
 
public Long getStock() {
	return stock;
}

public void setStock(Long stock) {
	this.stock = stock;
}


public Long getMaterialId() {
	return materialId;
}


public void setMaterialId(Long materialId) {
	this.materialId = materialId;
}


public Long getProjectId() {
	return projectId;
}


public void setProjectId(Long projectId) {
	this.projectId = projectId;
}
 

}
