
public class Node {
	
	private Book data;
	private Node next;

	
	public Node(Book d) {
		data = d;
		next = null;	
	}
	
	public Node() {
		
	}

	public Node(Book d, Node n) {
		data = d;
		next = n;
	}
	
	public Book getData() {
		return data;
	}

	public void setData(Book data) {
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
		str = "" + data + "-->\n";
		return str;
	}
	
		
		
		
	}
	

