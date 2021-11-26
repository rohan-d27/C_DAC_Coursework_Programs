package student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student_IET s1= new Student_IET();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Student First Name:");
		String fname=sc.nextLine();
		s1.setFirstName(fname);
		System.out.println("Enter Student Last Name:");
		String lname=sc.nextLine();
		s1.setLastName(lname);
		System.out.println("Enter Student Age:");
		int age=sc.nextInt();
		s1.setAge(age);
		System.out.println("Enter Student Graduation Year:");
		int gradyear=sc.nextInt();
		s1.setGraduationYear(gradyear);
		System.out.println("Enter Student Graduation Stream:");
		String gradStream=sc.next();
		s1.setGraduationStream(gradStream);
		System.out.println(s1);
	}

}
