
public class Main {
	
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(10);
		tree.insert(15);
		tree.insert(67);
		tree.insert(34);
		tree.setRoot(tree.insert_rec(tree.getRoot(),28));
		System.out.println("PreOrder Print :");
		tree.preOrderPrint();
		System.out.println("\n\ninOrder Print :");
		tree.inOrderPrint();
		System.out.println("\n\nPostOrder Print :");
		tree.postOrderPrint();
		System.out.println("\n\nSmallest value in tree:");
		tree.printSmallestValue();
		System.out.println("\nLargest value in tree:");
		tree.printLargestValue();
		tree.search(67);
		tree.delete(20);
		System.out.println("\n\nAfter deleting :");
		tree.inOrderPrint();
	}

}
