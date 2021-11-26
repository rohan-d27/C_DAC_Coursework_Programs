package practice_program_project_25nov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserofStudent {

	public static void main(String[] args) {
		List<Student> list=null;
		Scanner sc=new Scanner(System.in);
		
		try {
		list = StudentIOOperation.readFromFile();
		}
		catch (StudentDBFileNotFound e)
		{
			list = new ArrayList<Student>();
		}
		menu(list,sc);

	}//end of main

	public static void menu(List<Student> list, Scanner sc)
	{   
		while(true)
		{  System.out.println("*******************************");
		System.out.println("***********  MENU  ************");
		System.out.println("1)Enter new Student Details name,age,marks"
				+ "\n2)Enter new Student Details name,age"
				+"\n3)Search by Student name"
				+"\n4)Remove Student"
				+"\n5)Remove All Student"
				+"\n6)Exit without save"
				+"\n7)Exit with save"
				+"\n8)Show All Student Details"
				);
		System.out.println("*******************************");
		System.out.println("Enter your choice: ");
		int c=sc.nextInt();
		if(c==1)
		{
			populateStudent(list,sc);

		}
		else if(c==2)
		{
			populateStudent2(list,sc);

		}
		else if(c==3)
		{
			searchStudent(list,sc);
		}
		else if(c==4)
		{
			removeStudent(list,sc);
		}
		else if(c==5)
		{
			removeAllStudent(list);
		}
		else if(c==6)
		{
			System.out.println("Exit");
			break;
		}
		else if(c==7)
		{
			StudentIOOperation.writeToFile(list);
			break;
		}
		else if(c==8)
		{
			try {
				list=StudentIOOperation.readFromFile();
				
			} catch (StudentDBFileNotFound e) {
				
				System.out.println(e);
			}	
		}
		
		else
		{
			System.out.println("Invalid choice");
		}
		}
	}//end of menu

	public static void display(List<Student> list)
	{
		for(Student s: list)
		{
			System.out.println(s);
		}

	}//end of display

	public static void removeAllStudent(List<Student> list)
	{

		list.removeAll(list);

	}//end of removeAllStudent
	public static void removeStudent(List<Student> list, Scanner sc)
	{

		System.out.println("Enter Student name to remove");
		String n=sc.next();
		for(int i=0;i<list.size();i++)
		{
			if(n.equals(list.get(i).getName()))
			{
				list.remove(i);
			}
			else
			{
				System.out.println("Student not found");
			}

		}

	}//end of removeStudent

	public static void searchStudent(List<Student> list, Scanner sc)
	{

		System.out.println("Enter Student name to search");
		String n=sc.next();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getName().equalsIgnoreCase(n))
			{
				System.out.println(list.get(i));
			}
			else
			{
				System.out.println("Student not found");
			}
		}


	}//end of searchStudent

	public static void populateStudent(List<Student> list, Scanner sc)
	{

		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Student Age");
		int age=sc.nextInt();
		int[] marks=new int[3];
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter marks of Subject"+i+": ");
			int m=sc.nextInt();
			marks[i]=m;
		}
		Student std=new Student(name,age,marks);
		list.add(std);

	}//end of populateStudent

	public static void populateStudent2(List<Student> list,Scanner sc)
	{

		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Student Age");
		int age=sc.nextInt();

		Student std=new Student(name,age);
		list.add(std);

	}//end of populateStudent2
}