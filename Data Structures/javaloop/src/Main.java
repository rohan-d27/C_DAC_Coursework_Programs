/*COp_Assignment_4*/
/*Q2 Write a JavaLoops class to have all static methods to do below operations using loop.
1.program to print x raised to the power y, 
where x and y are positive integers and taken from the user.
(hint->For example if x=3 and y=4 then ouput is 3*3*3*3=81)
2.Print the Fibonacci  series as follows: -  
    0	1	1	2	3	5	8	13….n  
3. Display 1 to n prime numbers. take input n from user.*/
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Javaloop arr=new Javaloop();
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		arr.setN(no);
		menu(arr);

	}
	public static void menu(Javaloop arr)
	{

		System.out.println("\nEnter a choice from following \n1.print x raised to the power y \n2.Print the Fibonacci series as \n3. Display 1 to n prime numbers. take input n from user");
		Scanner bc=new Scanner(System.in);
		int c=bc.nextInt();
		if(c==1)
		{
			arr.power();
			menu(arr);
		}
		if(c==2)
		{
			arr.fibonacci();
			menu(arr);
		}
		if(c==3)
		{
			arr.prime();
			menu(arr);
		}

	}
}
