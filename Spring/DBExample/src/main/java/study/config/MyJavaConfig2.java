package study.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyJavaConfig2 {

	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		 dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 dmds.setUrl("jdbc:mysql://localhost:3306/bookshop");
		 dmds.setUsername("root");
		 dmds.setPassword("123456789");
		 
		 return dmds;

	}
	
	
	
}
