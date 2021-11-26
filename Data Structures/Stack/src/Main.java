
public class Main {

	public static void main(String[] args) {

		Stack s1 = new Stack();
		Stack s2 = new Stack(25);
		
		s1.push(34);
		s2.push(84);
		s1.push(78);
		s2.push(10);
		s1.push(15);
		s2.pop();
		s1.push(16);
		s2.pop();
		s1.push(1);
		s2.pop();
		s1.push(6);
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}

	


