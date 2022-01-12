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
		 dmds.setUrl("jdbc:mysql://localhost:3306/adv_java");
		 dmds.setUsername("root");
		 dmds.setPassword("Rohan@16161035");
		 
		 return dmds;

	}
	
	
	
}
