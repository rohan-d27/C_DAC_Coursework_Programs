package study;

public class All_Character_Count {

	public static void main(String[] args) {
		String str=new String("aa bbb ccc dddd AA BB CC");
		countCharFreq(str);

	}

	private static void countCharFreq(String str) {
		int count=0;
		char ch;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!='*')
			{
				ch=arr[i];
				count=1;//reset count to 1
				for(int j=i+1;j<arr.length;j++)
				{
					if(ch==arr[j])
					{
						count++;
						arr[j]='*';//replace counted characters with *
					}
				}
				if(ch==' ')
				{
					System.out.println("Space = "+count);
				}
				else {
					System.out.println(ch+" = "+count);
				}
			}
		}
		
	}

}
