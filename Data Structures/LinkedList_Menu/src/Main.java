import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		LinkedList l1 = new LinkedList();
		menu(l1);
	}

	
	public static void menu(LinkedList l1) {
		System.out.println("Choose operaion from below: \n1.Insert at first\n2.Insert at last\n3.Insert at position\n4.Delete 1st node\n5.Delete last node\n6.Delete node on position\n7.Reversed likedlistn\n8.Dislay\n");
		Scanner bc=new Scanner(System.in);
		int c=bc.nextInt();
		while(c!=0)
		{
			switch (c)
			{
			case 1:{
						System.out.println("Enter Data:");
						int num=bc.nextInt();
						l1.insertfirst(num);
						System.out.println("linkedlist by inserting node at first:\n"+l1);
						menu(l1);
					}
						break;

			case 2:{
					   System.out.println("nEnter integer data:");
			           int d=bc.nextInt();
					   l1.insertlast(d);
					   System.out.println("After inserting node at last:\n"+l1);
					   menu(l1);
					}
			           break;
			case 3:{
						System.out.println("nEnter integer data:");
						int d=bc.nextInt();
						System.out.println("Enter Position:");
						int pos=bc.nextInt();
						l1.insertbypos(d,pos);
						System.out.println("After inserting at position:\n"+l1);
						menu(l1);
						}
			            break;
			case 4:	{
						l1.deletefirst();
						System.out.println("After deleting 1st node:\n"+ l1);
						menu(l1);
					}
						break;
			case 5:{
						l1.deletelast();
						System.out.println("After deleting last node:\n"+l1);
						menu(l1);
			       }
		             	break;
			case 6: {
						System.out.println("Enter position to delete data:");
						int pos1=bc.nextInt();
						l1.deletebypos(pos1);
						System.out.println("After deleting node on postion:\n"+ l1);
						menu(l1);
					}
						break;
			case 7:{
						l1.reverse();
						System.out.println("Reversed Linkedlist is:\n"+l1);
						menu(l1);
						break;
						}
			case 8: {
							System.out.println(l1);
							break;
			        }
			}

		}

	}

}
