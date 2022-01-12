package study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.MessageBean;

public class SpringExample4JanApplication {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext("beans.xml");
		MessageBean obj=(MessageBean)context.getBean("first");
		System.out.println(""+obj.getMessage()+"   "+obj.getSender()+" "+obj.getContactDetails().getPhoneno()+" "+obj.getContactDetails().getAddress().getArea());
		
		//MessageBean obj1=(MessageBean)context.getBean("singletonEx",MessageBean.class);
		//System.out.println(""+obj1.getMessage()+"   "+obj1.getSender());
		
		//MessageBean obj2=(MessageBean)context.getBean("singletonEx");
		//System.out.println(obj+"   "+obj1+"  "+obj2);
		
	}

}
