import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LinkedList l1=new LinkedList();
		menu(l1);

	}

	public static Employee read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id : ");
		int i= sc.nextInt();     

		System.out.println("Enter the Name : ");
		String n= sc.next();

		System.out.println("Enter the Salary : ");
		int s= sc.nextInt();
		Employee e= new Employee(i,n,s);
		return e ;

	}
	public static void menu(LinkedList l1) {

		System.out.println("**** Choose Opertaions from Below ***** "
				+ "\n1.Insert New Employee Data:"
				+ "\n2.Append new Employee Data:"
				+ "\n3.Insert Employee Data at given position:"
				+ "\n4.Delete 1st Employeee data:"
				+ "\n5.Delete last Employee Data:"
				+ "\n6.Delete Employee Data on position:"
				+ "\n7.Reversed likedlist:"
				+ "\n8.Display Employee List:"
				+ "\n9.Employee details by ID:"
				+ "\n10.Employees having salery less than:"
				+ "\n11.Name start from lettter 'a':"
				+ "\n12.Empty Linkedlist:\n ");

		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		while(c!=0)
		{
			switch (c)
			{
			case 1:{
				System.out.println("Enter Employee Detials:");
				Employee e=read();
				l1.insertfirst(e);
				System.out.println("linkedlist by inserting node at first:\n");
				System.out.println(l1);
				menu(l1);
				break;
			}


			case 2:{

				Employee e=read();
				l1.insertlast(e);
				System.out.println("After inserting node at last:\n"+l1);
				menu(l1);
				break;
			}

			case 3:{
				Employee e=read();
				System.out.println("Enter Position:");
				int pos=sc.nextInt();
				l1.insertbypos(e,pos);
				System.out.println("After inserting at position:\n"+l1);
				menu(l1);
				break;
			}

			case 4:	{
				l1.deletefirst();
				System.out.println("After deleting 1st node:\n"+ l1);
				menu(l1);
				break;
			}


			case 5:{
				l1.deletelast();
				System.out.println("After deleting last node:\n"+l1);
				menu(l1);
				break;
			}

			case 6: {
				System.out.println("Enter position to delete data:");
				int pos1=sc.nextInt();
				l1.deletebypos(pos1);
				System.out.println("After deleting node on postion:\n"+ l1);
				menu(l1);
				break;
			}

			case 7:{
				l1.reverse();
				System.out.println("Reversed Linkedlist is:\n"+l1);
				menu(l1);
				break;
			}
			case 8: {
				System.out.println(l1);
				menu(l1);
				break;

			}
			case 9: System.out.println("Enter the ID : ");
				int id=sc.nextInt();
				l1.details_by_ID(id);
				menu(l1);
				break;


			case 10:
				System.out.println("Enter the Salery to find employes having salery <  : ");
				int sal=sc.nextInt();
				l1.details_less_than(sal);
				menu(l1);
				break;

			case 11 :{
				l1.name_Startwith();
				menu(l1);
			break;
			}
			case 12 :{
				l1.Emptylist();
				System.out.println("LinkedList Emptied");
				menu(l1);
			break;
			}
			default:
				break;
			}
		}
	}
	
}



