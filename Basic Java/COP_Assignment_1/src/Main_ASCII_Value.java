/*COP_Assignment_1*/
/*Q12.Write a program in Java to print character and its ASCII value.*/

import java.util.Scanner;
public class Main_ASCII_Value {

	public static void main(String[] args) {
		System.out.println("Enter a character:");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int n=ch;
		System.out.printf("ASCII value of %c is %d",ch,n);


	}

}
