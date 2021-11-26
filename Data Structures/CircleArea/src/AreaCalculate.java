
public class AreaCalculate {
	private static final float pi=3.14f;
	private static int radius;


	public AreaCalculate() {

	}
	public AreaCalculate(int r) {
		r=radius;
	}


	public static int getRadius() {
		return radius;
	}

	public  void setRadius(int radius) {
		AreaCalculate.radius = radius;
	}

	public void findarea()
	{
		float area=pi*radius*radius;
		System.out.println("area:"+ area);
	}

	public void findcircumference()
	{
		float circumference=2*pi*radius;
		System.out.println("circumference:"+circumference);
	}

}
