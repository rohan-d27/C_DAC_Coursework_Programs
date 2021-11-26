 
public class CQueue {
	
	int [] arr;
	int F;
	int R;
	
	public CQueue() {

		arr = new int[5];
		F=R=-1;
	}

	public CQueue(int size) {

		arr = new int[size];
		F=R=-1;
	}
	
	public void insert(int value)
	{
		if( (F==0 && R==arr.length-1) || (R+1 == F) )
		{
			System.out.println("Queue is Full!");
		}
		else
		{
			//we have some space in CQueue
			if(R == arr.length-1)
				R = 0;
			else
				R++;
			
			//now insert element in queue
			arr[R] = value;
			
			//Check if this is the first element in CQueue 
			if(F == -1)
				F++;
		}
	}
	
	public int remove()
	{
		int value = 0;
		if(F == -1)
		{
			System.out.println("Queue is Empty!");
		}
		else
		{
			//we have some element in queue
			value = arr[F];
			
			//Check for last element
			if(F == R)
			{
				F= R= -1;
			}
			else
			{
				//we have more than 1 element.. 
				if(F == arr.length-1)
					F = 0;
				else
					F++;
			}
		}
		return value;
	}
	
	
	public String toString() {
		
		String str = "";
		
		if(F == -1)
		{
			str = "CQueue is empty!";
		}
		else
		{
			int i=F;
			
			while( i != R )
			{
				str = str + arr[i] + ", ";
				
				if(i == arr.length-1)
					i = 0;
				else 
					i++;
				
				//i = (++i % arr.length);
			}
			//to capture last element
			str = str + arr[i] + ", ";
		}
		return str;
	}
}
