package study.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadTXtFile {

	public static void main(String[] args) {
		InputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\newtxt.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		ArrayList<String> arr=new ArrayList<>();
		Scanner sc = new Scanner(fin);
		System.out.println("Following are the lines:");
		int count=0;
		
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
			System.out.println(s);
			count++;
			arr.add(s);
		}
		
		System.out.println("\nThere are total "+count+" lines in this file\n");
		
		System.out.println("In Reverse Order:");
		Collections.reverse(arr);
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}
