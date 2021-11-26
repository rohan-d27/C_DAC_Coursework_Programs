
public class Main {

	public static void main(String[] args) {

		DoublyLinkedList l1 = new DoublyLinkedList();
		l1.insertfirst(10);
		l1.insertfirst(20);
		l1.insertfirst(30);
		l1.insertfirst(40);
		System.out.println("\nDoubly linkedlist:\n"+l1);
		l1.reverse();
		System.out.println("\nReversed Doubly linkedlist:\n"+l1);
		l1.insertlast(50);
		l1.insertlast(60);
		System.out.println("\nAfter inserting node at last:\n"+l1);
		l1.insertbypos(34, 4);
		System.out.println("\nAfter inserting node at 4th position:\n"+l1);
		l1.deletefirst();
		System.out.println("\nDoubly linkedlist after deleting first node:\n"+l1);
		l1.deletelast();
		System.out.println("\nDoubly linkedlist after deleting last node:\n"+l1);
		l1.deletebypos(2);
		System.out.println("\nDoubly linkedlist after deleting node on given postion:\n"+l1);
		
	}

}
