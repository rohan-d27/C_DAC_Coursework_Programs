package inheritance;


public class Person {
	private String name;
	private Date dob;
	
	
	public Person(String name, Date dob) {
		this.name = name;
		this.dob = dob;
		System.out.println("Parameterized constructor of Person class");
	}


	public Person() {
		System.out.println("No Parameter constructor of Person class");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	
	
	
	
}
