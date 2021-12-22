/*Write a function to return the number of students who have scored 70 from 
a given list of mark scored by all students which is arranged 
in ascending order ?
Example : 
input : {31,35,35,40,42,50,66,69,69,70,70,70,78,78,85,85,88,90,90}
output : 3 students 
condition : find the fastest way of doing so.
*/


public class MyClass
{
	public static void main(String [] args)
	{
		int[] input = {31,35,35,40,42,50,66,69,69,70,70,70,78,78,85,85,88,90,90};
		int key = 70;
		
		int count = count_marks(intput,key);
		if(count==0) sop("Not found");
		else sop(cnt + " Students");
		
	}
	
	public static int count_marks(input,key)
	{
		int low , high , mid , counter = 0 ;
		low = 0;
		high = input.lenght;
		mid = (low + high )/2;
		while( (input[mid]!=key) && (low<high) )
		{
			if(input[mid]>key) high = mid - 1;
			else low = mid + 1;
			mid = (low + high)/2;
		}	
		
		if(input[mid]==key)
		{
			counter++;
			low = mid - 1 ;
			while( low>=0 && input[low]==key )
			{
				counter++;
				low--;
			}
			
			high = mid + 1;
			while( high < input.length && input[high]== key )
			{
				counter++;
				high++;
			}
		}
		
		return counter;
	}
}
