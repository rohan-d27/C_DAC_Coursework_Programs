package study.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import study.entity.Book;
//interface
@Component //to create bean (object)
//@Repository
public interface MyRepositary  extends JpaRepository<Book, Integer>{

  List<Book> findAllByBookName(String name);  //datatype of entity ,datatype of entityS primary key

}
