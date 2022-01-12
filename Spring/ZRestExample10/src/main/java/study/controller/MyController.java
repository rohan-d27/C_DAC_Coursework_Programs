package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.doa.BookDoa;
import study.entity.Book;

@RestController
@RequestMapping("/book")
public class MyController {
	@Autowired
	BookDoa dao;
	
	@PostMapping("/insert/{id}/{name}/{cost}")//insert/1/abc/50
	public void insertBook(@PathVariable int id,@PathVariable String name,@PathVariable int cost )
	{
		Book obj=new Book(id, name, cost);
		dao.insert(obj);
		
	}
	@PutMapping("/update")
	public void updateBook(@RequestParam int id,@RequestParam int newcost)
	{
		dao.update(id,newcost);
	}
	@GetMapping("/showbyname/{name}")
	public List<Book> showBook(@PathVariable String name)
	{
		return dao.showbook(name);
	}
}
