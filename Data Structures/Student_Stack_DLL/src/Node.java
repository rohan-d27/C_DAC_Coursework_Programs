
public class Node {
	private Node prev;
	private Student data;
	private Node next;

	public Node(Student d) {
		data = d;
		next = null;	
	}

	public Node() {

	}

	public Node(Student d, Node n) {
		data = d;
		next = n;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getPrev() {
		return prev;
	}

	public Student getData() {
		return (Student) data;
	}

	public void setData(Student data) {
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


