package has_a_relation;

import java.util.Scanner;

public class Main_Circle {

	public static void main(String[] args) {
		
		System.out.println("Enter number of circle ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Circle[] arr=new Circle[x];
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=new Circle();
			arr[i].populate();
		}
		System.out.println("Showing Circles with y coordinate between 10 & 90:\n");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getCentre().getY()>=10 && 90>=arr[i].getCentre().getY())
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("\nShowing all Circles y coordinate:");
		for(int i=0;i<arr.length;i++)
		{
			
			{
				System.out.println("Y coordinate: "+arr[i].getCentre().getY());
			}
		}
	}

}
