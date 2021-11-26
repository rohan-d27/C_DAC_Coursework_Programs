
public class Main {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		
		l1.insertfirst(10);
		l1.insertfirst(20);
		l1.insertfirst(30);
		l1.insertfirst(40);
		l1.insertfirst(50);
		l1.insertfirst(60);
		l1.insertfirst(70);
		l1.insertfirst(80);
		l1.insertfirst(90);
		l1.insertfirst(100);
		System.out.println("Linkedlist :\n"+l1);
		
		l1.deleteOdd();
		System.out.println("Linkedlist after deleting odd nodes:\n"+l1);
		
	}

}
