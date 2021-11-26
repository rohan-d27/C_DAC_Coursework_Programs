public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}
	public void SelectionSort()
	{
		int temp;
		Node it=head;
		Node itn=head;
		if(head==null)
		{
			System.out.println("linkedlist is empty");
		}
		else
		{
			while(it!=null)
			{	
				itn=it.getNext();
				
			while(itn!=null)
				{
					if(it.getData()>itn.getData())
					{
						temp=(it.getData());
						it.setData(itn.getData());
						itn.setData(temp);	
					}
					else
					{
						itn=itn.getNext();
					}
					
					
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

	public int getnumofNodes() {
		int node_count=0;
		Node it=head;
		while(it!=null)
		{
			node_count++;
			it=it.getNext();	
		}
		return node_count;

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

	
	

	public void Emptylist()
	{
	   Node it = head;
	   while (it!=head)
	   {
		   Node itn = it.getNext();
		   it.setNext(null);
		   it=itn;
	   }
	   head=null;
	}

	public void reverse() {
		Node itp=null;
		Node it=head;
		Node itn=head;
		while(it!=null) {
			itn=itn.getNext();
			it.setNext(itp);
			itp=it;
			it=itn;
		}
		head=itp;	
	}
	
	
	
}
