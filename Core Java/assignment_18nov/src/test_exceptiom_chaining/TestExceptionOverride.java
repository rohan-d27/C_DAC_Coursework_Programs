package test_exceptiom_chaining;

import java.io.FileNotFoundException;
import java.io.IOException;


public class TestExceptionOverride {

	public static void main(String[] args) {
	 A obj=new B();
	  
	 
	 try {
		obj.f1();
	} 
	   catch (FileNotFoundException fe) {
			System.out.println(fe);
		}
	   catch (IOException ie) {
		System.out.println(ie);
	}
	  catch (NumberFormatException ne) {
			System.out.println(ne);
		}
	   
	   catch (Exception e) {
			System.out.println(e);
		}
	}

}

class A
{
	void f1() throws IOException
	{
		System.out.println("by A with throws IOException");
	}
	
}
class B extends A
{   
	//@Override
//	void f1() throws Exception //can not make it broader
//	{
//		System.out.println("by B with throws Exception");
//	}
//	@Override
//	void f1() throws IOException
//	{
//		System.out.println("by B with throws IOException");
//	}
	//@Override
//	void f1() 
//	{
//		System.out.println("by B without throws");
//	}
//	@Override
//	void f1() throws FileNotFoundException //Signals that an attempt to open the file denoted by a specified pathname has failed.
//	{
//		System.out.println("by B with throws FileNotFoundException");
//	}
//	@Override
//	void f1() throws NumberFormatException
//	{
//		System.out.println("by B with throws NumberFormatException");
//	}
	
}
