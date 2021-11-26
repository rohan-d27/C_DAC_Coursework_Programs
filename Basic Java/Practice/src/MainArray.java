import java.util.Scanner;
public class MainArray {

	public static void main(String[] args) {
		System.out.println("Enter number of students:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student []stud=new Student[n];
		//Student []stud=new Student[3];
		//stud[0]=new Student("A",23);
		//stud[1]=new Student("B",24);
		//stud[2]=new Student("C",25);
		for(int i=0;i<stud.length;i++)
		{
			stud[i]=new Student();
			String name;
			int age;
			System.out.println("Enter name:");
			name=sc.next();
			stud[i].setName(name);
			System.out.println("Enter age:");
			age=sc.nextInt();
			stud[i].setAge(age);
		}
         printStudent(stud);

	}

	public static void printStudent(Student stud[])
	{

		for(int i=0;i<stud.length;i++)
		{
			System.out.println(stud[i]);
		}
	}

}
