package study;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import study.entity.BookEntity;

@Repository
public class BookDoa 
{
	@Autowired
   MyRepositary re;
	
   public List<BookEntity> allbook()
   {
	  return re.findAll();
	
  }
   public List<BookEntity> bookByName(String name)
   {
	   return re.findByBookName(name);
   }
   public void  deleteBook(String name)
   {
	   for (BookEntity bk: re.findByBookName(name))
	   {
		     re.delete(bk);
	    }
	    
	   
   }
   
}
