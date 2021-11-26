package com.cdac.iet;/*7. Write a Java program to display addition of 1 to 10 integer numbers.*/

public class add1to10{

	public static void main(String Args[])
	{
		int sum=0;
		for(int i=0;i<11;i++)
		{
			sum+=i;
		}
	  System.out.print("Addition of 1 to 10 numbers is "+sum);
	}

}