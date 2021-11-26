
public class Student {
	private String name;
	private int age;
	private int rollno;
	private int std;


	public Student() {

	}

	public Student(String n, int a) {
		name=n;
		age=a;

	}

	public Student(String n,int a,int ro,int s) 
	{
		name=n;
		age=a;
		rollno=ro;
		std=s;

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

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public void assignRollNo(int rn)
	{
		rollno=rn;
	}
	public String toString() {
		String str="name:" + name+ ",Age:"+age+",Roll n:"+rollno+",std:"+std;
		return str;
	}

};
