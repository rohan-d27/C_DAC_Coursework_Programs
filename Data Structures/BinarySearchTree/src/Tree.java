
public class Tree {

	Node root;

	public Tree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void insert(int value)
	{
		Node tmp = new Node(value);

		if(root == null)
		{
			//First node;
			root = tmp;
		}
		else
		{
			Node it = root;
			//We have some nodes in our tree....
			while(true)
			{
				if(tmp.getData() < it.getData())
				{
					if(it.getLeft() != null )
						it = it.getLeft();
					else
					{
						// It is pointing to your parent node...
						it.setLeft(tmp);
						break;
					}
				}
				else if (tmp.getData() > it.getData())
				{
					if(it.getRight() != null)
						it = it.getRight();
					else
					{
						// It is pointing to your parent node...
						it.setRight(tmp);
						break;
					}
				}
				else
				{
					System.out.println("Duplicate Number!!");
					break;
				}
			}

		}

	}
	public Node insert_rec(Node s,int data)
	{
		if(s==null)
		{
			s=new Node(data);

		}
		else if(data<s.getData())
		{
			s.setLeft(insert_rec(s.getLeft(),data));
		}
		else if(data>s.getData())
		{
			s.setRight(insert_rec(s.getRight(),data));
		}
		else
		{
			System.out.println("Duplicate value");
		}
		return s;
	}
	public void preOrderPrint()
	{
		preOrder(root);
	}

	private void preOrder(Node it) 
	{
		if(it != null)
		{
			System.out.print(it.getData() + ", ");
			preOrder(it.getLeft());
			preOrder(it.getRight());
		}
	}
	public void inOrderPrint()
	{
		inOrder(root);
	}
	public void inOrder(Node it)
	{
		if(it==null)
		{
			return;
		}
		inOrder(it.getLeft());
		System.out.print(it.getData()+", ");
		inOrder(it.getRight());

	}
	public void postOrderPrint()
	{
		postOrder(root);
	}
	public void postOrder(Node it) {
		if(it!=null)
		{
			postOrder(it.getLeft());
			postOrder(it.getRight());
			System.out.print(it.getData()+", ");
		}
	}
	public void printSmallestValue()
	{
		if(root==null)
		{
			System.out.println("Empty!");
		}
		else
		{
			Node it=root;
			while(it.getLeft()!=null)
			{
				it=it.getLeft();
			}
			System.out.println(it.getData());
		}
	}
	public void printLargestValue()
	{
		if(root==null)
		{
			System.out.println("Empty!");
		}
		else
		{
			Node it=root;
			while(it.getRight()!=null)
			{
				it=it.getRight();
			}
			System.out.println(it.getData());
		}
	}
	public void search(int value)
	{
		if(root==null)
		{
			System.out.print("Not Found");
		}
		else
		{
			Node it=root;
			boolean flag=false;
			while(it!=null)
			{
				if(value==it.getData())
				{
					flag=true;
					break;
				}
				else
				{
					if(value<it.getData())
					{
						it=it.getLeft();
					}
					else
					{
						it=it.getRight();
					}
				}
			}
			if(flag==true)
			{
				System.out.print("Found given Value");
			}
			else
			{
				System.out.print("Not Found!");
			}
		}
	}
	public Node getMaxValueNode(Node itn)
	{
		while(itn.getRight()!=null)
		{
			itn=itn.getRight();
		}
		return itn;
	}
	public void delete(int value)
	{
		root=deleteValue(root,value);
	}
	public Node deleteValue(Node it,int value)
	{
		if(it==null)
		{
			return it;
		}
		else
		{
			if(value<it.getData())
			{
				Node tmp=deleteValue(it.getLeft(),value);
				it.setLeft(tmp);
			}
			else if(value>it.getData())
			{
				Node tmp=deleteValue(it.getRight(),value);
				it.setRight(tmp);
			}
			else
			{
				if(it.getRight()==null)
				{
					Node tmp=it.getLeft();
					it.setLeft(null);
					return tmp;
				}
				else if(it.getLeft()==null)
				{
					Node tmp=it.getRight();
					it.setRight(null);
					return tmp;
				}
				else
				{
					Node tmp=getMaxValueNode(it.getLeft());
					int x=it.getData();
					tmp.setData(x);
					it.setLeft(deleteValue(it.getLeft(),tmp.getData()));
					return tmp;
				}
			}
		}
		return it;
	}
}
