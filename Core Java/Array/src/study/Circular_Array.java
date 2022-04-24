package study;

public class Circular_Array {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		//shiftArray(arr);
		display(arr);
		shiftPosition(arr,6);
		display(arr);

	}

	private static void shiftArray(int[] arr) {
		int temp = arr[0];
		int i;
		for (i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[i - 1] = temp;

	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
	
	public static void shiftPosition(int[] arr, int k)
	{
	    k = k % arr.length;
	    System.out.println(k);
	    while (k-- > 0)
	    {
	        int tmp = arr[0];
	        for (int i = 1; i < arr.length; i++)
	            arr[i - 1] = arr[i];
	        arr[arr.length - 1] = tmp;
	    }
	}
}
