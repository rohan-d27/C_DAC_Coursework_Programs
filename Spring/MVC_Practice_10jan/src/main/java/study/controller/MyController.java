package study.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.entity.Movie;
import study.repository.MyRepository;

@Controller
public class MyController {

	@Autowired
	MyRepository repo;
	
	
	@RequestMapping("/getMovie")
	public ModelAndView getMovies()
	{
		ModelAndView mv = new ModelAndView();

		List<Movie> list = repo.findAll();

		mv.addObject("movieslist", list);  //request.setAttribute
		mv.setViewName("movieslist");  //requestdispatcher forward
		return mv;
	}
	
	@GetMapping("/add2")
	public String f1()
	{
		return "add";
	}
	
	
	@GetMapping("/ind")
	public String f2()
	{
		return "index";
	}
	
	
	@PostMapping("/insert")
	public void addmovie(@RequestParam String name,@RequestParam String rating,@RequestParam String category)
	{
		
         Movie obj=new Movie(name,rating,category);
         repo.save(obj);
		
	}
	
}
