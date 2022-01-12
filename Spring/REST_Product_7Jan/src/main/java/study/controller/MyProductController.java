package study.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.DAO.MyProductDAO;
import study.entity.ProductEntity;

@RestController
@RequestMapping("/product")
public class MyProductController {
	//use postman
	@Autowired
	MyProductDAO dao =new MyProductDAO();
	//http://localhost:8080/product/add/1/laptop/50000/windows/2022-12-12
	@PostMapping("/add/{id}/{name}/{cost}/{Description}/{expirydate}")
	public void add(@PathVariable int id, @PathVariable String name, @PathVariable int cost, @PathVariable String Description, @PathVariable Date expirydate)
	{
		dao.add(id, name, cost, Description, expirydate);
		
	} 
	//http://localhost:8080/product/showall
	@GetMapping("/showall")
	public List<ProductEntity> showAll()
	{
		return dao.showAll();
	}
	//http://localhost:8080/product/show/1
	@GetMapping("/show/{id}")
	public ProductEntity showProduct(@PathVariable int id)
	{
		return dao.showProduct(id);
		
	}
	
	//http://localhost:8080/product/remove/1
	@DeleteMapping("/remove/{id}")
	public void delete(@PathVariable int id)
	{
		dao.delete(id);
	}
	
	//http://localhost:8080/product/update/1/60000
	@PutMapping("/update/{id}/{newcost}")
	public void update(@PathVariable int id , @PathVariable int newcost)
	{
		 dao.update(id, newcost);
	}
	
	//http://localhost:8080/product/showbycost/60000
	@GetMapping("/showbycost/{cost}")
	public List<ProductEntity> getBycost(@PathVariable int cost)
	{
		return dao.getByCost(cost);
	}
	
	//http://localhost:8080/product/showbyname/laptop
	@GetMapping("/showbyname/{name}")
	public List<ProductEntity> getByname(@PathVariable String name)
	{
		return dao.getByName(name);
	}
	
	//http://localhost:8080/product/showbydesc/windows
	@GetMapping("/showbydesc/{description}")
	public List<ProductEntity> getBydescription(@PathVariable String description)
	{
		return dao.getByDescription(description);
	}
	
	//http://localhost:8080/product/showbyexpirydate/2022-12-12
	@GetMapping("/showbyexpirydate/{expirydate}")
	public List<ProductEntity> getByexpitydate(@PathVariable Date expirydate)
	{
		return dao.getByExpiryDate(expirydate);
	}
	
	//http://localhost:8080/product/costlessthan/61000
	@GetMapping("/costlessthan/{cost}")
	public List<ProductEntity> getbyCostLessthan(@PathVariable int cost)
	{
		return dao.getBycostLessthan(cost);
	}
	
	//http://localhost:8080/product/costgreaterthan/1000
	@GetMapping("/costgreaterthan/{cost}")
	public List<ProductEntity> getbyCostGreterthan(@PathVariable int cost)
	{
		return dao.getBycostGreterthan(cost);
	}
	

	//@GetMapping("/notExpired")
	// public List<ProductEntity> getBynotExpired()
	  //{
	//	long millis=System.currentTimeMillis();  
		//java.sql.Date date=new java.sql.Date(millis); 
		//System.out.println(date);
		//  return  dao.getBynotExpired(date);
	 // }
	
	
}
