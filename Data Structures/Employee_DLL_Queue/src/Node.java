
public class Node {
	private Node prev;
	private Employee data;
	private Node next;

	public Node(Employee d) {
		data = d;
		next = null;	
	}

	public Node() {

	}

	public Node(Employee d, Node n) {
		data = d;
		next = n;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getPrev() {
		return prev;
	}

	public Employee getData() {
		return (Employee) data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


	public String toString()
	{

		String str = "";
		str = "" + data + "-->"+"\n";
		return str;
	}

}


