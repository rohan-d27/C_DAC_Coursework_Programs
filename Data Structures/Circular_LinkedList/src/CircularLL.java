
public class CircularLL {
	Node head;

	public CircularLL()
	{
		head=null;
	}
	public void insert(int value)
	{
		Node tmp=new Node(value);
		if(head==null)
		{
			head=tmp;
			head.setNext(head);
		}
			else
			{
				Node it=head;
				while(it.getNext()!=head)
				{
					it=it.getNext();
				}
				it.setNext(tmp);
				tmp.setNext(head);
				head=tmp;
			}
		}
	

	public void append(int value)
	{
		Node tmp=new Node(value);
		if(head==null)
		{
			head=tmp;
			head.setNext(head);
		}
		else
		{
			Node it=head;
			while(it.getNext()!=head)
			{
				it=it.getNext();
			}
			it.setNext(tmp);
			tmp.setNext(head);
		}
	}
	public void deletefirst() {

		if(head==null)
		{
			System.out.println("Circular LL is empty");
		}
		else
		{
			if(head.getNext()==head)
			{
				head.setNext(null);
				head=null;
			}
			else
			{
				int x=head.getData();
				head.setData(head.getNext().getData());
				head.getNext().setData(x);
				
				Node tmp=head.getNext();
				head.setNext(tmp.getNext());
				tmp.setNext(null);

			}
		}
	}
	public int getnumofNodes() {
		 int count=0;
		   Node it=head;
		  while(it.getNext()!=head)
		  {
				 it=  it.getNext();
				   count++;
		  }
		   return count+1;

	}
	public void insertbypos(int d, int pos) {
		int num=getnumofNodes();
		Node temp=new Node(d);
		if(pos==1)
		{
			insert(d);
		}
		else if(pos==num+1)
		{
			append(d);
		}
		else if(pos>1 && pos<(num+1))
		{
			Node it=head;
			for(int i=1;i<(pos-1);i++)
			{
				it=it.getNext();
			}
			temp.setNext(it.getNext());
			it.setNext(temp);
		}
		else
		{
			System.out.println("invalid position");
		}
		
		
	}

	
	public void deletelast() {
		if(head==null)
		{
			System.out.println("CLL is empty");
		}
		else
		{
			if(head.getNext()==head)
			{
				head.setNext(null);
				head=null;
			}
			else
			{
				Node it=head;
				while(it.getNext().getNext()!=head)
				{
					it=it.getNext();
				}
				Node temp=it.getNext();
			    temp.setNext(null);
			    temp=null;
			    it.setNext(head);
			}
		}
	}
	public void deletebypos(int pos) {
		int num=getnumofNodes();
		if(pos==1)
		{
			deletefirst();
		}
		else if(pos==num+1)
		{
		    deletelast();
		}
		else if(pos>1 && pos<(num+1))
		{
		     Node it=head;
		     for(int i=1;i<(pos-1);i++)
		     {
		    	 it=it.getNext();
		     }
		     Node temp=it.getNext();
		     it.setNext(temp.getNext());
		     temp.setNext(null);
		   
		}
		else
		{
			System.out.println("invalid position");
		}
	}



	public void reverse() {
		Node itp=head;
		Node it=head.getNext();
		Node itn=head.getNext();
		
		while(it != head)
		{
			itn = itn.getNext();
			
			it.setNext(itp);
			
			itp = it;
			
			it = itn;
			
		}

		head.setNext(itp);
		head=itp;	
	}

	public String toString() {
		String str="";
		
		Node it = head;
		
		do
		{
			str+=""+it+"-->";
			it=it.getNext();
		}while(it!=head);
		
		return str;
	}
}
