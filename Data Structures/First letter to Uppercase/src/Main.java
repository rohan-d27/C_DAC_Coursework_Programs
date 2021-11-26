//COP_Assignment_3	
/*Q5).Write a program to convert first character of each word of a user input string into upper case.
	e.g: INPUT:abc pqr ddd
	     OUTPUT:Abc Pqr Ddd*/



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a string to covert first letters to uppper case");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(convert(str));
	
	
	}
	
	
	static String convert(String str)
	{

		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) 
		{

			if (i == 0 && ch[i] != ' ' ||ch[i] != ' ' && ch[i - 1] == ' ')
			{
				if (ch[i] >= 'a' && ch[i] <= 'z') 
				{ 
					ch[i] = (char)(ch[i] - 'a' + 'A');
				}
			}

			else if (ch[i] >= 'A' && ch[i] <= 'Z')

			{     
				ch[i] = (char)(ch[i] + 'a' - 'A');           
			}


		}  
		String st = new String(ch);
		return st;
	}
}


