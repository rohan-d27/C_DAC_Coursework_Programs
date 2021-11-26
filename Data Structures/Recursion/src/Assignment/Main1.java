package Assignment;



import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Enter number of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			print(i,n);
			
	}


	   public static void print(int i,int n)
	{ 
		 for(int j=0;j<i;j++)
	    {
		  System.out.print(i);
		  
	    }
		 System.out.print("\n");
		 if(i<n)
		 {
		     print(i+1,n);
		
		 }
		
		     i=i-1;
			 for(int j=0;j<i;j++)
			    {
				  System.out.print(i);  
			    }
				 System.out.print("\n");
		 }
	}


