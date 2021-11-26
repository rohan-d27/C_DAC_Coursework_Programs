
public class Student {
	private String name;
	private int age;
	private int rollno;
	

	public Student(String n,int a) {
		name=n;
		age=a;
	
	}
	public Student(String n,int a,int rn) {
		name=n;
		age=a;
		rollno=rn;
			
	}
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String toString() {
		String str="Name:"+name+",Age:"+age+",RollNo.:"+rollno;
		return str;
	}
	
 	}
    

