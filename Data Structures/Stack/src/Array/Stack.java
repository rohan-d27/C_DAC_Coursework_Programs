
package Array;

public class Stack {
	


		int arr[];
		int top;
		
		//------------------------
		
		Stack()
		{
			arr=new int[5];
			top=-1;
		}
		
		Stack(int size)
		{
			arr=new int[size];
			top=-1;
		}
		
		void push(int var)
		{
			if (top < arr.length-1)
			{
				top++;
				arr[top]=var;	
			}
			else 
			System.out.println("Stack is full/Stack overflow");
			
		}
		
		void pop()
		{
			int var=0;
			arr[top]=var;
			top--;
		}

		public String toString()
		{
			int j=top;
			String str=" ";
			str="{";
			for(j=top; j>=0; j--)
			{
				str=str + arr[j]+ ",";
			}
			str=str+"}";
		 return str;
		}

	}


