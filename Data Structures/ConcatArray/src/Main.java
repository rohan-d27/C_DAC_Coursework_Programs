
public class Main {

	public static void main(String[] args) {
		
		int [] arr = new int[]{1,2,3,4,5};
		int [] brr = new int[]{6,7,8,9,10};
		int [] crr = new int[10];
	
		concatArray(arr, brr, crr);
		printArray(arr);
		printArray(brr);
		printArray(crr);
	}

	public static void concatArray(int[] arr, int[] brr, int[] crr) 
	{
		int k=0;
		for(int i=0; i< arr.length ; i++, k++)
		{
			crr[k] = arr[i];
		}
		
		for(int j=0; j< brr.length ; j++, k++)
		{
			crr[k] = brr[j];
		}
	}
	
	public static void printArray(int [] crr)
	{
		for(int i=0; i< crr.length ; i++)
		{
			System.out.print(crr[i] + ", ");
		}
		System.out.println();
	}
	
	
}
