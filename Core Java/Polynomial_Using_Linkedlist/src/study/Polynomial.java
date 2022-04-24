package study;

public class Polynomial {
	Node head;

	public Polynomial() {
		super();
	}

	public Polynomial(Node head) {
		super();
		this.head = head;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "Polynomial [head=" + head + "]";
	}

	public void addPolynomial(float coef,int exp)
	{
		Node newNode=new Node(coef,exp);
		if((head==null)||(exp>head.getExpo()))//if no node present or one node present
		{
			newNode.setNext(head);
			head=newNode;
		}
		else {
			Node temp=head;
			while((temp.getNext()!=null)&&(temp.getNext().getExpo()>=exp))//iterate till get to right postion
			{
				temp=temp.getNext();
			}
			if(newNode.getExpo()==temp.getExpo())//if equal expo add coef
			{
				temp.setCoeff(temp.getCoeff()+newNode.getCoeff());
			}
			else
			{
				newNode.setNext(temp.getNext());//if inserting between two nodes 
				temp.setNext(newNode);

			}

		}
	}
	public void display() {
		if(head==null)
		{
			System.out.println("Zero polynomial");
			return;
		}

		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getCoeff() +"x^" + temp.getExpo());
			temp=temp.getNext();
			if(temp!=null)
			{
				System.out.print(" + ");
			}
			else {
				System.out.print("\n");
			}

		}
	}// end of display function

}
