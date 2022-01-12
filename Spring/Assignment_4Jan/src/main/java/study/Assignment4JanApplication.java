package study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.AddressBean;
import study.beans.CardsBean;
import study.beans.PersonBean;


public class Assignment4JanApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext("beans.xml");
		PersonBean obj=(PersonBean)context.getBean("person");
		System.out.println(""+obj.getName()+"   "+obj.getCards().getAadhar()+"   "+obj.getCards().getPan()+" "+obj.getCards().getPassport()+" "+obj.getAddress().getCity()+" "+obj.getAddress().getArea());
	
	

		AddressBean obj1=(AddressBean)context.getBean("address");
		System.out.println(obj1.getCountry()+"  "+obj1.getState()+" "+obj1.getDistrict()+" "+" "+obj1.getCity()+" "+obj1.getArea());
	
	
	CardsBean obj2=(CardsBean)context.getBean("cards");
	System.out.println(obj2.getAadhar()+" "+obj2.getPan()+" "+obj2.getPassport());
	
	
	}
	
	
}
	
	

