import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int no = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter number of Students:");
		no = sc.nextInt();
		Student [] students = new Student[no];
		populate_students(students, sc);
		System.out.println("\n\nUnsorted Student List:");
		print_students(students);
		Sort.Selection(students);
		System.out.println("\n\nSelection Sorted Students List:");
		print_students(students);
		Sort.Insertion(students);
		System.out.println("\n\nInsertion Sorted Students List:");
		print_students(students);
		Sort.Bubble(students);
		System.out.println("\n\nBubble Sorted Students List:");
		print_students(students);
		Sort.Quick(students);
		System.out.println("\n\nQuick Sort Sorted Students List:");
		print_students(students);
		
	}

	private static void print_students(Student[] students) {
		
		System.out.println("Student Details:");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	private static void populate_students(Student[] students, Scanner sc) {

		for (int i = 0; i < students.length; i++) {

			int rollNo=0;
			String name="";

			System.out.println("Enter Student Name:");
			name = sc.next();

			System.out.println("Enter Student RollNo:");
			rollNo = sc.nextInt();

			//Now create the students...
			students[i] = new Student(name, rollNo);
		}
	}

}
