package testWrapperClass;

public class TestWrapperClass4 {

	public static void main(String[] args) {
		Integer x= 33;
		MyWrapper y= new MyWrapper();
		y.value=20;
		System.out.println("x: "+x);
		System.out.println("y: "+y.value);
		increment(x);
		increment(y);
		System.out.println("x: "+x); //as x is immutable
		System.out.println("y: "+y.value); 
	}

public static void increment(Integer x)
{
	x++; //auto boxing + unboxing
}
public static void increment(MyWrapper y)
{
	y.value =y.value+1;
}
}
	class MyWrapper{
		int value;
		
	}

