package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactDetails {
private String phoneno,email;
@Autowired
private AddressBean address;

	public ContactDetails() {
		this.setPhoneno("123456789");
		this.setEmail("abc@gmail.com");
		
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressBean getAddress() {
	return address;
}
public void setAddress(AddressBean address) {
	this.address = address;
}
}
