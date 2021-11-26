import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter size of array:\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		read(arr);
		System.out.print("\n Entered Array is:");
		display(arr);
		sequentialSearch(arr);
		
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
	static void sequentialSearch(int []arr)
	{
		System.out.println("Enter element you want to search:\n");
		Scanner vc=new Scanner(System.in);
		int key=vc.nextInt();
		int pos=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				pos=i+1;
				break;
			}	
		}
		System.out.println("Entered element found at following position:" + pos);
		//return pos;
	}
}
