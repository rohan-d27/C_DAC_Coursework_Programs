package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDb5Jan1Application {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(study.config.MyJavaConfig.class);
		BookDAO dao = context.getBean(study.BookDAO.class);
		dao.addBook(4,8000, "Spring2");
	}

}
