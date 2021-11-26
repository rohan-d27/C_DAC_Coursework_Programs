package has_a_relation;

import java.util.Scanner;

public class Main_Book {

	public static void main(String[] args) {
		System.out.println("Enter number of books:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Book[] arr=new Book[x];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Book();
			arr[i].populate_book();
		}
		menu(arr);
	}	
	static void menu(Book[] arr)
	{
		System.out.println("\n****** Menu ******");
		System.out.println("\n1)Show All books having single authors"
				+ "\n2)Show All books"
				+ "\n3)Costof all books"
				+ "\n4)Showing All booksname and  authors only"
				);
		System.out.println("\n Enter your choice:");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("\nShowing All books having single authors: ");
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j].getA().getAuthor().length==1)
				{
					System.out.println(arr[j]);
				}
			}
			menu(arr);
			break;
		case 2:
			System.out.println("\nShowing All books: ");
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]);
			}
			menu(arr);
			break;
		case 3:
			System.out.println("\nCostof all books: ");
			{
				int sum=0;
				for(int j=0;j<arr.length;j++)
				{
					System.out.println("Bookprice: "+arr[j].getPrice());
					sum+=arr[j].getPrice();
				}
				System.out.println("\nTotal price of all books is: "+sum);
			}
			menu(arr);
			break;
		case 4:System.out.println("Showing All booksname and  authors only: ");
		for(int j=0;j<arr.length;j++)
		{
			System.out.println("bookname: "+arr[j].getBookname()+"authors :"+arr[j].getA());
		}
		menu(arr);

		break;

		default:
			break;
		}
	}
}

