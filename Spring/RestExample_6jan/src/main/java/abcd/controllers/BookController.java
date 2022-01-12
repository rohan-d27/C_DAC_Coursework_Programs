package abcd.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.BookPojo;
import study.dao.bean.BookDAOBean;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookDAOBean dao;
	
	@PostMapping("/add/{id}/{cost}/{name}")
	public void addBook(@PathVariable int id,@PathVariable int cost, @PathVariable String name)
	{
		dao.addBook(id, cost, name);
	}
	
	
	@GetMapping("/allbooks")
	public ArrayList<BookPojo>  getAllBooks()
	{
		return dao.getAll();
	}
	
}




