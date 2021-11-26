
//Note:input Arrays must be already sorted


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Enter Array for array1 and array2 size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int[n];
		read(arr);
		int [] brr = new int[n];
		read(brr);
		System.out.println("Array1:");
		printArray(arr);
		System.out.println("Array2:");
		printArray(brr);
		int [] crr = new int[2*n];
		Sort_Merge.merge_arr(arr,brr,crr);
		System.out.println("Sorted Merged Array:");
		printArray(crr);
		
	}
	static void read(int arr[])
	{
		System.out.println("Enter elements of array in sorted order:");
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


