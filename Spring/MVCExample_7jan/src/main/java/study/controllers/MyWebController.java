package study.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyWebController {

	@RequestMapping(method=RequestMethod.GET ,path="/hi")
	public String sayHello()
	{
		System.out.println("reached here..");
		return "first";
	}
	
	
	
	
	
}
