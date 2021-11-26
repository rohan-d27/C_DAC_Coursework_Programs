
public class Main {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3=new LinkedList();
		
		l1.insertfirst(40);
		l1.insertfirst(30);
		l1.insertfirst(20);
		l1.insertfirst(10);
		System.out.println("Unsorted Linkedlist1 is:\n"+l1);
		
		
		l2.insertfirst(80);
		l2.insertfirst(70);
		l2.insertfirst(60);
		l2.insertfirst(50);
		
		int l3_Size=l1.getnumofNodes()+l2.getnumofNodes();
		for(int i=0; i<l3_Size; i++) {
			l3.insertfirst(0);	
		}
		
		
		System.out.println("Unsorted Linkedlist2 is:\n"+l2);
		
		l1.SelectionSort();
		System.out.println("Sorted Linkedlist1 is:\n"+l1);
		
		l2.SelectionSort();
		System.out.println("Sorted Linkedlist2 is:\n"+l2);
		
		mergeSort(l1,l2,l3);
		System.out.println("Merge Sorted LinkedList 3 is :"+l3);
	}
	public static void mergeSort(LinkedList l1,LinkedList l2,LinkedList l3)
	{
		Node it1=l1.head;
		Node it2=l2.head;
		Node it3=l3.head;
		
		while(it1!=null&&it2!=null)
		{
			if(it1.getData()<it2.getData())
			{
				it3.setData(it1.getData());
				it1=it1.getNext();
				it3=it3.getNext();
			}
			else
			{
				it3.setData(it2.getData());
				it2=it2.getNext();
				it3=it3.getNext();
			}
		}
		while(it1!=null)
		{
			it3.setData(it1.getData());
			it1=it1.getNext();
			it3=it3.getNext();
		}
		while(it2!=null)
		{
			it3.setData(it2.getData());
			it2=it2.getNext();
			it3=it3.getNext();
		}
		
	}
 
}
