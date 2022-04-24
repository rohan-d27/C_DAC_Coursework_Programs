package study;

import java.util.ArrayList;
import java.util.List;

public class Repeated {

	public static void main(String[] args) {
		String str="aabbcc";
		/*char trr[]=repeatedCharacters(str);
		System.out.print(" [");
		for(int i=0;i<trr.length;i++)
		{
			if(trr[i]!='0')
			System.out.print(" '"+trr[i]+"', ");
		}
		System.out.print("]");
		System.out.println(" are repeated characters");*/
		List<Character> list=repeatedCharactersList(str);
		System.out.print(" [");
		for(Character ch:list)
		{
			System.out.print(" '"+ch+"', ");
		}
		System.out.print("]");
		System.out.println(" are repeated characters");
	}

	private static char[] repeatedCharacters(String str) {
		char arr[]=str.toCharArray();
		int count=0;
		int t=0;
		char rep[]=new char[str.length()];
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&arr[i]!='0')
				{
					count++;
					arr[j]='0';
				}
					
			}
			if(count>1)
			{
				rep[t++]=arr[i];
				
			}
		}
		for(int i=t;i<rep.length;i++)
		{
			rep[i]='0';
		}
		return rep;
		
		
	}
	private static List<Character> repeatedCharactersList(String str) {
		char arr[]=str.toCharArray();
		List<Character> list=new ArrayList<Character>();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&arr[i]!='0')
				{
					count++;
					arr[j]='0';
				}
					
			}
			if(count>1)
			{
				list.add(arr[i]);
				
			}
		}
		
		return list;
		
		
	}

}
