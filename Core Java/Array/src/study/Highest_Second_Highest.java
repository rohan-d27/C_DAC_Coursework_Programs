package study;

public class Highest_Second_Highest {

	public static void main(String[] args) {
		int[] arr= {10,20,30,60,80};
		int max=arr[0],smax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			
		}
		System.out.println("Max: "+ max+ ", Second Max: "+smax);
	}

}
