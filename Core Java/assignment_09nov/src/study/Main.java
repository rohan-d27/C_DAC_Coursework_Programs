package study;

import java.util.Scanner;

import util.math.Calculator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter two numbers to add:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition: "+ Calculator.add(a,b));
	}

}
