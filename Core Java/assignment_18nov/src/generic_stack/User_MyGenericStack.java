package generic_stack;


public class User_MyGenericStack {

	public static void main(String[] args) {
		MyGenericStack<Integer> stack = new MyGenericStack<>(new Integer[5]);
		
		try {
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(7);
			stack.push(8);
		}
		catch (StackFullException se) {
			System.out.println(se);
		}  
//		finally
//		{
//			System.out.println("the end");
//		}
		System.out.println("last line");
		
		while(true)
		{
			try {
			int x = stack.pop();
			System.out.println("Square of "+x+" is "+x*x);
			}
			catch(NullPointerException npe)
			{
				System.out.println("stack is empty");
				break;
			}
		}
	}

	}

