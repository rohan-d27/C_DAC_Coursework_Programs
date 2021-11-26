/*COP_Assignment_1*/
/*Q4. Write a Java Program to Create an array and write a function to reverse the array.*/
import java.util.Scanner;

public class Main_Reverse_Array {

	public static void main(String[] args) {
		int []arr =new int[5];
		System.out.println("Enter 5 elements of array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered Array is:");	
		display(arr);
		reverse(arr);
	}
	static void display(int arr[])
	{

		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("\t%d",arr[i]);
		}
	}

	static void reverse(int arr[])
	{
		int brr[]=new int[5];
		int j=4;
		for(int i=0;i<5;i++)
		{
			brr[j]=arr[i];
			j--;
		}
		System.out.println("\nReverse Array is:");	
		display(brr);

	}

}
