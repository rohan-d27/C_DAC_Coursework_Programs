
public class Student {

	private String name;
	private int age;
	private int[]marks;

	Student(String n, int a)
	{
		name=n;
		age=a;
		marks=new int[1];	
	}
	Student ( String n, int a, int[] m)
	{
		name=n;
		age=a;
		marks=m;
	}
	public void setMarks(int[]m)
	{
		marks=m;

	}
	public int[] getMarks()
	{
		return marks;
	}
	public String toString()
	{
		String Str = "Name :"+name+" Age :"+age+" Marks :"+getmarksinString()+"\n";
		return Str;

	}
	private String getmarksinString()
	{
		String str= "{";
		for (int i=0;i<marks.length;i++)
		{
			str=str+marks[i]+ ", ";

		}
		str=str+"}";
		return str;
	}
};
