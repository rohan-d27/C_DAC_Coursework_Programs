package com.cdac.iet;

import java.util.Scanner;

public class Vhyst
{
	public static void main(String [] args)
	{
		int arr[] = new int[3];
		System.out.print("Enter 3 numbers : ");
		int i ,j,l;
		Scanner scn = new Scanner(System.in);
		for( i = 0; i <3 ; i++)
		{
			arr[i] = scn.nextInt();
		}
		System.out.println("________________________________");
		int loop,max=0;
		for ( i = 0 ;i <3; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		loop =max;
		int clm;
		clm = loop -1;
	
		for(j = 0; j < loop;j++)
		{
			for(l =0; l <3 ; l++)
			{
				if(arr[l]>clm)
				{
					System.out.print(" *");
				}
				
				else
				{
					System.out.print("  ");
				}
			}
			clm--;
			System.out.println("");
		}
		System.out.println("________________________________");
		for(i =0; i<3;i++)
			{
				System.out.print(" " +arr[i]);	
			}
		System.out.println("");
		
	}
}
