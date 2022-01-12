package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class BookEntity 
{
	@Id
	@Column
   private int bookId;
	@Column
   private String bookName;
	@Column
   private int bookCost;
   public BookEntity() {
	// TODO Auto-generated constructor stub
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
	return " Book Id :" + bookId + ", Book Name : " + bookName + ", Book Cost :" + bookCost ;
}
   

}
