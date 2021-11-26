package com.cdac.iet;

public class Pattern
{
	public static void main(String[] args)
	{
		pattern_1("*");
		pattern_2();
	}
	
	static void pattern_1(String s)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(s);
			}
			System.out.println("");
		}
	}

	static void pattern_2()
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(i+1);
			}
			System.out.println("");
		}
	}
}
