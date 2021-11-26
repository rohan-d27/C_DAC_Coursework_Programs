package Student;

public class Student {
 
	private String name;
	private int age;	
	private int [] marks;

	//------------------------
	Student(String n, int a)
	{
		name = n;
		age = a;	
		marks = new int[1];
		marks[0] = 0;
	}

	Student(String n, int a, int []  m)
	{		
		name = n;
		age = a;
		marks = m;
	}

	public void setMarks(int [] m)
	{
		marks = m;
	}
	
	public int[] getMarks()
	{
		return marks;
	}

	public String toString()
	{		
		String str = "Name:" + name + ", age:" + age + ", Marks : " + getMarksInString();
		return str;
	}
	
	private String getMarksInString()
	{
		//{12,34,55,63,...}
		String str = "{";
		for(int i=0; i<marks.length; i++) {
			str = str + marks[i] + ", ";
		}
		str = str + "}";
		return str;
	}

};
