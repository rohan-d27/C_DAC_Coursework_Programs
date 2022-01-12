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
		return "GET method always gives ";
	}
	@RequestMapping(method=RequestMethod.POST, path="/postit") //REST API 
	public void postEx()
	{
		System.out.println("POST called");
	}
	@RequestMapping(method=RequestMethod.PUT, path="/putit")
	public void putEx()
	{
		System.out.println("PUT called");	
	}
	@RequestMapping(method=RequestMethod.DELETE, path="/deleteit")
	public void deleteEx()
	{
		System.out.println("DELETE called");
	}

}
