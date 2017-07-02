package com.project.DAO; 
import org.springframework.data.repository.CrudRepository; 
import com.project.model.MaterialPurchase;

public interface MaterialPurchaseDAOImpl extends CrudRepository<MaterialPurchase,Long>{

	public interface ProjectDAOImpl extends CrudRepository<MaterialPurchase,Long>{
	 
		
	}
 
}
