/*COP_Assignment_1*/
/* Q1.Accept 5 numbers in an array.Add each number & Display the addition.*/
import java.util.Scanner;

public class Main_Array_elements_Addition {

	public static void main(String[] args) {
		
			int []arr =new int[5];
			System.out.println("Enter 5 elements of Array: ");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<arr.length;i++)
			{
			 arr[i]=sc.nextInt();
			}
			System.out.println("Entered Array Elements are: ");	
		 	for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i] + "  ");
			}
			int add=0;
			for(int i=0;i<arr.length;i++)
			{
			  add=add+arr[i];
		    }
			System.out.printf("\nAddition of Array elements is: %d",add);

	}

}
