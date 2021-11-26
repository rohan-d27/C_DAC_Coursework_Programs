package study.practice;

import java.util.Scanner;
import java.util.TreeSet;

public class UserLibrary {

	public static void main(String[] args) {
		Library lb=new Library();
		Book[] b=new Book[3];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Book();
			populate_book(b[i]);  
		}
		for(int i=0;i<b.length;i++)
		{
			lb.addBook(b[i]);
		}
		lb.showAllBooksinSortedOrderofName();
		lb.showAllBooksinSortedOrderofAuthor();

	}
	public static void populate_book(Book b)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bookname:");
		String str=sc.next();
		b.setBookname(str);
		System.out.println("Enter book price:");
		int r=sc.nextInt();
		b.setPrice(r);
		System.out.println("Enter name of author:");
		String y=sc.next();
		b.setAuthor(y);

	}
}
