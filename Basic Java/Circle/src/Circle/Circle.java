package Circle;

public class Circle {

	private int radius;
	private Point center;
	
	public Circle(int rad)
	{
		//Assuming center as (0,0)
		radius = rad;
		center = new Point(0,0);
	}

	public Circle(int rad, int x, int y)
	{
		radius = rad;
		center = new Point(x,y);
	}
	
	public String toString()
	{
		String str= "Radius :" + radius + ", Center :" + center;
		return str;
	}

	public boolean intersect(Circle x) {
		
		//c1 is nothing but this
		//c2 is x
		
		int sumOfRadius = this.radius + x.radius;
		
		int xsq =  (this.center.getX() - x.center.getX()) * (this.center.getX() - x.center.getX());
		int ysq =  (this.center.getY() - x.center.getY()) * (this.center.getY() - x.center.getY());
		
		double distanceBetweenPoints = Math.sqrt(xsq + ysq);
		
		if(sumOfRadius < distanceBetweenPoints)
			return false;
		else
			return true;
	}
	
	//Eclipse, Array of objects, this ref, getter/setter, public/private  var/function, hashcode 
	
}



