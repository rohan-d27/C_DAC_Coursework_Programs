package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.MessageBean;

public class JavaConfigExample4janApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(study.config.MyJavaConfiguration.class);
		MessageBean obj=(MessageBean)context.getBean("first");
		System.out.println(""+obj.getMessage()+"   "+obj.getSender()+" "+obj.getContactDetails().getPhoneno()+" "+obj.getContactDetails().getAddress().getArea());
	
	
	
	
	
	
	
	}

}
