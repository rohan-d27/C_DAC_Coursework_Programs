
public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}
	
	

	public void insertlast(int d)
	{
		Node newNode = new Node(d);
		newNode.setNext(null); 
		if(head == null) {
			head = newNode;
		} else {
			Node temp = new Node(d);
			temp = head;
			while(temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(newNode);
		}    
	}
	public void deletefirst() {
		if(head==null)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{
			if(head.getNext()==null)
			{
				Node tmp=head;
				head=null;
			}
			else
			{
				Node tmp=head;
				head=tmp.getNext();
				tmp.setNext(null);
			}
		}
	}

	public String toString() {
		String str = "";

		Node it = head; //it=iterator


		while(it != null)
		{

			str += "" + it;
			it = it.getNext();
		}

		return str;
	}

	

	
}
