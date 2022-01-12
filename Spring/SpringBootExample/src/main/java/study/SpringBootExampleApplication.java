package study;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import study.beans.BookDAO;

@SpringBootApplication
public class SpringBootExampleApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootExampleApplication.class, args);
		BookDAO dao = context.getBean(BookDAO.class);
		dao.addBook(3448, 990, "spring boot");
		
	}
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		 dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 dmds.setUrl("jdbc:mysql://localhost:3306/adv_jav");
		 dmds.setUsername("root");
		 dmds.setPassword("Rohan@16161035");
		 
		 return dmds;

	}

}
