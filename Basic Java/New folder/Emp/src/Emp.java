
public class Emp {
	
	private String name;
	private Date dob;
	
	
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


	public Emp() {

		name = "Shrinivas";
		dob = new Date(21, 7, 1944);
	}

}
