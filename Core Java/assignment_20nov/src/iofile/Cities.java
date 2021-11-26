package iofile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cities {

	public static void main(String[] args)  {
		try {
		Scanner sc = new Scanner(System.in);
		OutputStream fo;

		fo = new FileOutputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\cities.txt",true);
		PrintWriter pw  = new PrintWriter(fo);
		while(true)
		{
			System.out.println("Enter city names to add in file : (Enter quit to stop input)");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("quit"))
			{
				break;
			}
			else
			{
				pw.println(str);
				pw.flush(); 	
			}
		}
		pw.close();
		sc.close();
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e);
	}
}//end of main
}//end of Cities