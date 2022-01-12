package abcd.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	 public FirstRestController() {
	
		 System.out.println("YES the object of controller class is created NOW");
		
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "/hi")
	public String gfhgfdjkl()
	{
		return "HELLO FROM REST";
	}
	
	
	
	
	
	
}
