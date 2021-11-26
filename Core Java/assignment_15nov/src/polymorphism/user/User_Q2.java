package polymorphism.user;

import polymorphism.Author;
import polymorphism.Book;
import polymorphism.Circle;
import polymorphism.Date;
import polymorphism.Employee;
import polymorphism.InternshipStudent;
import polymorphism.Patient;
import polymorphism.Person;
import polymorphism.Point;
import polymorphism.Product;
import polymorphism.Student;

public class User_Q2 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(5,new Point(3,4));
		Circle c2=new Circle(5,new Point(4,4));
		checkEqaulity(c1,c2);
	
		Point p1=new Point(4,5);
		Point p2=new Point(5,5);
		checkEqaulity(p1,p2);
		
		Author b=new Author();
		String[] str1=new String[1];
		str1[0]="Neil Gaiman";
		b.setAuthor(str1);
		Book bk1=new Book("Good Omen",500,b);
		
		Author b1=new Author();
		String[] str2=new String[2];
		str2[0]="Neil Gaiman";
		str2[1]="Gaiman";
		b1.setAuthor(str2);
		Book bk2=new Book("Good Omen",500,b1);
		checkEqaulity(bk1,bk2);
		
		Date d1=new Date(15,11,2021);
		Date d2=new Date(19,11,2021);
		checkEqaulity(d1,d2);
		
		Product pd1=new Product("Dettol","Soap",20,new Date(1,8,2022));
		Product pd2=new Product("Dettol","Soap",20,new Date(1,2,2022));
		checkEqaulity(pd1,pd2);
		
		Person pr1=new Person("Rohan",new Date(27,8,1998));
		Person pr2=new Person("Rohit",new Date(27,8,1998));
		checkEqaulity(pr1,pr2);
		
		
		
		Student std1=new Student("Vedant",new Date(6,6,2006),34);
		Student std2=new Student("Vedant",new Date(6,6,2009),34);
		checkEqaulity(std1,std2);
		
		
		
		Employee emp1=new Employee("Ajit",new Date(3,1,1995),1,"IT",50000);
		Employee emp2=new Employee("Ajit",new Date(5,1,1995),1,"IT",50000);
		checkEqaulity(emp1,emp2);
		
		
		Patient ptn1=new Patient("Sham",new Date(1,1,2001),"Flu");
		Patient ptn2=new Patient("Sham",new Date(1,1,2004),"Flu");
		checkEqaulity(ptn1,ptn2);
		
		
		InternshipStudent istd1=new InternshipStudent("Ganesh",new Date(7,3,2006),4,4500);
		InternshipStudent istd2=new InternshipStudent("Ganesh",new Date(3,3,2006),4,4500);
		checkEqaulity(istd1,istd2);
	
	}
	
	public static void checkEqaulity(Object obj1, Object obj2)
	{
		
		if(obj1 instanceof Circle)
		{
			if(((Circle)obj1).equals(((Circle)obj2)) )
			{
			System.out.println("Circle are equal\n"); 
			}
		else
		     {
			System.out.println("Circle are not equal\n"); 
		     }
		}
		if(obj1 instanceof Point)
		{
			if(((Point)obj1).equals(((Point)obj2)) )
			{
			System.out.println("Point are equal\n"); 
			}
		else
		     {
			System.out.println("Point are not equal\n"); 
		     }
		}
		if(obj1 instanceof Book)
		{
			if(((Book)obj1).equals(((Book)obj2)) )
			{
			System.out.println("Book are equal\n"); 
			}
		else
		     {
			System.out.println("Book are not equal\n"); 
		     }
		}
		if(obj1 instanceof Date)
		{
			if(((Date)obj1).equals(((Date)obj2)) )
			{
			System.out.println("Date are equal\n"); 
			}
		else
		     {
			System.out.println("Date are not equal\n"); 
		     }
		}
		if(obj1 instanceof Product)
		{
			if(((Product)obj1).equals(((Product)obj2)) )
			{
			System.out.println("Product are equal\n"); 
			}
		else
		     {
			System.out.println("Product are not equal\n"); 
		     }
		}
		if(obj1 instanceof Person)
		{
			if(((Person)obj1).equals(((Person)obj2)) )
			{
			System.out.println("Person are equal\n"); 
			}
		else
		     {
			System.out.println("Person are not equal\n"); 
		     }
		}
		if(obj1 instanceof Student)
		{
			if(((Student)obj1).equals(((Student)obj2)) )
			{
			System.out.println("Student are equal\n"); 
			}
		else
		     {
			System.out.println("Student are not equal\n"); 
		     }
		}
		if(obj1 instanceof Employee)
		{
			if(((Employee)obj1).equals(((Employee)obj2)) )
			{
			System.out.println("Employee are equal\n"); 
			}
		else
		     {
			System.out.println("Employee are not equal\n"); 
		     }
		}
		if(obj1 instanceof Patient)
		{
			if(((Patient)obj1).equals(((Patient)obj2)) )
			{
			System.out.println("Patient are equal\n"); 
			}
		else
		     {
			System.out.println("Patient are not equal\n"); 
		     }
		}
		if(obj1 instanceof InternshipStudent)
		{
			if(((InternshipStudent)obj1).equals(((InternshipStudent)obj2)) )
			{
			System.out.println("InternshipStudent are equal\n"); 
			}
		else
		     {
			System.out.println("InternshipStudent are not equal\n"); 
		     }
		}
	}
}
