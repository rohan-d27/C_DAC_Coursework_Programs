import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		EmpQueue q1 = new EmpQueue(3);
		
		Employee e1 = getNewEmpWithUserInput();
		q1.insert(e1);
		
		Employee e2 = getNewEmpWithUserInput();
		q1.insert(e2);
		
		System.out.println(q1);
		
		q1.remove();
		System.out.println();
		
		System.out.println(q1);
		
	}
	
	public static Employee getNewEmpWithUserInput()
	{
		Scanner sc = new Scanner(System.in);
		int sal, id;
		String name;
		
		System.out.println("Enter ID:");
		id = sc.nextInt();
		
		System.out.println("Enter Name:");
		name = sc.next();
		
		System.out.println("Enter Sal:");
		sal = sc.nextInt();
		
		Employee e = new Employee(id, name, sal);
		return e;
		
	}
	
}
