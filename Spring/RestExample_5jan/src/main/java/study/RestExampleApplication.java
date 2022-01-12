package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"study","abcd.controllers"} )
public class RestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestExampleApplication.class, args);
	}

}
