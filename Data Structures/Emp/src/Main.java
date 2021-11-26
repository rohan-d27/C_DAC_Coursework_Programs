import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		System.out.println("Enter date in dd-mm-yyyy format:");
		Scanner sc = new Scanner(System.in);
		String dateString = sc.next();

		//dateString 12-3-1987
		//After split with -, 12 3 1987

		String [] splitDate = dateString.split("-");

		if(splitDate.length < 3)
			System.out.println("Invalid date format...!");
		else
		{
			int d = Integer.parseInt(splitDate[0]);
			int m = Integer.parseInt(splitDate[1]);
			int y = Integer.parseInt(splitDate[2]);

			Date dob = new Date(d, m, y);
			System.out.println(dob);
		}
		/*Emp shrinivas = new Emp();
		System.out.println(shrinivas.getDob().getMonth());

		Emp [] emps = new Emp[10];

		emps[0] = new Emp();
		emps[1] = new Emp();

		emps[0].getDob().setMonth(5);
		System.out.println(emps[0].getName());*/
	}




}
