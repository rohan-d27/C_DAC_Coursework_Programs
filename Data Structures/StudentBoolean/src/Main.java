import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter number of students:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student []arr=new Student[n];
		read(arr);
		showStudentInfo(arr);
		setBoolean(arr);

	}
	public static void read(Student arr[]) {
		
	System.out.println("Enter following details:\n1.Student rollno \n2.Student name \n3.is student experienced yes or no");
	for(int i=0;i<arr.length;i++)
	{	arr[i]=new Student();
		Scanner bc=new Scanner(System.in);
		System.out.println("Enter Student rollno");
		int rollno=bc.nextInt();
		arr[i].setRollno(rollno);
		System.out.println("Enter Student name");
		String name=bc.next();
		arr[i].setName(name);
		System.out.println("Enter Student is experienced or not write true or false");
		boolean b=bc.nextBoolean();
		arr[i].setExperienced(b);
	}
	}
	public static void showStudentInfo(Student arr[]) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void setBoolean(Student arr[]) {
		
		System.out.println("Enter student roll no to set experience:");
		Scanner cs=new Scanner(System.in);
		int c=cs.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getRollno()==c)
		{
			System.out.println("Enter true or false to set experience:");
			boolean v=cs.nextBoolean();
			arr[i].setExperienced(v);
			System.out.println(arr[i]);
		}
		}
	}


	
}