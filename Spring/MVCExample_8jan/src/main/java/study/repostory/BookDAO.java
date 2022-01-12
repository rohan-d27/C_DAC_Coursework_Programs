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
	
	
	

}
