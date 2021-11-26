/* Write a program to demonstrate user input and output of student structure having four attribute namely name,
age, roll_no, gender:
	
Function:
a). Print name of all female student.
b). Print name of all male student.
c). Print highest rollno student name.
d). Print most elder student name.
e). Print most youngest student name.
f). Print ratio of student gender.
*/


public class Student {
	private String name;
	private int age;
	private int rollno;
	private String gender;

	public Student(String n,int a) {
		name=n;
		age=a;
	
	}
	public Student(String n,int a,int rn,String g) {
		name=n;
		age=a;
		rollno=rn;
		gender=g;	
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
		String str="Name:"+name+",Age:"+age+",RollNo.:"+rollno+",Gender:"+gender;
		return str;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
 	}
    

