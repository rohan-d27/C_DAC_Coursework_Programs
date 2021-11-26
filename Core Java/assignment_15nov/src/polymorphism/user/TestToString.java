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

public class TestToString {

	public static void main(String[] args) {
		
		Circle c=new Circle(5,new Point(3,4));
		check(c);
		
		Point p=new Point(4,5);
		check(p);
		
		Author b=new Author();
		String[] str1=new String[1];
		str1[0]="Neil Gaiman";
		b.setAuthor(str1);
		Book bk=new Book("Good Omen",500,b);
		check(bk);
		
		Date d=new Date(15,11,2021);
		check(d);
		
		Product pd=new Product("Dettol","Soap",20,new Date(1,2,2022));
		check(pd);
		
		Person pr=new Person("Rohan",new Date(27,8,1998));
	    check(pr);
		
		Student std=new Student("Vedant",new Date(6,6,2006),34);
		check(std);
		
		Employee emp=new Employee("Ajit",new Date(3,1,1995),1,"IT",50000);
		check(emp);
		
		Patient ptn=new Patient("Sham",new Date(1,1,2001),"Flu");
		check(ptn);
		
		InternshipStudent istd=new InternshipStudent("Ganesh",new Date(7,3,2006),4,4500);
		check(istd);
	}
	public static void check(Object obj)
	{
		System.out.println(obj.toString());
	}
	
}
