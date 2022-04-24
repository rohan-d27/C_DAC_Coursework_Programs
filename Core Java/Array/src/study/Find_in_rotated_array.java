package study;

public class Find_in_rotated_array {

	public static void main(String[] args) {

		int[] arr={50,60,70,10,20,30,40};
		int mid = 0,low=0,high=arr.length-1,key=30;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==arr[mid]) 
			{
				break;
			}
			else if (arr[low]<=arr[mid])
			{
				if((key>=arr[low])&&(key<arr[mid]))
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			else if((key>arr[mid])&&(key<=arr[high]))
			{
				
					low=mid+1;
			}
			else
			{
					high=mid-1;	
			}
			
		}
		if(key==arr[mid])
		{
			System.out.println("found at " +(mid+1) + " position");
		}
		else
		{
			System.out.println("not found");
		}
	}


}
