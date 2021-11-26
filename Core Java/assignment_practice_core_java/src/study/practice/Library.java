package study.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class Library {

	private static TreeSet<Book> bk ;
	public Library() {
		bk=new TreeSet<Book>();
	}
	public void addBook(Book k){
		bk.add(k);	
	}
	public  TreeSet<Book> Sort(Comparator<Book> obj)
	{
		TreeSet<Book> temp=new TreeSet<>(obj);
		for (Book book : bk) 
		{
			temp.add(book);
		}
		return temp;
	}
	public  void showAllBooksinSortedOrderofName(){
		TreeSet<Book> tree1=new TreeSet<>();
		tree1=Sort((o1,o2)->o1.getBookname().compareTo(o2.getBookname()));
		System.out.println("Sort Based on Book name:");
		Showall(tree1);
	}
	public void showAllBooksinSortedOrderofAuthor(){
		TreeSet<Book> tree2=new TreeSet<>();
		tree2=Sort((o1,o2)->o1.getAuthor().compareTo(o2.getAuthor()));
		System.out.println("Sort Based on Auhor name:");
		Showall(tree2);
	}
	public void Showall(TreeSet<Book> bk)
	{
		for (Book book:bk) 
		{
			System.out.println(book);
		}
	}
}
