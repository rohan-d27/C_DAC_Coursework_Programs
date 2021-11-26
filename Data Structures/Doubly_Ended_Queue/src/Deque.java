
public class Deque {
	Node front;
	Node rear;
	int Size;

	Deque()
	{
	front = rear = null;
	Size = 0;
	}

	// Function to check whether deque
	// is empty or not
	boolean isEmpty() { return (front == null); }

	// Function to return the number of
	// elements in the deque
	int size() { return Size; }

	// Function to insert an element
	// at the front end
	void insertFront(int data)
	{
	Node newNode = Node.getnode(data);
	// If true then new element cannot be added
	// and it is an 'Overflow' condition
	if (newNode == null)
		System.out.print("OverFlow\n");
	else {
		// If deque is empty
		if (front == null)
		rear = front = newNode;

		// Inserts node at the front end
		else {
		newNode.next = front;
		front.prev = newNode;
		front = newNode;
		}

		// Increments count of elements by 1
		Size++;
	}
	}

	// Function to insert an element
	// at the rear end
	void insertRear(int data)
	{
	Node newNode = Node.getnode(data);
	// If true then new element cannot be added
	// and it is an 'Overflow' condition
	if (newNode == null)
		System.out.print("OverFlow\n");
	else {
		// If deque is empty
		if (rear == null)
		front = rear = newNode;

		// Inserts node at the rear end
		else {
		newNode.prev = rear;
		rear.next = newNode;
		rear = newNode;
		}

		Size++;
	}
	}

	// Function to delete the element
	// from the front end
	void deleteFront()
	{
	// If deque is empty then
	// 'Underflow' condition
	if (isEmpty())
		System.out.print("UnderFlow\n");

	// Deletes the node from the front end and makes
	// the adjustment in the links
	else {
		Node temp = front;
		front = front.next;

		// If only one element was present
		if (front == null)
		rear = null;
		else
		front.prev = null;

		// Decrements count of elements by 1
		Size--;
	}
	}

	// Function to delete the element
	// from the rear end
	void deleteRear()
	{
	// If deque is empty then
	// 'Underflow' condition
	if (isEmpty())
		System.out.print("UnderFlow\n");

	// Deletes the node from the rear end and makes
	// the adjustment in the links
	else {
		Node temp = rear;
		rear = rear.prev;

		// If only one element was present
		if (rear == null)
		front = null;
		else
		rear.next = null;

		// Decrements count of elements by 1
		Size--;
	}
	}

	// Function to return the element
	// at the front end
	int getFront()
	{
	// If deque is empty, then returns
	// garbage value
	if (isEmpty())
		return -1;
	return front.data;
	}

	// Function to return the element
	// at the rear end
	int getRear()
	{

	// If deque is empty, then returns
	// garbage value
	if (isEmpty())
		return -1;
	return rear.data;
	}

	// Function to delete all the elements
	// from Deque
	void erase()
	{
	rear = null;
	while (front != null) {
		Node temp = front;
		front = front.next;
	}
	Size = 0;
	}

	
	public String toString() {
		return "Deque front=" + front + ", rear=" + rear + ", Size=" + Size + "";
	}

}
