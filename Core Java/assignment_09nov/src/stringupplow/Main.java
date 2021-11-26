package stringupplow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while(true)
		{
			
			System.out.println("Enter Your name as firstname lastname:"
					+ "   (*Type quit to quit)");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("quit"))
			{
				break;
			}
			else
			{
			String[] names=str.split(" ");
			String p1=names[0].substring(0,1);
			String p2=names[0].substring(1,names[0].length());
			String p3=names[1].substring(0,1);
			String p4=names[1].substring(1,names[1].length());
			String p5=" ";
			String str2= p1.toUpperCase().concat(p2.toLowerCase()).concat(p5).concat(p3.toUpperCase().concat(p4.toLowerCase()));
			System.out.println("Welcome "+ str2+"!");
			}
		}
	}

}
