import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		
		Student [] students ;
		int noOfStudents = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How Many Students?");
		noOfStudents = sc.nextInt();
		students = new Student[noOfStudents];
		
		populate_students(students, sc);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		Student s = findStudentWithHigestMarkInSubject2(students);
		System.out.println("HigestMarkInSubject2 :");
		System.out.println(s);
		
		System.out.println("----------------------------");
		
	}

	static Student findStudentWithHigestMarkInSubject2(Student[] students) 
	{
		int maxMark = 0;
		Student selectedStudent = null;
		for (int i = 0; i < students.length; i++) {
			
			Student student = students[i];
			int [] m = student.getMarks();
			
			if(m[1] > maxMark)
			{
				selectedStudent = student;
				maxMark = m[1];
			}						
		}		
		return selectedStudent;
	}

	static void populate_students(Student[] students, Scanner sc) {
		
		
		for (int i = 0; i < students.length; i++) {
			
			int a=0;
			String n="";
			int []m = new int[5];
			
			System.out.println("Enter Student name:");
			n = sc.next();
			
			System.out.println("Enter Student Age:");
			a = sc.nextInt();
			
			System.out.println("Enter Student Marks of 5 Subject:");
			for (int j = 0; j < m.length; j++) {
				m[j] = sc.nextInt();			
			}
			
			//Now create the students...
			students[i] = new Student(n, a , m);
			
			
		}
	}
	
	
	/*public static void main(String [] args)
	{
		int a=0;
		String n="";
		int []m = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name:");
		n = sc.next();
		
		System.out.println("Enter Student Age:");
		a = sc.nextInt();
		
		System.out.println("Enter Student Marks of 5 Subject:");
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextInt();			
		}
		
		Student ram = new Student(n, a);
		//
		//
		ram.setMarks(m);
		System.out.println(ram);
		
	}*/
}
