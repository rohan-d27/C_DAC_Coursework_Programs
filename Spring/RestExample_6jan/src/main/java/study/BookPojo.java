package study;

public class BookPojo {
	
	private int bookId,bookCost;
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
	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookCost=" + bookCost + ", bookName=" + bookName + "]";
	}
	public BookPojo(int bookId, int bookCost, String bookName) {
		super();
		this.bookId = bookId;
		this.bookCost = bookCost;
		this.bookName = bookName;
	}
	
	public BookPojo() {
		// TODO Auto-generated constructor stub
	}

}
