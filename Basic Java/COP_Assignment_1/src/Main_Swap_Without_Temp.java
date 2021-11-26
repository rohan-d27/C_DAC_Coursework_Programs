/*COP_Assignment_1*/
/*Q6. Swap two numbers without using a third variable.*/

import java.util.Scanner;

public class Main_Swap_Without_Temp {
	public static void main(String args[]) {

		System.out.println("Enter num1:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		System.out.printf("\nBefore swapping Num1 is %d Num2 is %d",num1,num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.printf("\nAfter swapping Num1 is %d Num2 is %d",num1,num2);

	}
}
