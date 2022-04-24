package study;

public class Pangram {

	public static void main(String[] args) {
	String str="ABCDEFGHIJklmnopqrstuvwxyz";
	Boolean t=isPangram(str,str.length());
	if(t)
	{
		System.out.println("Given string is pangram");
	}
	else
	{
		System.out.println("Not a pangram");
	}
	}
	 static boolean isLetter(char ch)
	    {
	        if (!Character.isLetter(ch))
	            return false;
	 
	        return true;
	    }
	private static boolean isPangram(String str, int length) {
		boolean[] arr=new boolean[26];
		String s1=str.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			
			if(isLetter(s1.charAt(i)))
			{	
				int ch=s1.charAt(i)-'a';
				arr[ch]=true;
			}
			
		
		}
		for(int i=0;i<arr.length;i++) {
			if(!arr[i])
			{
				char missingChar=(char) ('a'+i);
				System.out.println("letter '"+missingChar+"' is missing");
				return false;
				
			}
		}
		return true;
	}

}
