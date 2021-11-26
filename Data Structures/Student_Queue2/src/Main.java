
public class Main {

	public static void main(String[] args) {

		int[]marks=new int[]{90,78,89,86,88};
		int[]marks1=new int[]{85,83,86,95,76};
		int[]marks2=new int[]{71,72,77,78,79};
		int[]marks3=new int[]{91,99,96,99,95};


		StudQueue q1 = new StudQueue();
		Student s1= new Student("a",20,marks);
		Student s2= new Student("b",21,marks1);
		Student s3= new Student("c",19,marks2);
		Student s4= new Student("d",20,marks3);
		StudQueue q2 = new StudQueue();
		q1.insert(s1);
		q1.insert(s2);
		q1.insert(s3);
		q1.insert(s4);
		System.out.println("All Students Data:\n"+ q1);
		q1=q1. Marksmorethan75();

		System.out.println("Students with marks more than 75:\n "+q1);




	}

}
