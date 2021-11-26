//COP_Assignment_3
/*Q2.Write a program to demonstrate user input and output of student structure having four attribute namely name,
age, roll_no, gender:
	
Function:
a). Print name of all female student.
b). Print name of all male student.
c). Print highest roll no student name.
d). Print most elder student name.
e). Print most youngest student name.
f). Print ratio of student gender.
*/

import java.util.Scanner;
public class Main {

	

	public static void main(String[] args) {
		System.out.println("Enter number of students:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		Student[] arr=new Student[no];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Student();
			System.out.println("Enter \nStudent name: \nStudent age: \nStudent RollNo \nStudent Gender:");
			String name=sc.next();
			arr[i].setName(name);
			int age=sc.nextInt();
			arr[i].setAge(age);
			int rollno=sc.nextInt();
			arr[i].setRollno(rollno);
			String gender=sc.next();
			arr[i].setGender(gender);
		}
		
			display(arr);
			menu(arr);   
	}
	static void menu(Student arr[])
	{
		System.out.println("Enter a choice from following: \r\n"
				+ "1).Print name of all female student.\r\n"
				+ "2). Print name of all male student.\r\n"
				+ "3). Print highest rollno student name.\r\n"
				+ "4). Print most elder student name.\r\n"
				+ "5). Print most youngest student name.\r\n"
				+ "6). Print ratio of student gender.\r\n");
		Scanner bc=new Scanner(System.in);
		int c=bc.nextInt();
		if(c==1)
		{
			   searchf(arr);
			   menu(arr);
		}
		if(c==2)
		{
			 searchm(arr);
			 menu(arr);
		}
		if(c==3)
		{
			 highest(arr);
			 menu(arr);
		}
		if(c==4)
		{
			  oldest(arr);
			  menu(arr);
		}
		if(c==5)
		{
			 youngest(arr);
			 menu(arr);
		}
		if(c==6)
		{
			ratio(arr);
			menu(arr);
		}
	}
			
	static void display(Student arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	 
	
	static void searchf(Student arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getGender().equals("f"))
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	
	static void searchm(Student arr[]) {
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getGender().equals("m"))
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	
	static void highest(Student arr[]) {
		 int high=arr[0].getRollno();
		 int highindex=0;
		 for(int i=1;i<arr.length;i++)
		 {
			 if(arr[i].getRollno()>high)
			 {
				 high=arr[i].getRollno();
				 highindex=i;
				 
			 }
		 }
		 System.out.println(arr[highindex]);
	 }
	
	
	static void oldest(Student arr[]) {
		 int old=arr[0].getAge();
		 int highindex=0;
		 for(int i=1;i<arr.length;i++)
		 {
			 if(arr[i].getAge()>old)
			 {
				 old=arr[i].getAge();
				 highindex=i;
			 }
		 }
		 System.out.println(arr[highindex]);
	 }
	
	
	static void youngest(Student arr[]) {
		 int young=arr[0].getAge();
		 int highindex=0;
		 for(int i=1;i<arr.length;i++)
		 {
			 if(arr[i].getAge()<young)
			 {
				 young=arr[i].getAge();
				 highindex=i;
			 }
		 }
		 System.out.println(arr[highindex]);
	 }
	
	
	static void ratio(Student arr[])
	 {
		 int count=0;
		int count1=0;
		 for(int i=0;i<arr.length;i++)
			{
				if(arr[i].getGender().equals("f"))
				{
					System.out.println(arr[i]);
					count=count+1;
				}
			}
		 for(int i=0;i<arr.length;i++)
			{
				if(arr[i].getGender().equals("m"))
				{
					System.out.println(arr[i]);
					count1=count1+1;
				}
			}
		 System.out.printf("Ratio of male to female is %d to %d\n",count1,count);
	 }
}