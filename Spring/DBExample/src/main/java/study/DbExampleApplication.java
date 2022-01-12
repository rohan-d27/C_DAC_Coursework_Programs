package study;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DbExampleApplication {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(study.config.MyJavaConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("study","study.config");
		context.refresh();
		
		BookDAO dao = context.getBean(study.BookDAO.class);
		dao.addBook(3437, 350, "mixed spring configs3");
	}

}
