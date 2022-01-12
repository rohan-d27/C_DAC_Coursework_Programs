package abcd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/maths")
public class MathsController {

	//http://localhost:8080/maths/sum?num1=10&num2=20
	@GetMapping("/sum")
	public int add(@RequestParam int num1, @RequestParam("num2")int n2)
	{
		int result= num1 + n2;
		return result;
	}
	
	//http://localhost:8080/maths/add/40.9/12.2
	@GetMapping("/add/{num1}/{num2}")
	public double multiply(@PathVariable double num1 , @PathVariable("num2") double n2)
	{
		return num1*n2;
		
	}
	
	
	
	
	
	
}//end of controller 
