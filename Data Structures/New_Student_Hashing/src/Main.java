import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students You want  :  ");
		int size=sc.nextInt();
		StdHash s1 = new StdHash(size);
		for(int i=0;i<size;i++)
		{
		s1.hash_insert( get_student());
		}
	}

	
	private static Student get_student() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Student  :   ");
		String name = sc.next();
		System.out.println("Enter age  of student  :  ");
		int age = sc.nextInt();
		System.out.println("Enter Mobile Number   :  ");
		String No = sc.next();
		System.out.println("Enter Email Address of student   :    ");
		String email = sc.next();
		
		return new Student(name,age,No,email);
	}
	
	
}