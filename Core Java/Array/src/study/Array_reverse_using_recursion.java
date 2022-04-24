package study;

public class Array_reverse_using_recursion {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		reverse(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

	private static void reverse(int[] arr, int low, int high) {
		int temp;
		if(low>=high)
		{
			return;
		}
		temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		reverse(arr,low+1,high-1);
	}

}
