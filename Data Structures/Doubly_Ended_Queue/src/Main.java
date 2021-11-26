
public class Main {
	public static void main(String[] args)
	{
		Deque dq = new Deque();
		
		dq.insertRear(10);
		dq.insertRear(20);
		dq.deleteRear();
		dq.insertFront(30);
		System.out.println(dq);
		System.out.print("Number of elements in Deque: "+ dq.size() + "\n");
		dq.deleteFront();
		System.out.print("After deleting front element new "+ "front is: " + dq.getFront()+ "\n");
	}
	

}
