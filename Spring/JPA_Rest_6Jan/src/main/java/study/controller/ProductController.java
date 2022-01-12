package study.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.dao.MyProductDAO;
import study.entity.ProductEntity;


@RestController
@RequestMapping("/product")
public class ProductController {
	

		@Autowired
		 MyProductDAO dao;
		//http://localhost:8080/product/add/1/1000/laptop/windows
		//http://localhost:8080/product/add/2/1000/mobile/android
		@PostMapping("/add/{id}/{cost}/{name}/{information}")
		public void insertProduct(@PathVariable int id, @PathVariable int cost, @PathVariable String name,@PathVariable String information)
		{
			dao.addProduct(id, cost, name,information);
			
		}
		//http://localhost:8080/product/getAll
		@GetMapping("/getAll")
		public List<ProductEntity> getProducts()
		{
			return dao.getProducts();
		}
		//http://localhost:8080/product/delete/1
		@GetMapping("/delete/{id}")
		public void deleteProduct(@PathVariable int id)
		{
			dao.delProduct(id);
			
		}
		//http://localhost:8080/product/find/1
		@GetMapping("/find/{id}")
		public Optional<ProductEntity> findProduct(@PathVariable int id)
		{
		   return dao.findProduct(id);
				
		}
		//http://localhost:8080/product/update/1/3000
		@GetMapping("/update/{id}/{cost}")
		public void updateProduct(@PathVariable int id,@PathVariable int cost)
		{
			dao.update(id,cost);
			
		}
}