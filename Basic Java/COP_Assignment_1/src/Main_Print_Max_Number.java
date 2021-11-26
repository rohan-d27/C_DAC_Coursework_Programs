/*COP_Assignment_1*/
/*Q7. Write a Java program to enter three numbers and print maximum number.*/
import java.util.Scanner;

public class Main_Print_Max_Number {

	public static void main(String[] args) {
		System.out.println("Enter num1:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		System.out.println("Enter num3:");
		int num3=sc.nextInt();
		if(num1>num2&&num1>num3)
		{
			System.out.println("Num1 is maximum number:"+ num1 );
		}
		if(num2>num1&&num2>num3)
		{
			System.out.println("Num2 is maximum number:"+num2 );
		}
		if(num3>num1&&num3>num2)
		{
			System.out.println("Num3 is maximum number:"+num3 );
		}
	}

}
