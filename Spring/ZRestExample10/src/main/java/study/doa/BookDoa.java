package study.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import study.entity.Book;
import study.repositary.MyRepositary;
@Component//to create Bean
public class BookDoa {

 	@Autowired
	MyRepositary re;
	
	public void insert(Book obj) 
	{
		
		re.save(obj);
	}

	public void update(int id, int newcost) 
	{
       
		     Book book= re.findById(id).get();
		     book.setBookCost(newcost);
		     re.save(book);
		
	}

	public List<Book> showbook(String name) 
	{
		 return re.findAllByBookName(name);
		 
		
	}

}
