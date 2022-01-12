package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class BookEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int bookId;
	
	@Column(name="cost")
	private int bookCost;
	
	@Column(name="name")
	private String bookName;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public BookEntity(int bookId, int bookCost, String bookName) {
		super();
		this.bookId = bookId;
		this.bookCost = bookCost;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "BookEntity [bookId=" + bookId + ", bookCost=" + bookCost + ", bookName=" + bookName + "]";
	}
	
	public BookEntity() {
		// TODO Auto-generated constructor stub
	}
	
}
