package Q2.CalArea;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		CalArea k = new CalArea();
		while (true) {
		System.out.println("Find Area of: \n1.Circle \n2.Square \n3.Rectangle \n4.Exit\n");
		Scanner sc=new Scanner(System.in);
		int o=sc.nextInt();
		if (o==4) {
			break;
		}
		switch (o) {
		case 1:
			k.Circlea();
			break;

		case 2:
			k.square();
			break;
		case 3:
			k.rectangle();
			break;
		
			
		default:
			break;
		}
		
	}
		
	}

}
