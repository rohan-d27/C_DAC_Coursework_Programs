package testfinally;


public class TestFinally2 {

	public static void main(String[] args) {
		try {
			System.out.println("inside try");
			//throw new NullPointerException();
		}
		finally
		{
			System.out.println("inside finally");
		}
		
		System.out.println("last line");

	}

}
