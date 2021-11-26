import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList l1=new DoublyLinkedList();
		menu(l1);

	}
	public static Employee read()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee id : ");
		int i= sc.nextInt();
		
		System.out.println("Enter Employee name : ");
		String n= sc.next();     
		
		System.out.println("Enter Employee Salary : ");
		int sal= sc.nextInt();
		
		System.out.println("Enter Employee gender : ");
		String g= sc.next();   
		Employee s= new Employee(i,n,sal,g);
		return s ;
	}
	public static void menu(DoublyLinkedList l1) {

		System.out.println("**** Choose Opertaions from Below ***** "
				+ "\n1.Insert Employee Data:"
				+ "\n2.Remove Employee Data:"
				+ "\n3.:Print All Employee"
				+ "\n4.Print All Female Employee:"
				+ "\n5.Print All Male Employee"
				+ "\n6.Empty Queue"
				+ "\n7.isEmpty:");

		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		while(c!=0)
		{
			switch (c)
			{
			case 1:{
				
				Employee s=read();
				l1.insertlast(s);
				System.out.println("Inserted Successfully\n"+l1);
				menu(l1);
				break;
			}


			case 2:{
				l1.deletefirst();
				System.out.println("After Removing:\n"+l1);
				menu(l1);
				break;
			}

			case 3:{
				
				System.out.println("All Employee list:\n"+l1);
				menu(l1);
				break;
			}
			case 4:{
				System.out.println("All Female Employee list:\n");
				l1.listfemale();
				menu(l1);
				break;
			}
			case 5:{
				
				System.out.println("All Male Employee list:\n");
				l1.listmale();
				menu(l1);
				break;
			}
			case 6:	{
				l1.empty();
				System.out.println("Stack in Emptied\n"+ l1);
				menu(l1);
				break;
			}


			case 7:{
				
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
