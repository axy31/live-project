 
  
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
@Table(name = "transfer")
public class Transfer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	  
	private Long TransferId;
    private Long TransferTo;
    private Long TransferFrom;
    private String TransferDate;
    private int Quantity;
    private String TransferDescription;
    
    @ManyToOne
	@JoinColumn(name = "material_id",referencedColumnName="MaterialId",nullable=false,unique=true)
    @JsonBackReference(value="material-transfer")
    private Material materials;

    public Transfer() {
    }

    public Transfer(Long TransferTo, Long TransferFrom, String TransferDate, int Quantity, String TransferDescription) {
        this.TransferTo = TransferTo;
        this.TransferFrom = TransferFrom;
        this.TransferDate = TransferDate;
        this.Quantity = Quantity;
        this.TransferDescription = TransferDescription;
    }
    
    
    public Long getTransferId() {
		return TransferId;
	}

	public void setTransferId(Long transferId) {
		TransferId = transferId;
	}

	public Long getTransferTo() {
        return TransferTo;
    }

    public void setTransferTo(Long TransferTo) {
        this.TransferTo = TransferTo;
    }

    public Long getTransferFrom() {
        return TransferFrom;
    }

    public void setTransferFrom(Long TransferFrom) {
        this.TransferFrom = TransferFrom;
    }

    public String getTransferDate() {
        return TransferDate;
    }

    public void setTransferDate(String TransferDate) {
        this.TransferDate = TransferDate;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getTransferDescription() {
        return TransferDescription;
    }

    public void setTransferDescription(String TransferDescription) {
        this.TransferDescription = TransferDescription;
    }
     
    public Material getMaterials() {
		return materials;
	}

	public void setMaterials(Material materials) {
		this.materials = materials;
	}
	
  	@JsonProperty
	public Long getMaterialId() {
	    return materials == null ? null : materials.getMaterialId();
	}
	
		
	@Override
    public String toString() {
        return "Transfer{" + "TransferTo=" + TransferTo + ", TransferFrom=" + TransferFrom + ", TransferDate=" + TransferDate + ", Quantity=" + Quantity + ", TransferDescription=" + TransferDescription + '}';
    }
    
    
    
} 