package assignment_20dec;
import java.util.Scanner;

import study.FeatureList;
import study.impl.HiFICalc;
public class User {

	public static void main(String[] args) {
		
    doSomeCalculations(new HiFICalc());
	}

	private static void doSomeCalculations(FeatureList obj) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1 for addition:");
		double num1=sc.nextDouble();
		System.out.println("Enter number2 for addition:");
		double num2=sc.nextDouble();
		System.out.println("Addition: "+obj.add(num1, num2)+"\n");
		System.out.println("Enter number1 for division:");
		int num3=sc.nextInt();
		System.out.println("Enter number2 for division:");
		int num4=sc.nextInt();
		
		System.out.println("Division Result: "+obj.integerDivision(num3, num4)+"\n");
	}

}
