package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.MessageBean;


public class AnnotationsExaple4janApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext() ;
	context.scan("study.beans");
	context.refresh();
	MessageBean obj=(MessageBean)context.getBean("first");
	System.out.println(""+obj.getMessage()+"   "+obj.getSender()+" "+obj.getContactDetails().getPhoneno()+" "+obj.getContactDetails().getAddress().getArea());

	
	}

}
