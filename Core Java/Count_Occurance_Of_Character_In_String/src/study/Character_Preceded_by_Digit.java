package study;

public class Character_Preceded_by_Digit {

	public static void main(String[] args) {
		String str=new String("aa3b bbc5c");
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				if((str.charAt(i+1)>='A' && str.charAt(i+1)<='Z')||(str.charAt(i+1)>='a' && str.charAt(i+1)<='z'))
				{
					System.out.println(str.charAt(i+1));
					count++;
				}
			}
		}
		System.out.println("Count="+count);
	}

}
