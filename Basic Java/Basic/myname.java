package com.cdac.iet;

import java.util.Scanner;

public class myname
{

	public static void main(String[] args)
	{	
		String name = "";
		System.out.print("Enter your name: ");
		Scanner sc = new Scanner(System.in) ;
		name = sc.next();
		System.out.println("Your name is: "+ name );
		
		
	}

}
