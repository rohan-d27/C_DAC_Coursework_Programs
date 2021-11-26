
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
	public Stack merge(Stack s){
		Stack temp=new Stack(10);
		while(this.top!=-1)
		{
			temp.push(this.pop());
		}
		while(s.top!=-1)
		{
			temp.push(s.pop());
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



