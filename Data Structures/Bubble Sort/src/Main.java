
public class Main {


	public static void main(String[] args) {

		int[] arr=new int[] {12,5,75,23,87,30};
		System.out.println("Default Array:");
		display(arr);
		System.out.println("\nSorted Array:");
		bubbleSort(arr);
		display(arr);
	}
	static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	static void bubbleSort(int arr[])
	{
		int i,j,temp,exchange;
		for(i=0;i<arr.length-1;i++)
		{
			exchange=0;
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					exchange++;
				}
			}
			if(exchange==0)
				break;
		}

	}
		
	
}
