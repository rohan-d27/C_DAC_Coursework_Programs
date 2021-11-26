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

	public void insertlast(int d)
	{
		Node newNode = new Node(d);
		newNode.setNext(null); 
		if(head == null) {
			head = newNode;
		} else 
		{
			Node temp = new Node(d);
			temp = head;
			while(temp.getNext() != null)
				{
					temp = temp.getNext();
				}
			temp.setNext(newNode);
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
	public void insertbypos(int d, int pos) {
		int numofNodes=getnumofNodes();
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
			int it_pos=pos-1;
			while(it_pos!=0)
			{
				it=it.getNext();
				it_pos--;
			}
			temp.setNext(it.getNext());
			it.setNext(temp);
		}
		else
		{
			System.out.println("Invalid Position");
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

	public void deletelast() {
		if(head==null)
		{
			System.out.println("linklist is empty");
		}
		else
		{
			if(head.getNext()==null)
			{	
				Node temp=head;
				head=null;
			}
			else
			{
			   Node it=head;
		       while(it.getNext().getNext()!=null)
		       {
			       it=it.getNext();
		       }
		       Node temp=it.getNext();
		       it.setNext(null);
			}
		}
		
	}
	public void deletebypos(int pos) {
		int numofNodes=getnumofNodes();
		Node temp=new Node();
		if(pos==1)
		{
			deletefirst();
		}
		else if(pos==(numofNodes+1))
		{
			deletelast();
		}
		else if(pos>1&& pos< numofNodes+1) 
		{

			Node it=head;
			for(int i=1;i<pos-1;i++)
			{
				it=it.getNext();
			}
			temp.setNext(it.getNext().getNext());
			it.setNext(temp.getNext());
			temp.setNext(null);
		}
			else
			{
				System.out.println("Invalid Position");
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
	public void recursion(Node it) {
		if(it.getNext()!=null)
		{
			it=it.getNext();
			recursion(it);
			System.out.print(it);
		}
	}
	public void reverserec()
	{
		recursion(head);
		System.out.println(head);
	}
	public void search(int no) {

		Node it =head;
		int index=0;
		while(it!=null)
		{
			
			
			if(it.getData()==no)
			{
				
				break;
			}
			
			it=it.getNext();
			index=index+1;
		}
		System.out.println(no+" found at this "+index+" postion in list");
	}
		
	
}
