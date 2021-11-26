import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int []arr= {10,20,30,40,50};
		
		System.out.println("Default Array:");
		read(arr);
		 menu(arr);
	}
	static void menu(int []arr)
	{
		int pos=3;
	    int key=20;
		System.out.println("\n\nEnter a choice from following: \r\n"
				+ "1)left_shift\r\n"
				+ "2)right_shift\r\n"
				+ "3)left_rotate\r\n"
				+ "4)right rotate\r\n"
				+ "5)insert\r\n"
				+ "6)delete\r\n");
		Scanner bc=new Scanner(System.in);
		int c=bc.nextInt();
		if(c==1)
		{
			left_shift(arr);
			   menu(arr);
		}
		if(c==2)
		{
			right_shift(arr);
			 menu(arr);
		}
		if(c==3)
		{
			left_rotate(arr);
			 menu(arr);
		}
		if(c==4)
		{
			right_rotate(arr);
			  menu(arr);
		}
		if(c==5)
		{
			insert(arr,pos,key);
			 menu(arr);
		}
		if(c==6)
		{
			delete(arr,pos);
			menu(arr);
		}
		
	}
    static void read (int []arr) 
    {
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i] + " ");
	}
	
    }
	static void left_shift(int []arr)
	{
		int i;
		for(i=0;i<arr.length-1;i++) 
		{
			arr[i]=arr[i+1];
		}
		arr[i]=0;
		System.out.println("\nLeft shift array:");
		read(arr);
	 }
	
	 static void right_shift(int []arr)
	 {

		int i;
		for(i=arr.length-1;i>0;i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[i]=0;
		System.out.println("\nRight shift array:");
		read(arr);
	 }

	 static void left_rotate(int []arr)
	 {
		int i,temp;
		temp=arr[0];
		for(i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		System.out.println("\nleft rotate array:");
		read(arr);
	   }

	  static void right_rotate(int []arr)
	  {
		int i,temp;
		temp=arr[arr.length-1];
		for(i=arr.length-1;i>0;i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
		System.out.println("\nright rotate array:");
		read(arr);
		
	   }

	 static void insert(int []arr,int pos,int key)
	 {
	    int i;
	    for(i=arr.length-1;i>=pos;i--)
	    {
	    	arr[i]=arr[i-1];
	    }
	    arr[i]=key;
	    System.out.println("\nafter insertion array:");
	    read(arr);
	  }

	  static void delete(int []arr,int pos)
	  {
		int i;
		for(i=pos-1;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=0;
		System.out.println("\nafter deletition array:");
		read(arr);
	  }
	
}
