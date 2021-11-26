
public class Main {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insertfirst(3);
		l1.insertfirst(101);
		l1.insertfirst(40);
		l1.insertfirst(154);
		l1.insertfirst(88);
		System.out.println("\nUnsorted LinkedList : "+l1);
		l1.SelectionSort();
		System.out.println("\nSorted LinkedList : "+l1);
	}

}
