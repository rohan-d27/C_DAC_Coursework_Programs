package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("first")
@Scope("prototype")
public class MessageBean {
	private String message,sender;
	@Autowired
	private ContactDetails contactDetails;
	public MessageBean() {
		this.setMessage("message from constructor");
		this.setSender("rohan");
		System.out.println("\nconstructor called");
	}

	public MessageBean(String message, String sender) {
		super();
		this.message = message;
		this.sender = sender;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("messsage setter called");
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		System.out.println("sender setter called");
		this.sender = sender;
	}
	
	
	
}
