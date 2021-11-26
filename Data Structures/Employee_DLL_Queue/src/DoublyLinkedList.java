
public class DoublyLinkedList {

	Node head;
	Node tail;

	public DoublyLinkedList() {
		head = null;
		tail=null;
	}

	public void insertlast(Employee s) {

		Node tmp = new Node(s);
		tmp.setNext(null); 
		if(tail == null) {
			tail = tmp;
			head= tmp;
		} 
		else {
			tail.setNext(tmp);
			tmp.setPrev(tail);
			tail=tmp;

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

	public void listfemale() {
		Node it=head;
		while(it!=null)
		{
			if(it.getData().getGender().equals("female"))
			{
				System.out.println(it);
				break;
			}
			it=it.getNext();
		}
		
		
	}
		
	
	public void listmale() {
		Node it=head;
		while(it!=null)
		{
			if(it.getData().getGender().equals("male"))
			{
				System.out.println(it);              
				break;
			}
			it=it.getNext();
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
