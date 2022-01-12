package study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import study.beans.AddressBean;
import study.beans.ContactDetails;
import study.beans.MessageBean;

@Configuration
public class MyJavaConfiguration {

	@Bean("first")
	@Scope("prototype")
	public MessageBean func1()
	{
			MessageBean obj=new MessageBean();
			obj.setSender("rohan");
			obj.setMessage("java config example");
			obj.setContactDetails(func2());
			return obj;
			
	}
	@Bean
	public ContactDetails func2()
	{
			ContactDetails obj=new ContactDetails();
			obj.setEmail("roah@gmail.com");
			obj.setPhoneno("98765432");
			obj.setAddress(func3());
			return obj;
			
	}
	@Bean
	public AddressBean func3()
	{
		AddressBean obj=new AddressBean();
		obj.setCountry("India");
		obj.setState("maharashtra");
		obj.setDistrict("pune");
		obj.setCity("pune");
		obj.setArea("Shivajinagar");
		return obj;
		
		
	}
	
}
