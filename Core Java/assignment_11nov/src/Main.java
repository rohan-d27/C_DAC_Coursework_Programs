
public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,6};
	
		
		for(int i=0,j=arr.length;i<arr.length*2;i++,j--)
		{
			if(j>-1)
		System.out.println(arr.length%j);
			else
				j=arr.length;
		
		}
	}

}
