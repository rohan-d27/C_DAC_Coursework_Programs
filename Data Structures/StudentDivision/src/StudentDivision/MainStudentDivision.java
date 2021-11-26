package StudentDivision;

import java.util.Scanner;

public class MainStudentDivision {
	public static void main(String[] args) {
	
	System.out.println("Enter Student name: ");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	System.out.println("Enter Student marks in 5 subjects: ");
	int []arr=new int[5];
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	division(arr);
}

static void division(int arr[])
{
	for(int i=0;i<5;i++)
	{
		if(arr[i]>=80)
		{
			System.out.println("Distinction");
		}
		if(arr[i]>=60&& arr[i]<=79)
		{
			System.out.println("First Class");
	    }
		if(arr[i]<=59&&arr[i]>=50)
		{
			System.out.println("Second Class");
		}
	    if(arr[i]<=49&&arr[i]>=40)
	    {
	    	System.out.println("Third class");
	    }
	    if(arr[i]<=39)
	    {
	    	System.out.println("Fail");
	    }
    }
}
}