package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationConfigDb5Jan2Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("study");
		context.refresh();
		BookDAO dao = context.getBean(study.BookDAO.class);
		dao.addBook(6, 350, "mixed spring configs3");
	}

}
