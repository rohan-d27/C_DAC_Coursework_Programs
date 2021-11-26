
public class Student {
	int rollno;
	String name;
	boolean isExperienced;
	
	public Student() {
	
	}
	

	
	public Student(int rollno, String name, boolean isExperienced) {
		
		this.rollno = rollno;
		this.name = name;
		this.isExperienced = isExperienced;
	}
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isExperienced() {
		return isExperienced;
	}

	public void setExperienced(boolean isExperienced) {
		this.isExperienced = isExperienced;
	}

	public String toString() {
		return "Student rollno=" + rollno + ", name=" + name + ", isExperienced=" + isExperienced ;
	}
}
