package study;

public class Find_Sorted_Array_Binary_Search {

	public static void main(String[] args) {
		int[] arr= {10,20,30,30,30,40};
		int key=30;
		ps(arr,key);

	}

	private static int binarySearch(int[] arr,int key,int low,int high) {
		
		int mid=(low+high)/2;
		
		if(arr[mid]==key)
		{
			//System.out.println(mid);
			return mid;
		}
		else
		{
			if(arr[mid]<key)
			{
				binarySearch(arr,key,mid+1,high);
			}
			if(arr[mid]>key)
			{
				binarySearch(arr, key, low, mid-1);
			}
		}
		return 0;
	}
	private static void ps(int[] arr,int key) {
		
		int low=0,count=0;
		int high=arr.length;
		int pos=0;
		pos=binarySearch(arr,key,low,high);
		count=1;
		int t=pos;
		//System.out.println(pos);
		int right=pos+1;
		int left=pos-1;
		while(true)
		{
			if( right<arr.length && arr[right++]==key)
			{
				count++;
			}
			else if(left>=0 && arr[left--]==key)
			{
				count++;
			}
			else
				break;
		}
		System.out.println(key +" found "+(count)+" times");
	}

}
