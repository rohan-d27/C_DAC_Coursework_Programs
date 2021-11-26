package stringbuffer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer s1=new StringBuffer(str);  
		
		
		if(str.equals(s1.reverse().toString()))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
		}

}
