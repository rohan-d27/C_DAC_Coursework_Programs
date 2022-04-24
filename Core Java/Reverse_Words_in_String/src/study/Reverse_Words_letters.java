
package study;

public class Reverse_Words_letters {

	
	public static void main(String[] args) {
		
	 System.out.println(reverse("This is practice for placement"));	
		
		
	}
	
	public static String reverse(String str)
	{
		
		String newstr="";
	
		
		String [] arr= str.split(" ");
		
		
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			String word="";
			
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				word+=arr[i].charAt(j);
			}
			
			newstr+=word+" ";
		}
		
		
		return newstr;
	}
	
	

}

