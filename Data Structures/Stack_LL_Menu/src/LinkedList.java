
public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}
	Node top;
	public LinkedList(Node top)
	{
		this.top=null;
	}
	public void peek()
	{


		Node it=head;
		if(it==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println(top.getData()+" is at the top of stack");
		}
//		else
//		{
//			while(it.getNext()!=null)
//			{
//				it=it.getNext();
//			}
//			
//		System.out.println(it +"is at top");
//		}
		
	}
	public void odd()
	{
		Node it=head;
		if(it==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			while(it!=null)
			{
				if((it.getData()%2)!=0)
				{
					System.out.print(it);
				}
				it=it.getNext();
			}
			
	}
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
		 top=tmp;
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
