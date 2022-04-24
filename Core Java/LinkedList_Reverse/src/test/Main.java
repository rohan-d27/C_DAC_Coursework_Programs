package test;

import java.util.Stack;

public class Main {
	public static void main(String[] args)
	{
		Linkedlist list=new Linkedlist();
		list.append(1);
		list.append(2);
		list.append(3);
	//	list.append(4);
		list.append(3);
		list.append(2);
		list.append(1);
		boolean ispal=isPallindrome(list);
		if(ispal)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
	}

	private static boolean isPallindrome(Linkedlist list) {
		Node temp=list.head;
		boolean is_pal=true;
		Stack<Integer> stack=new Stack<>();
		while(temp!=null)
		{
			stack.push(temp.getData());
			temp=temp.getNext();
		}
		
		while(list.head!=null)
		{
			int stack_data=stack.pop();
			if(list.head.getData()==stack_data)
			{
				is_pal=true;
			}
			else
			{
				is_pal=false;
				break;
			}
			list.head=list.head.getNext();
			
		}
		return is_pal;
	}

	
}
class Node {
	private int data;
	private Node next;

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}

class Linkedlist {
	Node head;

	public Linkedlist() {
		head = null;
	}

	public void append(int d) {
		Node temp = new Node(d);
		if (head == null) {
			head = temp;
		}

		else {
			Node it = head;

			while (it.getNext() != null) {
				it = it.getNext();
			}
			it.setNext(temp);
		}
	}
}
