
public class EmpQueue {

	Employee [] arr;
	int F;
	int R;

	public EmpQueue(int size) 
	{
		arr = new Employee[size];
		F= -1;
		R= -1;
	}
	
	public void insert(Employee value)
	{
		//Check full condition
		if(R == arr.length-1)
		{
			System.out.println("Queue is Full");
		}
		else
		{
			//we have some space in queue..
			//But check if this is first insert
			if(R == -1)
			{
				R++;
				F++;
			}
			else
			{
				R++;
			}
			
			arr[R] = value;			
		}
	}
	
	public Employee remove()
	{
		//Check for Empty queue
		if(F == -1)
		{
			System.out.println("Queue is Empty!");
			return null;
		}
		else
		{
			Employee e = arr[F];

			//check if only one emp in queue?
			if(F == R)
				F=R=-1;
			else
				F++;

			return  e;
		}
	}
	
	public String toString() {

		String str = "";

		//First check for empty condition
		if(F == -1)
		{
			str = "Queue is Empty!";
		}
		else
		{
			for(int i=F; i<=R; i++)
			{
				str += arr[i] + "\n";
			}
		}
		return str;
	}
	
	
	
}
