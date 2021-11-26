
public class Node {
	
		int data;
		Node prev;
		Node next;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		// Function to get a new node
		static Node getnode(int data)
		{
		Node newNode = new Node();
		newNode.data = data;
		newNode.prev = newNode.next = null;
		return newNode;
		}

		
		public String toString() {
			return "Node data=" + data + "," + "";
		}
		
	
}
