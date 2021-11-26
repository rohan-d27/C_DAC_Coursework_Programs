package study.practice;

public class Book implements Comparable<Book>{

	private String  bookname;
	private int price;
	private String author;
	public Book(String bookname, int price,String author) {
		
		this.bookname = bookname;
		this.price = price;
		this.author = author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "Book Bookname: " + bookname + ", Price: " + price  +", author: "+ author  ;
	}
	
	@Override
	public int compareTo(Book o) {
		
		return this.bookname.compareTo(o.bookname);
	}	
}
