package abcd.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/onemore")
public class ThirdController {

	@RequestMapping(method = RequestMethod.GET,path = "/hi")
	public String some()
	{
		return "Duplicate ";
	}
	
	
}
