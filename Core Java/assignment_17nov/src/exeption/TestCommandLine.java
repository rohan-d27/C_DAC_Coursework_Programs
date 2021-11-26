package exeption;

public class TestCommandLine {

	public static void main(String[] args) {
		try {
			System.out.println("Original String: "+args[0]);
			System.out.println("UpperCase: "+ args[0].toUpperCase());
		}
		catch(ArrayIndexOutOfBoundsException a)
		{ 
			System.out.println(a);
		}

		try {
			int n=Integer.parseInt(args[1]);
			System.out.println("Number: "+args[1]);
			System.out.println("Square: "+n*n);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{ 
			System.out.println(a);
		}
		catch(NumberFormatException ne) 
		{
			System.out.println(ne);
		}
	}
}
