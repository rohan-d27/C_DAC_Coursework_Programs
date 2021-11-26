/*COP_Assignment_1_Q1.Accept 5 numbers in an array. Add each number & Display the addition.*/



import java.util.Scanner;


public class Array2
{
	public static void main(String args[])
{
	int []arr =new int[5];
	System.out.println("Enter 5 elements of array");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
	 arr[i]=sc.nextInt();
	}
	System.out.println("Array is:");	
 	for(int i=0;i<arr.length;i++)
	{
	System.out.printf("\t%d",arr[i]);
	}
	int add=0;
	for(int i=0;i<arr.length;i++)
	{
	  add=add+arr[i];
    }
	System.out.printf("\nAddition of array element is: %d",add);
	

}

}