package stringmenu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		menu(str);
	}
	static void menu(String s)
	{
		while(true)
		{		System.out.println("******* MENU ********\nSelect from below:");
		System.out.println("1)Show length of the string "
				+ "\n2)Show substring for user inputted begin index and end index "
				+ "\n3)Check if string is pallindrome "
				+ "\n4)Quit ");
		Scanner sc=new Scanner(System.in);
		int  key=sc.nextInt();
		if(key==4)
		{
			break;
		}
			switch (key) {

			case 1: {
				System.out.println("length of string: "+ s.length());
				menu(s);
				break;
			}
			case 2: {
				System.out.println("Enter begin index:");
				int bi=sc.nextInt();
				System.out.println("Enter last index:");
				int li=sc.nextInt();
				System.out.println("String requested by user is : "+ s.substring(bi, li));
				menu(s);
				break;
			}
			case 3: {
				int i=0,j=s.length()-1;
				boolean flag=false;
					while(i<j)
					{
						if(s.charAt(i)==s.charAt(j))
						{
							flag=true;
						}
						else
						{
							flag=false;
						}
						i++;
						j--;
					}
					if(flag==true)
					{
						System.out.println("String is Palindrome");
						}
					else
					{
						System.out.println("String is not Palindrome");
					}
				menu(s);
				break;
			}
			case 4: {
				break;
			}
			
			
			}
		}

	}
}
