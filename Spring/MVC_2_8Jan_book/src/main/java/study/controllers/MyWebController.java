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
	

	@Autowired
	BookDAO dao;
	//http://localhost:8080/getBooks
	@RequestMapping("/listBooks")
	public ModelAndView getListOfBooks()
	{
		ModelAndView mv = new ModelAndView();

		List<BookEntity> list = dao.getAllBooks();

		mv.addObject("books", list);  
		mv.setViewName("books"); 
		return mv;
	}
	//http://localhost:8080/showFromDB
	@RequestMapping("/showFromDB")
	public ModelAndView getBookDetails(@RequestParam String bookname)
	{
		ModelAndView mv = new ModelAndView();

		

		mv.addObject("books",dao.bookByName(bookname) );  
		mv.setViewName("showabook"); 
		return mv;
		
		
		
	}
	
	@GetMapping("/getall")
    public ModelAndView getAllBook() 
    {
		ModelAndView obj=new ModelAndView();
		obj.addObject("books",dao.getAllBooks());
	//	obj.setViewName("booksfordelete");
		obj.setViewName("books");
	   	return obj;
	}
	@PostMapping("/deletefromDB")
	public ModelAndView  deleteBook(@RequestParam String bookname)
	{
		ModelAndView mv=new ModelAndView();
		dao.deleteBook(bookname);
	    mv.setViewName("delete");
		return mv;
		
	}

}


