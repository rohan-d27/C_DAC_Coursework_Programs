package extra_assignment_13nov;

public class Child extends Parent {
    private int y;

	
    
    public Child() {
		
	}

	public Child(int x,int y) {
		super(x);
		this.y = y;
	}
	
	
	
	public void show()
	{
		super.show();
		System.out.println("Child x= "+ this.getX()  + " y= " +y+ "\n");
		
	}
}
