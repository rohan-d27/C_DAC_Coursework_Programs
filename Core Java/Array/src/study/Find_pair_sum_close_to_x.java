package study;
//Given a sorted array and number x, find the pair in array whose sum is closest to x.
//example:
//input: arr[]={10,22,28,29,30,40},x=54;
//outpur: 22 and 30;

//intput : arr[]={1,3,4,7,10},x=15;
//output : 4 and 10;

public class Find_pair_sum_close_to_x {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int x=70;
		int resi=0,resj=0;
		int sum=0;
		int diff=Math.abs(sum-x);
		
		//findPair1(arr,x,sum,resi,resj,diff);//O(n^2)
		findPairClosetoX(arr,x,sum,resi,resj,diff); //O(n)
	}

	private static void findPairClosetoX(int[] arr, int x, int sum, int resi, int resj, int diff) {
		int i=0,j=arr.length-1;
		while(j>i)
		{
			sum=arr[i]+arr[j];
			if(Math.abs(sum-x)<diff)
			{
				resi=i;
				resj=j;
				diff=Math.abs(sum-x);
			}
			if((arr[i]+arr[j])>x)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		System.out.println(arr[resi]+" & "+arr[resj]);
	}

	private static void findPair1(int[] arr, int x, int sum, int resi, int resj, int diff) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(Math.abs(sum-x)<diff)
				{
					resi=i;
					resj=j;
					diff=Math.abs(sum-x);
				}
			}
		}
		System.out.println(arr[resi]+" & "+arr[resj]);
		
	}
	
}
