
public class Sort_Merge {

	
	public static void merge_arr(int[] arr,int [] brr,int[] crr)
	{
		int ai,bi,ci;
		ai=bi=ci=0;
		while((ai<arr.length)&&(bi<brr.length))
		{
			if(arr[ai]<=brr[bi])
			{
				crr[ci]=arr[ai];
				ci=ci+1;
				ai=ai+1;
			}
			else if(arr[ai]>=brr[bi])
			{
				crr[ci]=brr[bi];
				ci=ci+1;
				bi=bi+1;
			}
//			else
//			{
//			crr[ci]=arr[ai];
//			ci=ci+1;
//				ai=ai+1;
//				bi=bi+1;
//			}
		}
		while(ai<arr.length)
		{
			crr[ci]=arr[ai];
			ci=ci+1;
			ai=ai+1;
		}
		while(bi<brr.length)
		{
			crr[ci]=brr[bi];
			ci=ci+1;
			bi=bi+1;
			
			
			
		}
	}
} 
