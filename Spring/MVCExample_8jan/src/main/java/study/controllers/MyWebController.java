package study.controllers;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.entity.BookEntity;
import study.repostory.BookDAO;

@Controller
public class MyWebController {

	//http://localhost:8080/hitcount
	@RequestMapping("/hitcount")
	public ModelAndView getUserwiseCount(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		int count=1;
		if(session.isNew())
		{
			session.setAttribute("count", 1);
		}
		else
		{
			count =(int) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}

		mv.addObject("count",count);
		mv.setViewName("userhits");

		return mv;
	}

	@Autowired
	BookDAO dao;
	//http://localhost:8080/getBooks
	@RequestMapping("/getBooks")
	public ModelAndView getListOfBooks()
	{
		ModelAndView mv = new ModelAndView();

		List<BookEntity> list = dao.getAllBooks();

		mv.addObject("books", list);  //request.setAttribute
		mv.setViewName("books");  //requestdispatcher forward
		return mv;
	}

	//http://localhost:8080/hi
	@RequestMapping(method=RequestMethod.GET ,path="/hi")
	public String sayHello()
	{
		System.out.println("reached here..");
		return "first";
	}

	@GetMapping("/login")
	public String f1()
	{
		return "input";
	}

	@PostMapping("/verify")
	public String verify(@RequestParam String uname , @RequestParam String pass)
	{
		if(uname.equals("iet") && pass.equals("123"))
			return "home";
		else
			return "input";
	}


	@PostMapping("/verify2")
	public String verify2(Model model ,@RequestParam String uname , @RequestParam String pass)
	{
		if(uname.equals("iet") && pass.equals("123"))
		{
			model.addAttribute("user", uname);  //request.setAttribute
			return "home";   //requestdispatcher forward
		}
		else
		{
			model.addAttribute("errorMsg", "Incorrect Login Try Again");
			return "input";
		}
	}
}


