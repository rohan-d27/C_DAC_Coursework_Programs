package test_exceptiom_chaining;

import java.util.Scanner;

public class TestExceptionChaining {

	public static void main(String[] args) {
		try {
			manager();
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Please enter number!!!");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("inside finally");
		}
		System.out.println("last line");
	}
	public static void worker() throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		int x = Integer.parseInt(s);
		System.out.println(x);
		throw new Exception();
		
	}

	public static void supervisor() throws Exception
	{
		worker();
	}

	public static void manager() throws Exception
	{
		supervisor();
	}
}
