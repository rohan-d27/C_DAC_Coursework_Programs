
public class Tree {

	Node root;

	public Tree() {
		root = null;
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
}
