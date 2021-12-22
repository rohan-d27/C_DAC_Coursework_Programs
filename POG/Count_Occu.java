
/*Write a function to return the number of students who have scored 70 from 
a given list of mark scored by all students which is arranged 
in ascending order ?
Example : 
input : {31,35,35,40,42,50,66,69,69,70,70,70,78,78,85,85,88,90,90}
output : 3 students 
condition : find the fastest way of doing so.
*/


public class Count_Occu 
{

	public static void main(String[] args) 
	{
		int[] input = new int[] {31,35,35,40,42,50,66,69,69,70,70,70,78,78,85,85,88,90,90};
		int key = 90 ;
		
		int count = count_marks(input , key);
		if(count == 0 ) System.out.println("Not Found !!!");
		else System.out.println(count + " Students Found.");
		

	}
	

	private static int count_marks(int[] input, int key) 
	{
		int low , high , mid , counter = 0;
		low = 0;
		high = input.length;
		mid = (low+high)/2;
		
		while( (input[mid]!=key)  &&  (low<high) )
		{
			if( input[mid] > key ) 	high = mid - 1;
			else 	low = mid + 1 ;
			mid = (low + high)/2;
		}
		
		if(input[mid]==key)
		{
			counter++;
			low = mid - 1;
			while( low >= 0 && input[low]==key )
			{
				counter++;
				low--;
			}
			
			high = mid + 1;
			while(high < input.length  &&  input[high]==key  )
			{
				counter++;
				high++;
			}
		}
		
		return counter;
	}

}
