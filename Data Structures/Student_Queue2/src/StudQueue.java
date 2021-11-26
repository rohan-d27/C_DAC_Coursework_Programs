
public class StudQueue {

	Student []arr;
	int F;
	int R;

	StudQueue()
	{
		arr = new Student[5];
		F = R = -1;
	}
	StudQueue(int size)
	{
		arr = new Student[size];
		F = R = -1;
	}
	public void insert(Student s)
	{
		if(R < arr.length-1)
		{
			R++;
			arr[R]=s;

			if(F==-1)
				F=0;
		}
		else
			System.out.println("Queue is FULL");

	}
	public Student remove()
	{
		if(F==-1)
		{
			System.out.println("Queue is EMPTY");
			return null;
		}
		Student s = arr[F];

		if(F==R)
			F=R=-1;
		else
			F++;
		return s;
	}
	public String toString()
	{
		String str = "";

		if(F==-1)
		{
			str = "Queue is EMPTY";
		}
		else
		{
			for (int i=F; i<=R; i++)
			{
				str=str+arr[i] + " ";

			}
		}
		return str;

	}

	public StudQueue Marksmorethan75()
	{	String str;

	if(F==-1)
		str= "Queue is empty";
	StudQueue q= new StudQueue(5);
	for (int i=F; i<=R; i++)
	{
		int[]marks=arr[i].getMarks();
		if(marks[i]>75)
			q.insert(arr[i]);

	}

	return q;
	}
}

