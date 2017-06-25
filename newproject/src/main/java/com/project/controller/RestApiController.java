package com.project.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Material;
import com.project.model.MaterialPurchase;
import com.project.model.MaterialTransaction;
import com.project.model.Places;
import com.project.model.Project;
import com.project.model.Transfer;
import com.project.service.MaterialPurchaseServiceImpl;
import com.project.service.MaterialServiceImpl;
import com.project.service.MaterialTransactionServiceImpl;
import com.project.service.PlacesServiceImpl;
import com.project.service.ProjectServiceImpl;
import com.project.service.TransferServiceImpl;
 

 

@RestController
public class RestApiController {
	
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	ProjectServiceImpl projectService;

	@Autowired
	MaterialServiceImpl materialService;
	

	@Autowired
	MaterialPurchaseServiceImpl materialPurchaseService;

	@Autowired
	MaterialTransactionServiceImpl materialTransactionService;

	@Autowired
	PlacesServiceImpl placesService;
	
	@Autowired
	TransferServiceImpl transferService;

  @CrossOrigin
  @RequestMapping("/test")  
  public String index()
  {
	  return  projectService.index();
  }
   
  @CrossOrigin
  @RequestMapping(value="/project",method=RequestMethod.GET)
   public List<Project> getAllProject()
   {
	  System.out.println("in controller get all projects ");
	  return projectService.getAll();
   }
  
  
  @CrossOrigin
  @RequestMapping(value="/material",method=RequestMethod.GET)
   public List<Material> getAllMaterial()
   {
	  System.out.println("in controller get all Material");
	  return materialService.getAll();
   }
  
  
  
  @CrossOrigin
  @RequestMapping(value="/project/{pname}",method=RequestMethod.GET)
   public Project getProject(@PathVariable String pname)
   {
	  System.out.println("in controller get project by name");
	  return projectService.findByProjectName(pname);
   }  
  
  
  @CrossOrigin
  @RequestMapping(value="/project",method=RequestMethod.POST,produces = "application/json")
  public List<Project> insert(@RequestBody Project prj)
  {
	  System.out.println("in controller POST project");
	  if(prj!=null){
		  System.out.println(prj);	
		  return projectService.create(prj);
	  }
	return null ; 
  }
  
  @CrossOrigin
  @RequestMapping(value="/project/{pid}",method=RequestMethod.DELETE,produces = "application/json")
  public List<Project> delete(@PathVariable Long pid)
  {
	     System.out.println("/nin controller delete project :"+ pid);	
	     return projectService.delete(pid);
	  
  }
  
  
  @CrossOrigin
  @RequestMapping(value="/project",method=RequestMethod.PUT,produces = "application/json")
  public List<Project> update(@RequestBody Project prj)
  {   System.out.println("/nin controller update project :"+ prj);
	  if(prj!=null){
		  System.out.println(prj);	
		  return projectService.create(prj);
	  }
	return null ; 
  }
  


  
  @CrossOrigin
  @RequestMapping(value="/material",method=RequestMethod.POST,produces = "application/json")
  public List<Material> insert(@RequestBody Material mtrl)
  {
	  System.out.println("/nin controller POST material:"+ mtrl);
	  if(mtrl!=null){
		  System.out.println(mtrl);	
		  return materialService.create(mtrl);
	  }
	  else return null;
  }
  
  @CrossOrigin
  @RequestMapping(value="/material",method=RequestMethod.PUT,produces = "application/json")
  public List<Material> update(@RequestBody Material mtrl)
  {
	  System.out.println("/nin controller Update material:"+ mtrl);
	  if(mtrl!=null){
		  System.out.println(mtrl);	
		  return materialService.create(mtrl);
	  }
	  return null ; 
  }
  
  @CrossOrigin
  @RequestMapping(value="/material/{mid}",method=RequestMethod.DELETE,produces = "application/json")
  public List<Material> deleteMaterial(@PathVariable Long mid)
  {
	  System.out.println("/nin controller delete material :"+ mid);	
	     return materialService.deleteMaterial(mid); 
	  
  }
  
  @CrossOrigin
  @RequestMapping(value="/materialPurchase",method=RequestMethod.GET)
   public List<MaterialPurchase> getAllMaterialPurchase()
   {
	  System.out.println("in controller get all material purchase");
	  return materialPurchaseService.getAll();
   }
  
