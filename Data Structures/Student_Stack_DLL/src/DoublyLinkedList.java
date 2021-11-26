
public class DoublyLinkedList {

	Node head;
	Node tail;

	public DoublyLinkedList() {
		head = null;
		tail=null;
	}

	public void insertfirst(Student s) {

		Node tmp = new Node(s);

		if(head == null)
		{
			head = tmp;
			tail=tmp;
		}

		else
		{	    
			tmp.setNext(head);
			head.setPrev(tmp);
			head = tmp;			
		}
	}

	
	public void deletefirst()
	{
		if(head==null)
		{
			System.out.println("Doubly linked list is empty");
		}
		else
		{
			if(head==tail)
			{
				Node tmp=head;
				head=null;
				tail=null;
			}
			else
			{
				Node tmp=head;
				head=head.getNext();
				head.setPrev(null);
				tmp.setNext(null);
			}
		}
	}

	
	public void reverse()
	{
		Node it=head;
		while (it!=null)
		{
			Node tmp=it.getNext();
			it.setNext(it.getPrev());
			it.setPrev(tmp);
			it=it.getPrev();
		}
		Node tmp=head;
		head=tail;
		tail=tmp;
	}
	public void empty()
	{
		Node it=head;
		while(it!=null)
		{
			Node itn=it.getNext();
			it.setNext(null);
			it.setPrev(null);
			it=itn;
		}
		head=tail=null;
	}
	 public boolean isEmpty() {
		 if(head==null)
			{
				return true;
			} 
		 else
		 {
			 return false;
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
