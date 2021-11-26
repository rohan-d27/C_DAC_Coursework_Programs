package study.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTxtFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OutputStream fout=null;
		try {
			File f=new File("C:\\Users\\Dharurkar\\Desktop\\text_files\\newtxt.txt");
					fout = new FileOutputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\newtxt.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		PrintWriter pw  = new PrintWriter(fout);
		while(true)
		{
			System.out.println("Enter string to add in file : (Enter quit to stop input)");
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

}
