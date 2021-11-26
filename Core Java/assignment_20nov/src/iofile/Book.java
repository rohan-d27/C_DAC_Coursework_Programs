package iofile;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {

	private String  bookname;
	private int price;
	private Author a;
	private MyDate publication_date;
	public Book(String bookname, int price, Author a,MyDate publication_date ) {
		
		this.bookname = bookname;
		this.price = price;
		this.a = a;
		this.publication_date=publication_date;
	}
public Book() {
		
		
	}

	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getA() {
		return a;
	}
	public void setA(Author a) {
		this.a = a;
	}
	
	
	public MyDate getPublication_date() {
		return publication_date;
	}
	public void setPublication_date(MyDate publication_date) {
		this.publication_date = publication_date;
	}
	public void populate_book()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bookname:");
		String str=sc.next();
		this.setBookname(str);
		System.out.println("Enter book price:");
		int r=sc.nextInt();
		this.setPrice(r);
		System.out.println("Enter number of authors:");
		int y=sc.nextInt();
		Author b=new Author();
		String[] str1=new String[y];
		
		for(int i=0;i<y;i++)
		{
			System.out.println("Enter author name:");
			String s=sc.next();
			str1[i]=s;
		}
		b.setAuthor(str1);
		this.setA(b);
	}


	
	@Override
	public String toString() {
		return "Book bookname=" + bookname + ", price=" + price + " " + a + ", publication_date=" + publication_date
				+ "";
	}
	@Override
	public boolean equals(Object obj)
	{
		Book temp=(Book)obj;
	
		if(this.getBookname().equals(temp.getBookname()) && this.getPrice()==temp.getPrice() && this.getA().equalsAuthor(temp.getA()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
