package study.practice;

import java.util.Scanner;

public class StringLine {

	public static void main(String[] args) {
		System.out.println("Enter a line");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//int cl=0;
		String[] s=null;
		for(int i=0;i<str.length();i++) {
			s=str.split(" ");
		}
		
		String n=str.replace(" ", "");
		System.out.println("There are total "+s.length+" words "
		 +"and "+n.length()+ " letters in the line");
	}

}
