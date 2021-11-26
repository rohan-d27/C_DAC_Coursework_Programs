/*COP_Assignmnt_4*/
/*Q3.In the class that you wrote yesterday for Array functionalities add below functions to it.
1. sort the array
2. left_rotate
3. right_rotate
4 . insert_arr
5. delete_array
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int []arr=new int[5];
		read(arr);
		System.out.println("Default Array:");
		display(arr);
		menu(arr);
		
	}
	
	static void read(int arr[])
	{
		System.out.println("Enter elements of array:");
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	static void menu(int []arr)
	{
		int pos=3;
		int key=20;
		System.out.println("\n\nEnter a choice from following: \r\n"
				+ "1)left_shift\r\n"
				+ "2)right_shift\r\n"
				+ "3)left_rotate\r\n"
				+ "4)right rotate\r\n"
				+ "5)insert\r\n"
				+ "6)delete\r\n"
				+ "7)Sort Array\r\n");
		Scanner bc=new Scanner(System.in);
		int c=bc.nextInt();
		if(c==1)
		{
			left_shift(arr);

		}
		if(c==2)
		{
			right_shift(arr);

		}
		if(c==3)
		{
			left_rotate(arr);

		}
		if(c==4)
		{
			right_rotate(arr);

		}
		if(c==5)
		{
			insert(arr,pos,key);

		}
		if(c==6)
		{
			delete(arr,pos);

		}
		if(c==7)
		{
			selectionSort(arr);

		}


	}
	static void display(int []arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

	}
	static void left_shift(int []arr)
	{
		int i;
		for(i=0;i<arr.length-1;i++) 
		{
			arr[i]=arr[i+1];
		}
		arr[i]=0;
		System.out.println("\nLeft shift array:");
		display(arr);
	}

	static void right_shift(int []arr)
	{

		int i;
		for(i=arr.length-1;i>0;i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[i]=0;
		System.out.println("\nRight shift array:");
		display(arr);
	}

	static void left_rotate(int []arr)
	{
		int i,temp;
		temp=arr[0];
		for(i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		System.out.println("\nleft rotate array:");
		display(arr);
	}

	static void right_rotate(int []arr)
	{
		int i,temp;
		temp=arr[arr.length-1];
		for(i=arr.length-1;i>0;i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
		System.out.println("\nright rotate array:");
		display(arr);

	}

	static void insert(int []arr,int pos,int key)
	{
		int i;
		for(i=arr.length-1;i>=pos;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[i]=key;
		System.out.println("\nafter insertion array:");
		display(arr);
	}

	static void delete(int []arr,int pos)
	{
		int i;
		for(i=pos-1;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=0;
		System.out.println("\nafter deletition array:");
		display(arr);
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

