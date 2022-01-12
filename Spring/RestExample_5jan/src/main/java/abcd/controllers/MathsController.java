package abcd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/maths")
public class MathsController {

	//http://localhost:8080/maths/sum/10/20/30
	@GetMapping("/sum/{n1}/{num2}/{num3}")
	public int add(@PathVariable int n1,  @PathVariable("num2")int n2,@PathVariable("num3") int n3)
	{
		int result= n1 + n2+ n3;
		return result;
	}
	
	//http://localhost:8080/maths/product/4/5/9
	@GetMapping("/product/{num1}/{num2}/{num3}")
	public double multiply(@PathVariable double num1 , @PathVariable("num2") double n2,@PathVariable("num3") double n3 )
	{
		return num1*n2*n3;
		
	}
	
	//http://localhost:8080/maths/intdiv/440/45
		@GetMapping("/intdiv/{n1}/{n2}")
		public int intdiv(@PathVariable int n1 , @PathVariable int n2)
		{
			return n1/n2;
			
		}
		//http://localhost:8080/maths/floatdiv/440/45
		@GetMapping("/floatdiv/{num1}/{num2}")
		public float floatdiv(@PathVariable float num1 , @PathVariable("num2") float n2)
		{
			return num1/n2;
			
		}
		//http://localhost:8080/maths/subtract/440/45
				@GetMapping("/subtract/{n1}/{num2}")
				public int subtract(@PathVariable int n1 , @PathVariable("num2") int n2)
				{
					return n1-n2;
					
				}
	
	
}//end of controller 
