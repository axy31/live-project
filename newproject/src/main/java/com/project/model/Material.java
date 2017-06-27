 
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
@Table(name = "material")
public class Material {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	  
    private Long MaterialId;
    private String MaterialName;
    private String MaterialDescription;
    private String MaterialCategory;
    private String UnitOfMesurement;

    @OneToMany(mappedBy = "materials", cascade = CascadeType.ALL) 
    @JsonManagedReference(value="material-purchase")
    private Set<MaterialPurchase> materialpurchase;
    
    @OneToMany(mappedBy = "materials", cascade = CascadeType.ALL)
    @JsonManagedReference(value="material-transfer")
    private Set<Transfer> transfer;
    
    @OneToMany(mappedBy = "materials", cascade = CascadeType.ALL)
    @JsonManagedReference(value="material-transaction")
    private Set<MaterialTransaction> materialtransaction;
    
    public Material() {
    }
    
    
    
    public Material(Long MaterialId, String MaterialName, String MaterialDescription, String MaterialCategory, String UnitOfMesurement) {
        this.MaterialId = MaterialId;
        this.MaterialName = MaterialName;
        this.MaterialDescription = MaterialDescription;
        this.MaterialCategory = MaterialCategory;
        this.UnitOfMesurement = UnitOfMesurement;
    }
    
    public Long getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(Long MaterialId) {
        this.MaterialId = MaterialId;
    }

   

    public String getMaterialName() {
		return MaterialName;
	}



	public void setMaterialName(String materialName) {
		MaterialName = materialName;
	}



	public String getMaterialDescription() {
        return MaterialDescription;
    }

    public void setMaterialDescription(String MaterialDescription) {
        this.MaterialDescription = MaterialDescription;
    }

    public String getMaterialCategory() {
        return MaterialCategory;
    }

    public void setMaterialCategory(String MaterialCategory) {
        this.MaterialCategory = MaterialCategory;
    }

    public String getUnitOfMesurement() {
        return UnitOfMesurement;
    }

    public void setUnitOfMesurement(String UnitOfMesurement) {
        this.UnitOfMesurement = UnitOfMesurement;
    }

    
    
    public Set<MaterialPurchase> getMaterialpurchase() {
		return materialpurchase;
	}



	public void setMaterialpurchase(Set<MaterialPurchase> materialpurchase) {
		this.materialpurchase = materialpurchase;
	}



	public Set<Transfer> getTransfer() {
		return transfer;
	}



	public void setTransfer(Set<Transfer> transfer) {
		this.transfer = transfer;
	}

	

	public Set<MaterialTransaction> getMaterialtransaction() {
		return materialtransaction;
	}



	public void setMaterialtransaction(Set<MaterialTransaction> materialtransaction) {
		this.materialtransaction = materialtransaction;
	}



	@Override
    public String toString() {
        return "Material{" + "MaterialId=" + MaterialId + ", MaterialNmae=" + MaterialName + ", MaterialDescription=" + MaterialDescription + ", MaterialCategory=" + MaterialCategory + ", UnitOfMesurement=" + UnitOfMesurement + '}';
    }
    
}
 