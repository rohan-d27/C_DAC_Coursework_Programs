package com.cdac.iet;/*Write a program that converts kilometers per hour to miles per hour. miles = (kilometer  * 0.6213712)*/


import java.util.Scanner;


public class KmtoMile
{
	public static void main(String args[])
{
	System.out.println("Enter Speed in kmph");
	Scanner sc=new Scanner(System.in);
	float kmph=sc.nextFloat();
	float mph=kmph*0.6213712f;
	System.out.println("Speed in mph:"+mph);
}


}