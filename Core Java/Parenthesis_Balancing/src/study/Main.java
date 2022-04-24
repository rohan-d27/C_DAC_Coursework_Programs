package study;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		checkParenthesisBalance("([{}])");


	}

	private static Boolean checkParenthesisBalance(String s) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='(')||(s.charAt(i)=='{')||(s.charAt(i)=='['))
			{
				stack.push(s.charAt(i));
			}
			else
			{
				if((s.charAt(i)==')')||(s.charAt(i)=='}')||(s.charAt(i)==']'))
				{
					if(stack.isEmpty() )
					{
						System.out.println("Right parenthesis are more");
						return false;
					}
					else
					{
						if( !match(stack.pop(),s.charAt(i)))
						{
							System.out.println("Not Balanced");
							return false;
						}
					}
				}							
			}

		}
		if(stack.isEmpty())
		{
			System.out.println("Is balanced");
			return true;
		}
		return false;
	}
	private static Boolean match(char a, char b)
	{
		if(a=='(' &&b==')')
		{
			return true;
		}
		if(a=='{' &&b=='}')
		{
			return true;
		}
		if(a=='[' &&b==']')
		{
			return true;
		}
		return false;
	}

}
