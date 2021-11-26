package Q3.Array;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	int arr[]=new int[10];
	int brr[]=new int[10];
	read(arr);
	read(brr);
	System.out.println("Array1:");
	display(arr);
	System.out.println("\nArray2:");
	display(brr);
	menu(arr,brr);
}
static void menu(int arr[],int brr[])
{
	System.out.println("\nEnter choice from the following: \n1.Copy elements of array \n2.Concat two array \n3.Reverse of array");
	
	Scanner sc=new Scanner(System.in);
	int c=sc.nextInt();
	if(c==1)
	{
	   copy(arr);
	   menu(arr,brr);
	}
	if(c==2)
	{
		concat(arr,brr);
		menu(arr,brr);
	}

   if(c==3)
   {
	 reverse(arr);
	 menu(arr,brr);
   }
}
public static void copy(int arr[])
{
	int[] drr=new int[10];
	for(int i=0;i<drr.length;i++)
	{
		drr[i]=arr[i];	
}
	System.out.println("\nCopied Elements:");
	display(drr);
}
public static void concat(int arr[], int brr[])
{
	
	int[] crr=new int[20];
	for(int i=0;i<10;i++)
	{
		crr[i]=arr[i];
	}
	for(int j=10, k=0;j<20 && k<brr.length;j++,k++)
	{
		crr[j]=brr[k];
	}

	System.out.println("\nArray3:\n");
	display(crr);
}
public static void read(int arr[])
{
	System.out.println("Enter elements of array:");
	Scanner sc=new Scanner(System.in);

	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
}
public static void display(int []arr) 
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i] + " ");
	}
}
public static void reverse(int arr[])
{
	int temp;
	for(int i=0,j=arr.length-1;i<j;i++,j--)
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	System.out.println("Reverse Array1:");
	display(arr);	
}
}