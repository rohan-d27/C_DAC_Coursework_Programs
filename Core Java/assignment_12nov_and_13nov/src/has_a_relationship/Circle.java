package has_a_relationship;

import java.util.Scanner;

public class Circle {

	private int radius;
	private Point centre;
	public Circle(int radius, Point centre) {
		
		this.radius = radius;
		this.centre = centre;
	}
public Circle() {
		
		
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public void populate()
	{
		
		System.out.println("Enter radius:");
		Scanner sc=new Scanner(System.in);
		int rad=sc.nextInt();
		this.setRadius(rad);
		System.out.println("Enter x co-ordiante:");
		int x=sc.nextInt();
		System.out.println("Enter y co-ordiante:");
		int y=sc.nextInt();
		Point c=new Point(x,y);
		this.setCentre(c);
		
		
	}
	
	public String toString() {
		return "Circle radius=" + radius + ", centre=" + centre + "";
	}
	
}
