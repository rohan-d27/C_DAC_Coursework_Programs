
public class Main {

	public static void main(String[] args) {
		
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		
		q1.insert(11);
		q1.insert(22);
		q1.insert(33);
		q1.insert(44);
		q1.insert(55);
		System.out.println("q1: "+ q1);
		
		q2.insert(66);
		q2.insert(77);
		q2.insert(88);
		q2.insert(99);
		q2.insert(100);
		//q2.remove();
		//q2.remove();
	
		//q2.sameAs(q1);
		System.out.println("q2: "+ q2);
		
		System.out.println("After concat queue is: "+ q1.concat(q2));
		
	
	}
}
