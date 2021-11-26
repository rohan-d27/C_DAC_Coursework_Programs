//COP_Assignment_5
/*1)Print following pattern
*
**
***
****
 
 */
public class Main_Q1 {

	public static void main(String[] args) {
		
		int i=1;
	
			print(i);
			
	}


	   public static void print(int i)
	{ 
		 for(int j=0;j<i;j++)
	    {
		  System.out.print("*");
		  
	    }
		 System.out.print("\n");
		 if(i<4)
		 {
		     print(i+1);
		
		 }
		
	}

}
