package exeption;

import java.util.Scanner;

public class User {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		MyDate d=new MyDate();
		System.out.println("Enter Day");
		int dd=sc.nextInt();
		d.setDate(dd);
		System.out.println("Enter Month");
		int dm=sc.nextInt();
		try {
			d.setMonth(dm);
		} catch (WrongMonthException e) {
			
			System.out.println(e);
		}
		System.out.println("Enter Year");
		int dy=sc.nextInt();
		d.setYear(dy);
	}

}
