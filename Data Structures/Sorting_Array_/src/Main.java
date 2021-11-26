import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) {
		
		System.out.println("Enter Array size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int[n];
		read(arr);
		System.out.println("Default Array:");
		printArray(arr);
		
		Sort.Insertion(arr, false);
		System.out.println("\nInsertion sorted Array in Ascending:");
		printArray(arr);
		
		Sort.Insertion(arr, true);
		System.out.println("\nInsertion sorted Array in Descending:");
		printArray(arr);
		
		Sort.Selection(arr, false);
		System.out.println("\nSelection sorted Array in Ascending:");
		printArray(arr);
		
		Sort.Selection(arr, true);
		System.out.println("\nSelection sorted Array in Descending:");
		printArray(arr);
		
		Sort.Bubble(arr, false);
		System.out.println("\nBubble sorted Array in Ascending:");
		printArray(arr);
		
		Sort.Bubble(arr, true);
		System.out.println("\nBubble sorted Array in Descending:");
		printArray(arr);
		
		Sort.Quick(arr,false);
		System.out.println("\nQuick sorted Array in Descending:");
		printArray(arr);
		
		Sort.Quick(arr,true);
		System.out.println("\nQuick sorted Array in Ascending:");
		printArray(arr);
		
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

	public static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}
	
	
}
