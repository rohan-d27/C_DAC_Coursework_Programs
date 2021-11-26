//COP_Assignment_5
/*3)Print following pattern
1,2,3,4....98,99,100,99,98,....3,2,1
*/
public class Main_Q3 {

	public static void main(String[] args) {
		int i=1;
		
		print(i);
		
	}

	   public static void print(int i)
	{ 
		   System.out.print(i);
		   System.out.print("\n");
		   if(i<100)
			 {
			     print(i+1);
			 }  
		   i=i-1;
		System.out.print(i);  
		    
		   System.out.print("\n");
}
}