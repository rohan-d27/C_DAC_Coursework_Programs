//Write a program to reverse string using stack
public class Main_reverse_String {

	public static void main(String[] args) {
		
		        StringBuffer s= new StringBuffer("Rohan");
		        
		        reverse(s);
		         
		        
		        System.out.println("Reversed string is " + s);
		    }
	
	
	 public static void reverse(StringBuffer str)
	    {
	       
	        int n = str.length();
	        Stack m = new Stack(n);
	         
	        
	        int i;
	        for (i = 0; i < n; i++)
	        m.push(str.charAt(i));
	     
	       
	        for (i = 0; i < n; i++)
	        {
	            char ch = m.pop();
	            str.setCharAt(i,ch);
	        }
	    }
	     

	

}
