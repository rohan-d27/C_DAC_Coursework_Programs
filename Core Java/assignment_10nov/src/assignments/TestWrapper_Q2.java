package assignments;

public class TestWrapper_Q2 {

	public static void main(String[] args) {
		MyWrapper x=new MyWrapper();
		x.value=10;
		MyWrapper y=new MyWrapper();
		y.value=20;
	System.out.println("Before swapping x: "+x.value+" & y:"+y.value);

		swap(x,y);
	}

public static  void swap(MyWrapper x,MyWrapper y)
{
	MyWrapper temp=new MyWrapper();
	temp.value= x.value;
	x.value=y.value;
	y.value=temp.value;
	System.out.println("\nAfter Swapping x: "+x.value+" & y:"+ y.value);
}
}
class MyWrapper{
	int value;
	
}