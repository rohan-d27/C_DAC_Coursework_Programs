
public class Student {
	
	private int rollNo;
	private String studentName;
	
	public Student(String n, int rn )
	{
		rollNo = rn;
		studentName = n;
	}
	
	public String toString() {
		String str = "";
		str = "Roll: " + rollNo + ", Name: " + studentName;
		return str;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo()
	{
		return rollNo;
	}

}

