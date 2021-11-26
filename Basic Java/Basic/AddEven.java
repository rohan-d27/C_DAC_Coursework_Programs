package com.cdac.iet;/*Write a Java program to add all even number from 1 to 10 and print it.*/




public class AddEven
{
	public static void main(String args[])
{
	int add=0;
	
	for(int i=0;i<11;i++)
	
	{
		if(i%2==0)
		{
			add=add+i;
		}
		
	}
	System.out.println("Addition of even numbers till 10 is " +add);
}

}