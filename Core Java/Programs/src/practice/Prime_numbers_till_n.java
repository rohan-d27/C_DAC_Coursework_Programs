package practice;

import java.util.Scanner;

public class Prime_numbers_till_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 and " + n);
		// loop through the numbers one by one
		for (int i = 1; i < n; i++) {
			boolean isPrime = true;
			// check to see if the number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// print the number
			if (isPrime)
				System.out.print(i + " ");
		}
	}
}
