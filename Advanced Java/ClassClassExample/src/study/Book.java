package study;

public class Book {
	
	private int bookcost;
	private String name;
	
	public Book()
	{
		bookcost =500;
		name="learning introspection";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookcost+" "+name;
				}

}
