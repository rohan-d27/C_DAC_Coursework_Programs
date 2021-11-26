
public class StringHash {
	 Student [] arr;
	
	public StringHash(int size) {

		arr = new Student[size];
	}
	
	public  void insert(Student s1)
	{
		int key = hash_function(s1);
		int keytemp=key;
		int count=0;
		
		if(arr[key] == null)
		{
			arr[key] = s1;
			System.out.print("Got " + keytemp + " index for input " + s1);
		}
		else
		{
			while(true)
			{
				count++;
				key++;
				
				if(key == arr.length)
					key = 0;
				
				if(arr[key] == null)
				{
					arr[key] = s1;
					System.out.print("Got " + keytemp + " index for input " + s1);
					break;
				}
			}
		}
		System.out.println(" and it is placed at " + key + " index in array");
		System.out.println("\nLinear Probing is Done by "+count+"  times");
		
	}

	private int hash_function(Student  s1) {
		
		int sum = 0;
		for(int i=0; i<s1.getMobno().length(); i++)
		{
			sum = sum + ( s1.getMobno().charAt(i) * s1.getMobno().charAt(i));
		}	
		int key = (sum % arr.length);
		return key;
	}
}
