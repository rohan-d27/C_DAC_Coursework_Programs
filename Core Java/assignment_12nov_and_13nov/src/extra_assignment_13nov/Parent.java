package extra_assignment_13nov;

public class Parent {

	private int x;

	public Parent() {
		
	}

	public Parent(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public  void show()
	{
		System.out.println("Parent x= "+x+ "\n");
	}
	
}
