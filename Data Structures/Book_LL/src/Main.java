/*
Q6.Write a Menu driven program to give below options for Book class using Linked List
book id,book name,price ,Quantity
1.Insert at end;
2.Display all books
3.Update Quantity as per user request.
4.Delete all book nodes from Singly Linked List*/



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		menu(l1);
		
	}
	public static Book read()
	{
				Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Book Id : ");
			int i= sc.nextInt();     
		
			System.out.println("Enter the Book Name : ");
			String n= sc.next();
		
			System.out.println("Enter the Book Price: ");
			int s= sc.nextInt();
			System.out.println("Enter the Book Quantity: ");
			int q= sc.nextInt();
			Book b= new Book(i,n,s,q);
			return b ;
		
	}
	public static void menu(LinkedList l1)
	{
		System.out.println("Choose operaion from below: "
				+ "\n1.Insert Book at end"
				+ "\n2.Dislay all books"
				+ "\n3.Update Quantity of books"
				+ "\n4.Delete all books"
				);
		Scanner bc=new Scanner(System.in);
		int c=bc.nextInt();
		while(c!=0)
		{
			switch (c)
			{
			case 1:{
						Book b=read();
					   l1.insertlast(b);
					   System.out.println("After inserting node at end:\n"+l1);
					   menu(l1);
					   break;
					}
						

			case 2:{
							System.out.println(l1);
							menu(l1);
							break;
					}
			           
			case 3:{
						System.out.println("nEnter book id to update its quantity:");
						int d=bc.nextInt();
						System.out.println("nEnter new quantity:");
						int q=bc.nextInt();
						l1.search(d,q);
						System.out.println("After updating at quantity:\n"+l1);
						menu(l1);
						 break;
						}
			           
			case 4:	{
							l1.Emptylist();
							System.out.println("List is Empty"+l1);
							menu(l1);
							break;
						
					}
			
			
				}
			}

		}

	

	
}
