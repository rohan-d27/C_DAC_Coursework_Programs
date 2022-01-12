package study.repostory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import study.entity.BookEntity;

@Repository
public class BookDAO {
	
	@Autowired
	MyRepository repo;
	
	
	
	public List<BookEntity> getAllBooks(){ 
	    return repo.findAll();
	}



	
	

	public List<BookEntity> bookByName(String bookname) {
		
		return  repo.findByBookName(bookname);
	}
	
	 public void  deleteBook(String name)
	   {
		   for (BookEntity bk: repo.findByBookName(name))
		   {
			     repo.delete(bk);
		    }
		    
		   
	   }





}
