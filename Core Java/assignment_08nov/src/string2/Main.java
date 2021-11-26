package string2;

public class Main {
    public static void main(String[] args) {
		
    	String s1= "IET";
    	String s2= "IET";
    	if(s1==s2) //check if reference is same 
    	{
    		System.out.println("true");
    	}
    	else
    	{
    		System.out.println("false");
    	}
    	String s3=new String("IET"); //check if reference is same 
    	if(s1==s3)
    	{
    		System.out.println("true");
    	}
    	else
    	{
    		System.out.println("false");
    	}
    	
	}
}
