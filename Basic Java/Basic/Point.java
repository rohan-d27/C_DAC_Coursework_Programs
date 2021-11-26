

}
public class Point {

	private int x;
	private int y;
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int ax)
	{
		x=ax;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int ay)
	{
		y=ay;
	}
	
	public Point(int ax, int ay) 
	{
		x=ax;
		y=ay;
	}
	
	public String toString()
	{
		//(3, 4)
		String str = "("+ x +", " + y +")";
		return str;
	}	
	