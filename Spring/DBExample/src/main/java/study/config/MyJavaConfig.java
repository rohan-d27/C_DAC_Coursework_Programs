package study.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import study.BookDAO;

//@Configuration
//@ImportResource("classpath:beans.xml")
public class MyJavaConfig {

	@Autowired
	DataSource ds;
	
	@Bean
	public BookDAO  getBookDao()
	{
		BookDAO obj = new BookDAO();
		obj.setDs(ds);
		return obj;
	}
}
