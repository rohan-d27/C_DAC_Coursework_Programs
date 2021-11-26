package has_a_relation;

import java.util.Arrays;

public class Author {

	private String[] author;

	public Author(String[] author) {
	
		this.author = author;
	}
	public Author() {
		
		
	}
	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Author: " + Arrays.toString(author) + "";
	}

	
	
}
