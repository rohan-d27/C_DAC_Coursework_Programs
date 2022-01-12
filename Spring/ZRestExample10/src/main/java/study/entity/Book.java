package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book20")
public class Book
{
	@Id
	@Column
  private int bookId;
	@Column
  private String bookName;
	@Column
  private int bookCost;
  public Book() 
  {
	// imp 
 }
public Book(int bookId, String bookName, int bookCost)
{
	
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookCost = bookCost;
}

public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookCost() {
	return bookCost;
}
public void setBookCost(int bookCost) {
	this.bookCost = bookCost;
}
@Override
public String toString() {
	return "Book : bookID=" + bookId + ", bookName=" + bookName + ", bookCost=" + bookCost;
}



  
  
}
