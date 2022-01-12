package study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Db5JanApplication {

	public static void main(String[] args) {
	
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");			
		    BookDAO dao = context.getBean(study.BookDAO.class);
			dao.addBook(4,3000, "Spring2");
		}

	

}
