package generic_stack;

public class MyGenericStack<T>  {
	
	private T[] arr;
	int topIndex=-1;
	
	public MyGenericStack(T[] ar)
	{
		arr= ar;
	}
	
	public void push(T obj) throws StackFullException
	{
		int temp = ++topIndex;
		if(temp < arr.length)
		  arr[temp] = obj;
		else
		{
			throw new StackFullException();
			//System.out.println("stack full");
		}
			
	}
	
	
	public T pop()
	{
		int temp = topIndex;
		if(temp >=0)
		{
			return arr[topIndex--];
		}
		else
			return null;
	}
	
	public void display()
	{
		for(int i=0;i<=topIndex;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

