package extra_assignment;

import java.util.Scanner;

public class Main_Q2 {

	public static void main(String[] args) {
		System.out.println("Enter string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		unique(str);
	}
	public static void unique(String test)
	{
		String temp = "";
	
    for (int i = 0; i < test.length(); i++)
    {
        if (temp.indexOf(test.charAt(i)) == - 1)
    {
           temp = temp + test.charAt(i);
    }
		
    }
    count(test,temp);
	}
	public static void count(String test,String temp)
	{
		int i,j,count=0,max=0;
		char ch=' ';
		for(i=0;i<temp.length();i++)
		{
			count=0;
			for(j=0;j<test.length();j++)
		{
			if(temp.charAt(i)==test.charAt(j))
			{
				count++;
			}
			
		}
			System.out.println(temp.charAt(i)+" appeared "+(count)+" times");
			if(max<count)
			{
				max=count;
				ch=temp.charAt(i);
			}	
	
	}
		System.out.println(ch +" appeared maximum times. About "+max+" times");
	}
}
