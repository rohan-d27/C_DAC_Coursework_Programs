package Q2.CalArea;
import java.util.Scanner;
public class CalArea {
		int radius;
		int len;
		int breath;
		int base ;
		int height;

		public CalArea() {
				}
	         
		public void Circlea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int m=sc.nextInt();
		float pi=3.14f;
		float res=pi*m*m;
		System.out.println("Area of circle:"+res);
			
		}
		public void square() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter length of square:");
			int m=sc.nextInt();
			
			int res=m*m;
			System.out.println("Area of square:"+res);
				
			}
		public void rectangle() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter height:");
			int m=sc.nextInt();
			System.out.println("Enter breadth:");
			int n=sc.nextInt();
			int res=m*n;
			System.out.println("Area of circle:"+res);
				
			}
}
