
public class StdHash {

		Student []arr;
		
		StdHash(int size)
		{
			arr = new Student[size];
		}
		
		public void hash_insert(Student s1)
		{
			int key = get_hash(s1);
			int keytemp = key;
			int count =0;
			if(arr[key] == null)
			{
				arr[key] = s1;
				System.out.println("Got " +keytemp+"  Index of for "+s1+"  Student and placed at "+key+"index");
			}
			else
			{
				while(true)
				{
					count++;
					key++;
					if(key == arr.length)
						key =0;
					if(arr[key] == null)
					{
						arr[key] = s1;
						System.out.println("Got " +keytemp+" for Index of  "+s1+"  Student and placed at "+key);
					}
				}
			}
			System.out.println("Linear Probing is Done by "+count+"  times");
		}
		
		

		private int get_hash(Student s1) {

			int sum = 0;
			for(int i=0; i<s1.getMobno().length(); i++)
			{
				sum = sum+s1.getMobno().charAt(i);
			}
			int key = (sum%arr.length);
			
			return key;
		}
		
		
	
}
