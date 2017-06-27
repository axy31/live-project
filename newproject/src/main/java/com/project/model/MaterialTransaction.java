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

@Table(name="materialtransaction")
public class MaterialTransaction {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long MaterialTransactionId;
	private String Date;
	private String MaterialTransactionDescription;
	private Integer OpeningBalance;
	private Integer ReceivedToday;
	private Long ReceivedFrom;
	private Long IssuedTo;
	private Integer IssuedToday;
	private String SlipNumber;
	private String ConsumptionToday;
	@ManyToOne
	@JoinColumn(name = "project_id",referencedColumnName="ProjectId",nullable=false,unique=true)
	@JsonBackReference(value="project-transaction")
	private Project projects;
	
	 @ManyToOne
	 @JoinColumn(name = "material_id",referencedColumnName="MaterialId",nullable=false,unique=true)
	 @JsonBackReference(value="material-transaction")
	 private Material materials;

	 @ManyToOne
	 @JoinColumn(name = "places_id",referencedColumnName="PlacesId",nullable=false,unique=true)
	 @JsonBackReference(value="material-places")
	 private Places place;

	
	//constructors
public MaterialTransaction() {
		
	}
	
	public MaterialTransaction(Long materialTransactionId, String date, String materialTransactionDescription,
			Integer openingBalance, Integer receivedToday, Long receivedFrom, Long issuedTo, Integer issuedToday,
			String slipNumber, String consumptionToday) {
		
		MaterialTransactionId = materialTransactionId;
		Date = date;
		MaterialTransactionDescription = materialTransactionDescription;
		OpeningBalance = openingBalance;
		ReceivedToday = receivedToday;
		ReceivedFrom = receivedFrom;
		IssuedTo = issuedTo;
		IssuedToday = issuedToday;
		SlipNumber = slipNumber;
		ConsumptionToday = consumptionToday;
	}
	
	
	//Getters and setters
	public Long getMaterialTransactionId() {
		return MaterialTransactionId;
	}

	public void setMaterialTransactionId(Long materialTransactionId) {
		MaterialTransactionId = materialTransactionId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getMaterialTransactionDescription() {
		return MaterialTransactionDescription;
	}
	public void setMaterialTransactionDescription(String materialTransactionDescription) {
		MaterialTransactionDescription = materialTransactionDescription;
	}
	public Integer getOpeningBalance() {
		return OpeningBalance;
	}
	public void setOpeningBalance(Integer openingBalance) {
		OpeningBalance = openingBalance;
	}
	public Integer getReceivedToday() {
		return ReceivedToday;
	}
	public void setReceivedToday(Integer receivedToday) {
		ReceivedToday = receivedToday;
	}
	public Long getReceivedFrom() {
		return ReceivedFrom;
	}
	public void setReceivedFrom(Long receivedFrom) {
		ReceivedFrom = receivedFrom;
	}
	public Long getIssuedTo() {
		return IssuedTo;
	}
	public void setIssuedTo(Long issuedTo) {
		IssuedTo = issuedTo;
	}
	public Integer getIssuedToday() {
		return IssuedToday;
	}
	public void setIssuedToday(Integer issuedToday) {
		IssuedToday = issuedToday;
	}
	public String getSlipNumber() {
		return SlipNumber;
	}
	public void setSlipNumber(String slipNumber) {
		SlipNumber = slipNumber;
	}
	public String getConsumptionToday() {
		return ConsumptionToday;
	}
	public void setConsumptionToday(String consumptionToday) {
		ConsumptionToday = consumptionToday;
	}
	
	
	
	
	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}
 
	public Material getMaterials() {
		return materials;
	}

	public void setMaterials(Material materials) {
		this.materials = materials;
	}
		
	public Places getPlace() {
		return place;
	}

	public void setPlace(Places place) {
		this.place = place;
	}

	@JsonProperty
	public Long getProjectId() {
	    return projects == null ? null : projects.getProjectId();
	}
	

	@JsonProperty
	public Long getMaterialId() {
	    return materials == null ? null : materials.getMaterialId();
	}
	 
	@JsonProperty
	public Long getPlacesId(){
		return place ==null?null:place.getPlacesId();
	}
	@Override
	public String toString() {
		return "MaterialTransaction [MaterialTransactionId=" + MaterialTransactionId + ", Date=" + Date
				+ ", MaterialTransactionDescription=" + MaterialTransactionDescription + ", OpeningBalance="
				+ OpeningBalance + ", ReceivedToday=" + ReceivedToday + ", ReceivedFrom=" + ReceivedFrom + ", IssuedTo="
				+ IssuedTo + ", IssuedToday=" + IssuedToday + ", SlipNumber=" + SlipNumber + ", ConsumptionToday="
				+ ConsumptionToday + "]";
	}
	
	
}


