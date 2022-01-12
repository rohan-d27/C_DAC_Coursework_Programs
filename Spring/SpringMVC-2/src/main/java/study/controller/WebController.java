package study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	//http://localhost:8080/helloWeb
	@GetMapping("helloWeb")
	public String function1()
	{
		return "hello";
	}
	
}
