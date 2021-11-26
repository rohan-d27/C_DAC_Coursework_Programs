package iofile;

import java.io.Serializable;
import java.util.Arrays;

public class Author implements Serializable{

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
	
	public boolean equalsAuthor(Object obj)
	{
		boolean authortest=true;
		Author temp=(Author)obj;
		String[] st1=this.getAuthor();
		String[] st2=temp.getAuthor();
		if(st1.length==st2.length)
		{
			for(int i=0;i<st1.length;i++)
			{
				if(st1[i].equals(st2[i]))
				{
					continue;
				}
				else
				{
					authortest=false;
					break;
					
				}
			}
			
			return authortest;
		}
		else
		{
			return false;
		}
}
}