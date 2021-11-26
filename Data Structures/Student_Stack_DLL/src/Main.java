import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList l1=new DoublyLinkedList();
		menu(l1);

	}
	public static Student read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student name : ");
		String n= sc.next();     

		System.out.println("Enter Student age : ");
		int a= sc.nextInt();

		System.out.println("Enter Student rollno : ");
		int r= sc.nextInt();
		
		Student s= new Student(n,a,r);
		return s ;
	}
	public static void menu(DoublyLinkedList l1) {

		System.out.println("**** Choose Opertaions from Below ***** "
				+ "\n1.Push Student Data:"
				+ "\n2.Pop Student Data:"
				+ "\n3.Print Student Stack:"
				+ "\n4.Empty Student Stack:"
				+ "\n5.isEmpty true or false:");

		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		while(c!=0)
		{
			switch (c)
			{
			case 1:{
				
				Student s=read();
				l1.insertfirst(s);
				System.out.println(l1);
				menu(l1);
				break;
			}


			case 2:{
				l1.deletefirst();
				System.out.println("After popping:\n"+l1);
				menu(l1);
				break;
			}

			case 3:{
				
				System.out.println(l1);
				menu(l1);
				break;
			}

			case 4:	{
				l1.empty();
				System.out.println("Stack in Emptied\n"+ l1);
				menu(l1);
				break;
			}


			case 5:{
				
				System.out.println(l1.isEmpty());
				menu(l1);
				break;
			}

			default:
				break;
			}
		}
	}
}
