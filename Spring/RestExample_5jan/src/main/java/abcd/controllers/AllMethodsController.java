package abcd.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  //SPring bean that holds and maps and manages the REST API 
@RequestMapping(path="/test")
public class AllMethodsController {	
	@RequestMapping(method=RequestMethod.GET, path="/getit")  //REST API
	public String getEx()
	{
		System.out.println("GET called");
		return "GET method called ";
	}
	@RequestMapping(method=RequestMethod.POST, path="/postit") //REST API 
	public String postEx()
	{
		System.out.println("POST called");
		return "post method called";
	}
	@RequestMapping(method=RequestMethod.PUT, path="/putit")
	public String putEx()
	{
		System.out.println("PUT called");	
		return "put method called ";
	}
	@RequestMapping(method=RequestMethod.DELETE, path="/deleteit")
	public String deleteEx()
	{
		System.out.println("DELETE called");
		return "delete method called";
	}

}
