package extra_assignment;

import java.util.Scanner;

public class Main_Q3 {

	public static void main(String[] args) {
		System.out.println("Enter full name as firstname middlename lastname:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] names=str.split(" ");
		String p1=names[0].substring(0,1);
		String p2=names[1].substring(0,1);
		String p3=names[2].substring(0,1);
		
		String ret=p1.toUpperCase()+"."+p2.toUpperCase()+"."+p3.toUpperCase();
		System.out.println("Output String:"+ret);

	}

}
