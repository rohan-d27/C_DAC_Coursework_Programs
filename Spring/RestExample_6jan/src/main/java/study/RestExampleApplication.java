package study;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"study","abcd.controllers"} )
public class RestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestExampleApplication.class, args);
	}
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		 dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 dmds.setUrl("jdbc:mysql://localhost:3306/adv_java");
		 dmds.setUsername("root");
		 dmds.setPassword("Rohan@16161035");
		 
		 return dmds;

	}


}
