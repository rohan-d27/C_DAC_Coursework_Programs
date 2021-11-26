package testfinally;


public class TestFinally {
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println("inside try");
			throw new NullPointerException();
			//System.out.println("below thro");
		}
		catch(NullPointerException e)
		{
			System.out.println("inside catch");
		}
		finally
		{
			System.out.println("inside finally");
		}
		
		System.out.println("last line");
			
	}
	
	
	

}
