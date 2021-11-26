
public class Main {
	
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(10);
		tree.insert(15);
		tree.insert(67);
		tree.insert(34);
		
		tree.preOrderPrint();
		
	}

}
