
public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}
	
	public void insertfirst(int value) {
		
		Node tmp = new Node(value);
	
		if(head == null)
		{
			head = tmp;
		}
		
		else
		{
			if(head.getNext() == null)
			{
				
				tmp.setNext(head);
				head = tmp;
			}
			else
			{
				
				tmp.setNext(head);
				head = tmp;
			}			
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
