
public class DoublyLinkedList {

	Node head;
	Node tail;

	public DoublyLinkedList() {
		head = null;
		tail=null;
	}

	public void insertfirst(int value) {

		Node tmp = new Node(value);

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

	public void insertlast(int d)
	{
		Node tmp = new Node(d);
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
	public void insertbypos(int d,int pos)
	{
		int numofNodes=getNodeCount();
		if(pos==1)
		{
			insertfirst(d);
		}
		else if(pos==(numofNodes+1))
		{
			insertlast(d);
		}
		else if(pos>1&& pos< numofNodes+1) 
		{
			Node temp=new Node(d);
			Node it=head;
			int it_pos=1;
			while(it_pos!=pos-1) //this is done just to get it to position
			{
				it=it.getNext();
				it_pos++;
			}
			temp.setPrev(it);
			temp.setNext(it.getNext());
			it.setNext(temp);
		}
		else
		{
			System.out.println("Invalid Position");
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

	public void deletelast() 
	{
		if(head==null)
		{
			System.out.println("Doubly linked list is empty");
		}
		else
		{
			if(head==tail)
			{

				head=null;
				tail=null;
			}
			else
			{
				
				tail=tail.getPrev();
				tail.setNext(null);
				tail.setPrev(null);
				
				
			}
		}
	}
	private int getNodeCount()
	{
		int nodecount=0;
		Node it=head;
		while(it!=null)
		{
			nodecount++;
			it=it.getNext();
		}
		return nodecount;
	}
	public void deletebypos(int pos)
	{

		int nodecount=getNodeCount();
		if(pos==1)
		{
			deletefirst();	
		}
		else if(pos==nodecount)
		{
			deletelast();
		}
		else if(pos>1&&pos<nodecount)
		{
			int it_pos=1;
			Node it=head;
			while(it_pos!=pos)
			{
				it=it.getNext();
				it_pos++;
			}
			it.getPrev().setNext(it.getNext());
			it.getNext().setPrev(it.getPrev());
			it.setNext(null);
		}
		else
		{
			System.out.println("Invalid Position");
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
