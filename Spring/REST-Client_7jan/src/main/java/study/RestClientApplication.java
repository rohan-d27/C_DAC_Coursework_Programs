package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
		
		RestTemplate obj = new RestTemplate();
		obj.postForLocation("http://localhost:9090/book/add/10/560/restclient",null );
		
	}

}