  @CrossOrigin
  @RequestMapping(value="/materialPurchase",method=RequestMethod.POST,produces = "application/json")
  public List<MaterialPurchase> insert(@RequestBody MaterialPurchase mtrl)
  {
	  System.out.println("/nin controller POST materialpurchase :"+ mtrl);
	  if(mtrl!=null){
		  System.out.println(mtrl);	
		  return materialPurchaseService.create(mtrl);
	  }
	  else return null;
  }
  
  
  @CrossOrigin
  @RequestMapping(value="/materialPurchase",method=RequestMethod.PUT,produces = "application/json")
  public List<MaterialPurchase> update(@RequestBody MaterialPurchase mtrl)
  {
	  System.out.println("/nin controller update project :"+ mtrl);
	  if(mtrl!=null){
		  
		  return materialPurchaseService.create(mtrl);
	  }
	return null ; 
  }
  
  
  @CrossOrigin
  @RequestMapping(value="/materialPurchase/{mpid}",method=RequestMethod.DELETE,produces = "application/json")
  public List<MaterialPurchase> deleteMaterialPurchase(@PathVariable Long mpid)
  {
	  System.out.println("/nin controller delete material purchase:"+ mpid);
	     return materialPurchaseService.deleteMaterialPurchase(mpid); 
	  
  }
  
  
  @CrossOrigin
  @RequestMapping(value="/materialTransaction",method=RequestMethod.GET)
   public List<MaterialTransaction> getAllMaterialTransaction()
   {
	  System.out.println("in controller get all material transaction");
	  return materialTransactionService.getAll();
   }
  
  @CrossOrigin
  @RequestMapping(value="/materialTransaction",method=RequestMethod.POST,produces = "application/json")
  public List<MaterialTransaction> insert(@RequestBody MaterialTransaction mtrl)
  {
	  System.out.println("/nin controller POST material transaction:"+ mtrl);
	  if(mtrl!=null){
		  System.out.println(mtrl);	
		  return materialTransactionService.create(mtrl);
	  }
	  else return null;
  }
  
  @CrossOrigin
  @RequestMapping(value="/materialTransaction",method=RequestMethod.PUT,produces = "application/json")
  public List<MaterialTransaction> update(@RequestBody MaterialTransaction mtrl)
  {
	  System.out.println("/nin controller update material transaction:"+ mtrl);
	  if(mtrl!=null){
		  System.out.println(mtrl);	
		  return materialTransactionService.create(mtrl);
	  }
	return null ; 
  }
  
  
  
  @CrossOrigin
  @RequestMapping(value="/materialTransaction/{mtid}",method=RequestMethod.DELETE,produces = "application/json")
  public List<MaterialTransaction> deleteMaterialTransaction(@PathVariable Long mtid)
  {
	  System.out.println("/nin controller Delete material transaction:"+ mtid);
	     System.out.println(mtid);	
	     return materialTransactionService.deleteMaterialTransaction(mtid); 
	  
  }
  
  @CrossOrigin
  @RequestMapping(value="/places",method=RequestMethod.GET)
   public List<Places> getAllPlaces()
   {
	  System.out.println("/nin controller get all places:");
	  System.out.println("in get all");
	  return placesService.getAll();
   }
  
  @CrossOrigin
  @RequestMapping(value="/places",method=RequestMethod.POST,produces = "application/json")
  public List<Places> insert(@RequestBody Places places)
  {
	  System.out.println("/nin controller POST places :"+ places);
	  if(places!=null){
		  System.out.println(places);	
		  return placesService.create(places);
	  }
	  else return null;
  }
  
  
  @CrossOrigin
  @RequestMapping(value="/places",method=RequestMethod.PUT,produces = "application/json")
  public List<Places> update(@RequestBody Places places)
  {System.out.println("/nin controller Update places :"+ places);
	  if(places!=null){
		  System.out.println(places);	
		  return placesService.create(places);
	  }
	return null ; 
  }
  
  
  @CrossOrigin
  @RequestMapping(value="/places/{plid}",method=RequestMethod.DELETE,produces = "application/json")
  public List<Places> deletePlaces(@PathVariable Long plid)
  {
	  System.out.println("/nin controller delete places:"+ plid);
	     System.out.println(plid);	
	     return placesService.deletePlaces(plid); 
	  
  }
  
  @CrossOrigin
  @RequestMapping(value="/transfer",method=RequestMethod.GET)
   public List<Transfer> getAllTransfer()
   {
	  System.out.println("in get all transfer");
	  return transferService.getAll();
   }
  
  @CrossOrigin
  @RequestMapping(value="/transfer",method=RequestMethod.POST,produces = "application/json")
  public List<Transfer> insert(@RequestBody Transfer transfer)
  {
	  System.out.println("/nin controller POST transfer :"+ transfer);
	  if(transfer!=null){
		  System.out.println(transfer);	
		  return transferService.create(transfer);
	  }
	  else return null;
  }
  
  @CrossOrigin
  @RequestMapping(value="/transfer",method=RequestMethod.PUT,produces = "application/json")
  public List<Transfer> update(@RequestBody Transfer transfer)
  {
	  System.out.println("/nin controller update transfer :"+ transfer);
	  if(transfer!=null){
		  System.out.println(transfer);	
		  return transferService.create(transfer);
	  }
	  else return null;
  }
  
  @CrossOrigin
  @RequestMapping(value="/transfer/{tid}",method=RequestMethod.DELETE,produces = "application/json")
  public List<Transfer> deleteTransfer(@PathVariable Long tid)
  {
	  System.out.println("/nin controller DELETE transfer:"+ tid);
	     System.out.println(tid);	
	     return transferService.deleteTransfer(tid); 
	  
  }
  
  
}