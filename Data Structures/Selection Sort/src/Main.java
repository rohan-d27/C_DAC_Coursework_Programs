import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

	   System.out.println("Enter size of array:\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		read(arr);
		System.out.print("\nEntered Array is:");
		display(arr);
		selectionSort(arr);
		
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
		System.out.println("\n");
	}
	
	static void selectionSort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sorting array is:");
		display(arr);
	}
	
}


