package Q6.Employee;

public class Address {
	String flatno;
	String buildname;
	String area;
	String city;
	String state;
	String country;
	int pincode;

	public Address() {
		
	}
	 
	public Address(String flatno, String buildname, String area, String city, String state, String country,
			int pincode) {
		
		this.flatno = flatno;
		this.buildname = buildname;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	
	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getBuildname() {
		return buildname;
	}

	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String toString() {
		return "Address :flatno=" + flatno + ", buildname=" + buildname + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode ;
	}
	
}
