import java.util.Scanner;

/*Create Student object with below member variables and provide helping function into Students class
- age
- name
- mobile_no
- email id

Apply hashing on above Students object to place them in array size 10.
1)Make use of student's mobile_no for calculating hashcode (key)
Make use of linear probing for collisions
2)Print number of times collision happened while placing 10 students in array. 

*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students You want:");
		int size = sc.nextInt();
		StringHash s1 = new StringHash(size);
		for (int i = 0; i < size; i++) 
		{
		
			s1.insert(read());
		}
	}	
	
	
		public static Student read()
		{
			Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Student Name:");
				String n=sc.next();
				
				
				System.out.println("Enter Student Age:");
				int a=sc.nextInt();
				
				
				System.out.println("Enter Student Mobile No.:");
				String no=sc.next();
				
				System.out.println("Enter Student Email:");
				String em=sc.next();
				return new Student(n,a,no,em);
						
		}
}
