
public class Main {

	public static void main(String[] args) {
		
		CircularLL cll = new CircularLL();
		
		cll.insert(10);
		cll.insert(20);
		cll.insert(30);
		cll.insert(40);
		cll.deleteFirst();
		System.out.println(cll);
	}
}
