package polymorphism;

public class Point {

	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean equals(Object obj)
	{
		Point temp=(Point)obj;
		if(this.getX()==temp.getX()&&this.getY()==temp.getY())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString() {
		return "Point x=" + x + ", y=" + y + "\n";
	}
	
	
}
