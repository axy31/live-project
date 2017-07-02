
  
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

@Table(name="materialpurchase")
public class MaterialPurchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long PurchaseId;	
	private String Date;
	private String BillNumber;
	private String UnitOfMeasurement;
	private Integer Quantity;
	private Integer PerUnitPrice;	
	
	 @ManyToOne
	 @JoinColumn(name = "project_id",referencedColumnName="ProjectId",nullable=false)
	 @JsonBackReference(value="project-purchase")
	 private Project projects;
	
	 @ManyToOne
	 @JoinColumn(name = "material_id",referencedColumnName="MaterialId",nullable=false)
	 @JsonBackReference(value="material-purchase")
	 private Material materials;
	 
	public MaterialPurchase( ) {
		 
	}
	
	public MaterialPurchase(Long purchaseId, String date, String billNumber, String unitOfMeasurement, Integer quantity,
			Integer perUnitPrice) { 
		PurchaseId = purchaseId;
		Date = date;
		BillNumber = billNumber;
		UnitOfMeasurement = unitOfMeasurement;
		Quantity = quantity;
		PerUnitPrice = perUnitPrice;
	}
	public Long getPurchaseId() {
		return PurchaseId;
	}
	public void setPurchaseId(Long purchaseId) {
		PurchaseId = purchaseId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getBillNumber() {
		return BillNumber;
	}
	public void setBillNumber(String billNumber) {
		BillNumber = billNumber;
	}
	public String getUnitOfMeasurement() {
		return UnitOfMeasurement;
	}
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		UnitOfMeasurement = unitOfMeasurement;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public Integer getPerUnitPrice() {
		return PerUnitPrice;
	}
	public void setPerUnitPrice(Integer perUnitPrice) {
		PerUnitPrice = perUnitPrice;
	}
	
	
	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project project) {
		this.projects = project;
	}

	public Material getMaterials() {
		return materials;
	}

	public void setMaterials(Material materials) {
		this.materials = materials;
	}

	@JsonProperty
	public Long getProjectId() {
	    return projects == null ? null : projects.getProjectId();
	}
	

	@JsonProperty
	public Long getMaterialId() {
	    return materials == null ? null : materials.getMaterialId();
	}
	
		
}
