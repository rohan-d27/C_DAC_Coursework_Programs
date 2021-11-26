
public class Queue {

	int [] arr;
	int F;
	int R;

	Queue()
	{
		arr = new int[5];
		F= -1;
		R= -1;
	}
	
	Queue(int size)
	{
		arr = new int[size];
		F= -1;
		R= -1;
	}

	public void insert(int value)
	{
		if(R < arr.length-1 )
		{
			R++;
			arr[R] = value;

			//Check for 1st value insertion
			if(F == -1)
				F=0;
		}
		else
			System.out.println("Queue is FULL!");		
	}

	public int remove()
	{
		//First check for empty condition
		if(F == -1)
		{
			System.out.println("Queue is Empty!");
			return 0;
		}

		int value = arr[F];

		//Check if this is was the last value..  
		if(F == R)
			F=R= -1;
		else
			F++;

		return value;
	}

	public String toString() {

		String str = ""; //String initialized

		//First check for empty condition
		if(F == -1)
		{
			str = "Queue is Empty!";
		}
		else
		{
			for(int i=F; i<=R; i++)
			{
				str += arr[i] + "  ";
			}
		}
		return str;
	}

	public void sameAs(Queue x)
	{
		// q2 ==> this
		// q1 ==> x
		
		this.F = x.F;
		this.R = x.R;
		
		for (int i = x.F; (i != -1 && i <= x.R) ; i++) 
		{
			this.arr[i] =  x.arr[i];
		}
	}
		public Queue concat(Queue q)
		{
			Queue temp=new Queue(10);
			while(this.F!=-1)
			{
				temp.insert(this.remove());
			}
			while(q.F!=-1)
			{
				temp.insert(q.remove());
			}
			
			return temp;
		}

}
