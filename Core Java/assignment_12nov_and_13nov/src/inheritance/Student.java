package inheritance;

public class Student extends Person {
	private int rollno;

	
	
public Student(String n,Date d,int rn)
{
	super(n,d);
	this.rollno=rn;
	System.out.println("Parameterized constructor of Student class");
	}

	public Student() {
	System.out.println("No Parameter constructor of Student class");
}
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	
	
}
