
public class Student {
	
	private String name;
	private int age;
	private String mobno;
	private String email;
	
	
	public String getEmail() {
		return email;
	}

	public Student() {
		super();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String name,int age, String mobno,String email) {
		super();
		this.age = age;
		this.name = name;
		this.mobno = mobno;
		this.email=email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	public String toString() {
		return "Student age=" + age + ", name=" + name + ", mobno=" + mobno + ", email=" + email + "";
	}
	
	
}
