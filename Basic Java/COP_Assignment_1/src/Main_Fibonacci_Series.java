/*COP_Assignment_1*/
/*Q11.Write a Java program to calculate the fibonacci series*/


import java.util.Scanner;
public class Main_Fibonacci_Series {

	public static void main(String[] args) {
		System.out.println("Enter a number till you want to see Fibonacci numbers: ");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.println("Fibonacci numbers are: ");
		int n1=0,n2=1,n3,i;    
		System.out.print(n1+" "+n2);   

		for(i=2;i<count;++i)
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		}    


	}

}
