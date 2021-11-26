/*COP_Assignment_4*/
/*Q1.Create a class AreaCalculate to write data members
as final pi=3.14 ,radius now 
write two functions in class AreaCalculate area() and circumference()
Now create Main class in that write main() method to create object of AreaCalculate class and call
area() function and circumference() function.*/


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AreaCalculate arr=new AreaCalculate();

		System.out.println("Enter radius:");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		arr.setRadius(r);
		arr.findarea();
		arr.findcircumference();


	}



}
