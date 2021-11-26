package iofile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ReadCities {

	public static void main(String[] args) {
		try {
		InputStream fin = new FileInputStream("C:\\Users\\Dharurkar\\Desktop\\text_files\\cities.txt");
		ArrayList<String> arr=new ArrayList<>();
		Scanner sc = new Scanner(fin);

		System.out.println("Following are the cities:");
		int count=0;
		
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
			System.out.println(s);
			count++;
			arr.add(s);
		}
		
		System.out.println("\nThere are total "+count+" cities in this file");
		
		System.out.println("\nIn sorted order:");
		Collections.sort(arr);
		//System.out.println(arr);
		Iterator<String> itr = arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());		
		}
	}
		catch(IOException e){
			System.out.println(e);
		}
	}
	
}