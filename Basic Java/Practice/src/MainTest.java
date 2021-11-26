import java.util.Scanner;
public class MainTest {

	public static void main(String[] args) {
		System.out.println("Enter your test score:");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		if(t>=90)
		{
			System.out.println("A Grade");
		}

		if(t>=80&&t<90)
		{
			System.out.println("B Grade");
		}
		if(t>=70&&t<80)
		{
			System.out.println("C Grade");
		}
		if(t>=60&&t<70)
		{
			System.out.println("D Grade");
		}
		if(t>=50&&t<60)
		{
			System.out.println("E Grade");
		}


	}

}


