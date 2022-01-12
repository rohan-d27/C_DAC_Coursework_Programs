package study;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.BookEntity;
@Repository
public interface MyRepositary extends JpaRepository<BookEntity, Integer> {

	List<BookEntity> findByBookName(String name);
	
  
}
