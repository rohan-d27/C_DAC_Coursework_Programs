package Circle;

public class MainCircle {

	public static void main(String[] args) {

		Circle c1  = new Circle(2);
		Circle c2  = new Circle(4, 5, 6);
		
		System.out.println(c1);
		System.out.println(c2);
		
		if( c1.intersect(c2) )
		{
			System.out.println("c1 intersect c2");
		}
	}

}



