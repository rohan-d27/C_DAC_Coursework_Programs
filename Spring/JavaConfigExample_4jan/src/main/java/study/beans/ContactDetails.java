package study.beans;

public class ContactDetails {
private String phoneno,email;
private AddressBean address;

	public ContactDetails() {
		super();
		
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
