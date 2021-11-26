package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CrashingProgram {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter Divident: ");
		int divident = sc.nextInt();
		try {
		System.out.println("Enter Divisor: ");
		int divisor = sc.nextInt();
        int division = divident/divisor;
		
		System.out.println("Division ="+division);
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
		
		}
		catch(InputMismatchException im)
		{
			System.out.println(im);
		}
	}

}
