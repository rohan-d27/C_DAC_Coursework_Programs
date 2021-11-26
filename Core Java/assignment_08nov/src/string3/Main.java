package string3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter String of 1's and 0's");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='0')
			{
				System.out.print(s1.charAt(i));
				
			}
		}
		

	}

}
