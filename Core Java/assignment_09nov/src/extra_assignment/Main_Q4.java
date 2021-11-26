package extra_assignment;

import java.util.Scanner;

public class Main_Q4 {

	public static void main(String[] args) {
		System.out.println("Enter string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter character to remove from string");
		String s=sc.next();
		char ch=s.charAt(0);
		removeChar(str, ch);
	}
	static void removeChar(String str, char c)
	{
	    int j, count = 0;
	    char []t = str.toCharArray();
	    for (int i = j = 0; i <str.length() ; i++)
	    {
	        if (t[i] != c)
	        t[j++] = t[i];
	        else
	            count++;
	    }
	    while(count > 0)
	    {
	        t[j++] = '\0';
	        count--;
	    } 
	    System.out.println(t);
	}
	 
}
