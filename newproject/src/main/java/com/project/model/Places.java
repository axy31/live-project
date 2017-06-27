 
  
  package com.project.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

 @Entity
 @Table(name = "places")
public class Places {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	  
	private Long PlacesId;
    private String ConsumptionToday;
    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL)
    @JsonManagedReference(value="material-places")
    private Set<MaterialTransaction> materialtransaction;
    

    public Places() {
    }

    public Places(String ConsumptionToday) {
        this.ConsumptionToday = ConsumptionToday;
    }

    public String getConsumptionToday() {
        return ConsumptionToday;
    }

    public void setConsumptionToday(String ConsumptionToday) {
        this.ConsumptionToday = ConsumptionToday;
    }

    
    public Long getPlacesId() {
		return PlacesId;
	}

	public void setPlacesId(Long placesId) {
		PlacesId = placesId;
	}

	public Set<MaterialTransaction> getMaterialtransaction() {
		return materialtransaction;
	}

	public void setMaterialtransaction(Set<MaterialTransaction> materialtransaction) {
		this.materialtransaction = materialtransaction;
	}

	@Override
    public String toString() {
        return "Places{" + "ConsumptionToday=" + ConsumptionToday + '}';
    }
    
}
 