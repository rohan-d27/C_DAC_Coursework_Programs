
public class Main {

	public static void main(String[] args) {
		
	        int arr[] = {10, 7, 8, 9, 1, 5};
	       System.out.println("Entered Array");
	       printArray(arr);
	        quick(arr);
	        System.out.println("sorted array");
	        printArray(arr);
	    }
	public static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	public static void quick(int[] arr)
	{
		quicksort(arr, 0, arr.length-1);
	}
	public static int partition(int arr[], int low, int high)
	 {
	     int pivot = arr[high]; 
	     int i = (low-1); // index of smaller element
	     for (int j=low; j<high; j++)
	     {
	         // If current element is smaller than or
	         // equal to pivot
	         if (arr[j] <= pivot)
	         {
	             i++;

	             // swap arr[i] and arr[j]
	             int temp = arr[i];
	             arr[i] = arr[j];
	             arr[j] = temp;
	         }
	     }

	     // swap arr[i+1] and arr[high] (or pivot)
	     int temp = arr[i+1];
	     arr[i+1] = arr[high];
	     arr[high] = temp;

	     return i+1;
	 }


	 /* The main function that implements QuickSort()
	   arr[] --> Array to be sorted,
	   low  --> Starting index,
	   high  --> Ending index */
	 public static void quicksort(int arr[], int low, int high)
	 {
	     if (low < high)
	     {
	         /* pi is partitioning index, arr[pi] is 
	           now at right place */
	         int pi = partition(arr, low, high);

	         // Recursively sort elements before
	         // partition and after partition
	         quicksort(arr, low, pi-1);
	         quicksort(arr, pi+1, high);
	     }
	 }
	

}
