package assignments;

import java.util.Scanner;

public class WrapperExample_Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Password should meet following requirements:\n\n1.The password length must be between 8 and 20"
				+ "\n2.The password must begin with a letter "
				+ "\n3.The password must have at least one capital character"
				+ "\n4.The password must have at least one digit "
				+ "\n5.The password must have at least one small character"
				+ "\n6.The password must have at least one special char    _   -  #  $"
				+ "");
		int attempt=0;
		
		if(attempt<5)
		{
		System.out.println("\n\nEnter a password:");
		String pwd=sc.next();

		if(length(pwd)==true && firstLetter(pwd)==true && uppercase(pwd)==true && lowercase(pwd)==true && digit(pwd)==true && specialCharacter(pwd)==true)
		{		
			System.out.println("Password set Successfully!!");
		}
		else
		{
			System.out.println("Password does not meet requirement");
			attempt++;
		
		}
		}
		else
		{
			System.out.println("Attempts Exceeded!!!");
		}
	}
	
static boolean firstLetter(String pwd)
{
	if(Character.isLetter(pwd.charAt(0)))
			{
		      return true;
			}
	else
	{
		return false;
	}
}
static boolean length(String pwd)
{
	if(pwd.length()>=8 && pwd.length()<=20)
			{
		      return true;
			}
	else
	{
		return false;
	}
}
static boolean uppercase(String pwd)
{
	for(int i=0;i<pwd.length();i++)
	{
		if(Character.isUpperCase(pwd.charAt(i)))
			{
		      return true;
			}
	}
	return false;
}
static boolean lowercase(String pwd)
{
	for(int i=0;i<pwd.length();i++)
	{
		if(Character.isLowerCase(pwd.charAt(i)))
			{
		      return true;
			}
	}
	return false;
}
static boolean digit(String pwd)
{
	for(int i=0;i<pwd.length();i++)
	{
		if(Character.isDigit(pwd.charAt(i)))
			{
		      return true;
			}
	}
	return false;
}
static boolean specialCharacter(String pwd)
{
	for(int i=0;i<pwd.length();i++)
	{
		if(pwd.charAt(i)=='_'||pwd.charAt(i)=='-'||pwd.charAt(i)=='#'||pwd.charAt(i)=='$')
			{
		      return true;
			}
	}
	return false;
}
}
