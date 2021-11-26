package generic_stack;

public class User_Stack {

	public static void main(String[] args) {
				MyStack stack=new MyStack(new Integer[5]);
		try {
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(7);
			//stack.push(8);
		}
		catch (StackFullException se) {
			System.out.println(se);
		}  

		//System.out.println("last line");
	
		while(true)
	{
		try {
		int x = (int) stack.pop();
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
