
public class Book {
	private String name;
	private int price;
	private String isbn;

	public Book() {

	}
	public Book(String n,int p) {
		name=n;
		price=p;
	}

	public Book(String n,int p,String ib) {
		name=n;
		price=p;
		isbn=ib;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String toString() {
	 String str="Name:" + name+ ",Price:"+price+",Isbn:"+isbn;
		return str;

	}


}
