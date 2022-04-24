package study;

public class Last_Occuring_Position {

	public static void main(String[] args) {
		int key=10;
		int[] arr= {20,30,10,40,50,10,60};
		int pos=lastOccuringPosition(arr,key);
		System.out.println(key +" is found last at "+ pos +" position");

	}

	private static int lastOccuringPosition(int[] arr, int key) {
		int position=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				position=i;
			}
		}
		return position;
	}

}
