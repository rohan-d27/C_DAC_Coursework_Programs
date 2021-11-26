
public class StringHash {
	String [] str;
	
	public StringHash(int size) {

		str = new String[size];
	}
	
	public void insert(String inputStr)
	{
		int key = hash_function(inputStr);
		System.out.print("Got " + key + " index for input " + inputStr);
		
		//is this location empty?
		if(str[key] == null)
		{
			str[key] = inputStr;
		}
		else
		{
			while(true)
			{
				key++;
				
				if(key == str.length)
					key = 0;
				
				if(str[key] == null)
				{
					str[key] = inputStr;
					break;
				}
			}
		}
		System.out.println(" and it is placed at " + key + " index in array");
		
	}

	private int hash_function(String inputStr) {
		
		int sum = 0;
		for(int i=0; i<inputStr.length(); i++)
		{
			sum = sum + ( inputStr.charAt(i) * inputStr.charAt(i));
		}	
		int key = sum % str.length;
		return key;
	}
	
	public void search(String inputStr)
	{
		int key = hash_function(inputStr);
		int tmp_key = key;
		
		if(str[key].equals(inputStr))
		{
			//we got our data at same index 'key'
			System.out.println("Key of " + inputStr + " is " + tmp_key + " and it is Found at index " + key);
		}
		else
		{
			while(true)
			{
				++key;
				if(key == str.length)
					key = 0;
				
				if(str[key].equals(inputStr))
				{
					//we got our data at same index 'key'
					System.out.println("Key of " + inputStr + " is " + tmp_key + " and it is Found at index " + key);
					break;
				}
			}
		}
		
		
	}
	
}
