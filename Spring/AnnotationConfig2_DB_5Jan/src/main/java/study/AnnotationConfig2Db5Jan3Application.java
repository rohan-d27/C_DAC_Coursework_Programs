package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationConfig2Db5Jan3Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("study","study.config");
		context.refresh();
		BookDAO dao = context.getBean(study.BookDAO.class);
		dao.addBook(7, 1350, "mixed spring configs3");
	}

}
