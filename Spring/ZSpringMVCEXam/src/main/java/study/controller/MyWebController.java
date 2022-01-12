package study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import study.doa.BookDoa;
import study.entity.Book;

@Controller
public class MyWebController 
{
	@Autowired
	BookDoa doa;
	
    @GetMapping("/input")
    public String input()
    {
    	return "inputdata";
    }
    @PostMapping("/insert")
    public String insertBook(@RequestParam int id ,@RequestParam String name,@RequestParam int cost )
    {
    	Book obj=new Book(id, name, cost);
    	doa.insert(obj) ;
    	return "inputdata";
    	
    }
    
}
