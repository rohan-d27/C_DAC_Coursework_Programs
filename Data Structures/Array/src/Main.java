import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
	    read(arr);
	    display(arr);
	    menu(arr);
		
		
	}
	static void read(int arr[])
	{
		System.out.println("Enter elements of array");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
		}
	}
	static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	static void minimum(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i]<min)
			{
			min=arr[i];
			}
		}
		System.out.println("Minimum of array is : " + min);
	}
	static void maximum(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
			max=arr[i];
			}
		}
		System.out.println("Maximum of array is : " + max);
	}
	static void reverse(int arr[])
	{
		int temp;
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		display(arr);
		
	}

	static void even(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
		
	}
	static void menu(int arr[])
	{
		System.out.println("\nEnter choice from the following: \n1.Minimum element of array \n2.Maximum element of array \n3.Reverse of array \n4.Even elements of array \n5.Exit");
		
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		if(c==1)
		{
		   minimum(arr);
		   menu(arr);
		}
		if(c==2)
		{
			maximum(arr);
			menu(arr);
		}
	
	   if(c==3)
	   {
		 reverse(arr);
		 menu(arr);
	   }
	   if(c==4)
	   {
		even(arr);
		 menu(arr);

	   }
	   if(c==5)
	   {
		   return;
	   }

}
}