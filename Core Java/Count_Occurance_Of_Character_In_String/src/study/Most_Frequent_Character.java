package study;

public class Most_Frequent_Character {

	public static void main(String[] args) {
		String str=new String("abbccc");
		mostFrequentCharacter(str);

	}

	private static void mostFrequentCharacter(String str) {
		char[] arr=str.toCharArray();
		int[] freqCount=new int[arr.length];
		int min,max;
		char minChar,maxChar;
		for(int i=0;i<arr.length;i++)
		{
			freqCount[i]=1;	// reset count to 1
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!='0' && arr[i]!=' ')
				{
					freqCount[i]++;
					arr[j]='0';
				}
			}
		}
		min=max=freqCount[0];
		minChar=maxChar=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>freqCount[i] && arr[i]!='0' )
			{
				min=freqCount[i];
				minChar=arr[i];
			}
			if(max<freqCount[i] && arr[i]!='0')
			{
				max=freqCount[i];
				maxChar=arr[i];
			}
		}
		System.out.println("Minimum occuring character: "+minChar);
		System.out.println("Maximum occuring character:"+maxChar);
	}

}
