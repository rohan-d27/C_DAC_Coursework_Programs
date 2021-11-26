
public class Main {

	
	public static void main(String[] args) {
		
		int [] arr = new int[]{31,32,21,87,65,78,42,10,67,14};
		System.out.println("Default Array:");
		printArray(arr);
		insertionSortA(arr);
		System.out.println("Insertion sorted Array in Ascending:");
		printArray(arr);
		insertionSortD(arr);
		System.out.println("Insertion sorted Array in Descending:");
		printArray(arr);
		selectionSortA(arr);
		System.out.println("Selection sorted Array in Ascending:");
		printArray(arr);
		selectionSortD(arr);
		System.out.println("Selection sorted Array in Descending:");
		printArray(arr);
		
	}

	public static void insertionSortA(int[] arr) {
		
		for(int i=1; i<arr.length; i++)
		{
			int tmp = arr[i];
			int k = i-1;
			
			while(k >= 0)
			{
				if(tmp < arr[k])
				{
					arr[k+1] = arr[k];
					k--;
				}
				else
					break;
			}
			arr[k+1] = tmp;
		}
	}
	
	public static void insertionSortD(int[] arr) {
		
		for(int i=1; i<arr.length; i++)
		{
			int tmp = arr[i];
			int k = i-1;
			
			while(k >= 0)
			{
				if(tmp > arr[k])
				{
					arr[k+1] = arr[k];
					k--;
				}
				else
					break;
			}
			arr[k+1] = tmp;
		}
	}
	
	public static void selectionSortA(int[] arr) {
		
		for(int j=0; j<arr.length-1; j++)
		{
			int tmp = arr[j];
			for(int i=j+1; i<arr.length; i++)
			{
				if(arr[i] < tmp)
				{
					int x = arr[i];
					arr[i] = tmp;
					tmp = x;
				}
			}
			arr[j] = tmp;
		}
	}
	public static void selectionSortD(int[] arr) {
		
		for(int j=0; j<arr.length-1; j++)
		{
			int tmp = arr[j];
			for(int i=j+1; i<arr.length; i++)
			{
				if(arr[i] > tmp)
				{
					int x = arr[i];
					arr[i] = tmp;
					tmp = x;
				}
			}
			
			arr[j] = tmp;
		}
	}

	public static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ "   ");
		}
		System.out.println();
	}
	
	
}
