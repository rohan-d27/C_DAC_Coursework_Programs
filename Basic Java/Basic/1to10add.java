/*7. Write a Java program to display addition of 1 to 10 integer numbers.*/

public class 1to10add{
	public static void main(String Args[])
	{
		int i;
		for(i=0;i<11;i++)
		{
			i+=i;
		}
	  System.out.print("Addition of 1 to 10 numbers is %d ",i);
	}
}