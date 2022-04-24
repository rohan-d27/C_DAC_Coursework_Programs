package study;

public class Anagram {

	public static void main(String[] args) {
		String str1=new String("abcd");
		String str2=new String("dcbaa");
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Boolean flag=false;
		char ch;
		if(str1.length()!=str2.length())
		{
			flag=false;
		}
		else {
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						flag=true;
						ch=arr2[i];
						arr2[i]=arr2[j];
						arr2[j]=ch;
					}
				}
				if(arr1[i]==arr2[i])
				{
					flag=true;
					continue;
				}
				else
				{
					flag=false;
					break;
				}
			}
			}
			if(flag)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		
	}

}
