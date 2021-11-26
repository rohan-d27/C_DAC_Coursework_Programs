
public class Stack {
	int [] arr;
	int top;

	public Stack() {
		top = -1;
		arr = new int[5];
	}
	
	public Stack(int size)
	{
		top = -1;
		arr = new int[size];
	}

	public void push(int value) {

		if(top < arr.length-1)
		{
			top++;
			arr[top] = value;
		}
		else
			System.out.println("Stack Overflow!");
	}

	public int pop() {

		int value=0;

		if(top > -1)
		{
			value = arr[top];
			top--;
		}
		else
			System.out.println("Stack Underflow!");

		return value;
	}
	public Stack add(Stack s2){
		int a[]=new int[5];
		int b[]=new int[5];
		int[] add=new int[5];
		Stack temp=new Stack();
		for(int i=0;i<5;i++)
		{
			a[i]=this.pop();		
		    b[i]=s2.pop();		
			add[i]=a[i]+b[i];
			
			temp.push(add[i]);
		}
		
		return temp;
		
	}

	public String toString() {
		String str = "";
		
		if(top == -1)
		{
			str = "Stack is Empty!";
		}
		else
		{			
			for (int j = top; j >= 0; j--) {
				str = str + arr[j] + "  ";			
			}
			str = str + "\n";
		}
		
		return str;
	}

}



