
public class Main {

	public static void main(String[] args) {

		Stack s1 = new Stack();
		Stack s2 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		System.out.println("Stack 1:"+s1);
		s2.push(60);
		s2.push(70);
		s2.push(80);
		s2.push(90);
		s2.push(100);
		System.out.println("Stack 2:"+s2);
		System.out.println("After merge stack is: "+ s1.merge(s2));
	}

}




