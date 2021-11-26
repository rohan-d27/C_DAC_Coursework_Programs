//COP_Assignment_5
/*
2)Print following pattern
1
22
333
4444
333
22
1 
*/


public class Main_Q2 {

	public static void main(String[] args) {
		int i=1;
		
			print(i);
			
	}


	   public static void print(int i)
	{ 
		 for(int j=0;j<i;j++)
	    {
		  System.out.print(i);
		  
	    }
		 System.out.print("\n");
		 if(i<4)
		 {
		     print(i+1);
		 }

	     i=i-1;
		 for(int j=0;j<i;j++)
		    {
			 System.out.print(i);  
		    }
			 System.out.print("\n");
	}

}
