//COP_Assignment_3
//Q1).Program to print histogram of vowels for an user input string.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		convert(str);

	}
	static void convert(String str)
	{
		char ch[] = str.toCharArray();
		int count1=0,count2=0,count3=0,count4=0,count5=0;
		for (int i = 0; i < str.length(); i++) 
		{
			if(ch[i]=='a'|| ch[i]=='A')
			{
				count1=count1+1;

			}
			if(ch[i]=='e'|| ch[i]=='E')
			{
				count2=count2+1;

			}
			if(ch[i]=='i'||ch[i]=='I')
			{
				count3=count3+1;
			}
			if(ch[i]=='o'||ch[i]=='O')
			{
				count4=count4+1;
			}
			if(ch[i]=='u'||ch[i]=='U')
			{
				count5=count5+1;
			}

		}
				System.out.print("a:");
				print_histogram(count1);
				System.out.print("e:");
				print_histogram(count2);
				System.out.print("i:");
				print_histogram(count3);
				System.out.print("o:");
				print_histogram(count4);
				System.out.print("u:");
				print_histogram(count5);	
	}
	static void print_histogram(int count)
	{

		for(int i=0; i<count; i++)
		{
			System.out.print("*");
		}
		System.out.println("\n");
	}


}
