package abcd.controllers;


import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import study.Product;

@RestController
@RequestMapping(path="/product")
public class ProductCotroller {

	@GetMapping("/showAll")
	public ArrayList<Product> getAllProducts()
	{
		ArrayList<Product> al = new ArrayList<>();
		 al.add(new Product("Cheese","slice",200));
		 al.add(new Product("sugar","powdered",50));
		 al.add(new Product("butter","amul",60));
		 al.add(new Product("Coffee","sachet",20));
		 al.add(new Product("tea","powder",300));
		 al.add(new Product("bread","wheat",30));
		return al;
	}
	
	/*
	 * @RequestMapping(produces=MediaType.TEXT_XML_VALUE , method=RequestMethod.GET,
	 * path = "/showxml") public Product getXmlProduct() { Product obj = new
	 * Product("Cheese","slice",200); return obj; }
	 */	
	
	
	@GetMapping("/show")
	public Product getProduct()
	{
		Product obj = new Product("Cheese","slice",200);
		return obj;
	}
	
	@PostMapping("/add")
	public void addProduct(@RequestBody Product product)
	{
		System.out.println(product);
	}
	
	@PostMapping(path="/add2" , consumes=MediaType.TEXT_XML_VALUE)
	public void addProduct2(@RequestBody Product product)
	{
		System.out.println(product);
	}

}


