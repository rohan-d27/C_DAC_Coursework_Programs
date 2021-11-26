import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		menu(l1);
	}
	 public static void menu(LinkedList l1)
     {
    	 System.out.println("Enter choice from following: \n1.Insert\n2.Remove\n3.Display");
    	 Scanner sc=new Scanner(System.in);
    	 int key=sc.nextInt();
    	 while(true) {
    		 switch (key) {
			case 1:
			{
				System.out.println("Enter data:");
				int d=sc.nextInt();
				l1.insertlast(d);
				menu(l1);
				break;
			}
			case 2:
			{

				l1.deletefirst();
				System.out.println("After remove:\n"+ l1);
				menu(l1);
				break;
			}
			case 3:
			{

				display(l1);
				menu(l1);
				break;
			}	
				

			default:
				break;
			}
    	 }
     }
     public static void display(LinkedList l1)
     {
    	 System.out.println("Stack using linkedlist:\n"+l1);
     }

}
