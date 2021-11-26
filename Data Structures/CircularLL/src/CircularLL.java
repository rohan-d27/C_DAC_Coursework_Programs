
public class CircularLL {

	Node head;

	public CircularLL() {

		head = null;
	}

	public void insert(int value)
	{
		Node tmp = new Node(value);

		if(head == null)
		{
			head = tmp;
			head.setNext(head);
		}
		else
		{
			// this handles 1 or more than 1 nodes...
			Node it = head;

			while(it.getNext() != head)
			{
				it = it.getNext();
			}
			it.setNext(tmp);
			tmp.setNext(head);
			head = tmp;
		}
	}

	public void append(int value)
	{
		Node tmp = new Node(value);

		if(head == null)
		{
			head = tmp;
			head.setNext(head);
		}
		else
		{
			// this handles 1 or more than 1 nodes...
			Node it = head;

			while(it.getNext() != head)
			{
				it = it.getNext();
			}

			it.setNext(tmp);
			tmp.setNext(head);
		}
	}

	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("CLL is empty");
		}
		else
		{
			//we have 1 or more than 1 nodes..
			//Check for only 1 node
			if(head.getNext() == head)
			{
				head.setNext(null);  // to avoid memory leak
				head = null;
			}
			else
			{
				//more than 1 node
				//swap(head.data, head.next.data);
				int x = head.getData();
				head.setData( head.getNext().getData() );
				head.getNext().setData(x); 
				
				//now delete head.next...
				Node tmp = head.getNext();
				head.setNext(tmp.getNext());
				tmp.setNext(null);
			}
		}
	}
	

	public String toString() {
		
		String str = "";
		
		Node it = head;
		
		do
		{
			str += "" + it + "-->";
			it = it.getNext();
			
		}while(it != head);
		
		return str;
	}
	
}
