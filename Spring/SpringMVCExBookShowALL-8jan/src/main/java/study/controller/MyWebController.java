package study.controller;

import java.awt.Dialog.ModalExclusionType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.BookDoa;
import study.entity.BookEntity;

@Controller
public class MyWebController 
{
	@Autowired
	BookDoa doa;
	@GetMapping("/showall")
     public ModelAndView showBook() 
     {
		ModelAndView obj=new ModelAndView();
		obj.addObject("books",doa.allbook());
		obj.setViewName("viewbooks");
	   	return obj;
	}
	@GetMapping("/getall")
    public ModelAndView getAllBook() 
    {
		ModelAndView obj=new ModelAndView();
		obj.addObject("books",doa.allbook());
		obj.setViewName("booksfordelete");
	   	return obj;
	}
	@PostMapping("/getfromDB")
	public ModelAndView  getBook(@RequestParam String bookname)
	{
		ModelAndView obj=new ModelAndView();
		obj.addObject("books",doa.bookByName(bookname));
	    obj.setViewName("showabook");
		return obj;
		
	}
	@PostMapping("/deletefromDB")
	public ModelAndView  deleteBook(@RequestParam String bookname)
	{
		ModelAndView obj=new ModelAndView();
		doa.deleteBook(bookname);
	    obj.setViewName("delete");
		return obj;
		
	}
	
	
}
