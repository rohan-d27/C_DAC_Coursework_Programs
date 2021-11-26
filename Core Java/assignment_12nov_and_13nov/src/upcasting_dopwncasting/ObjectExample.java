package upcasting_dopwncasting;

import java.util.Scanner;
import has_a_relationship.Circle;
import has_a_relationship.Point;
import inheritance.Date;
import inheritance.Employee;

public class ObjectExample {

	public static void main(String[] args) {
		
		func1(new String("Hello"));                                    //RUN TIME data type is String
		func1(new Circle(5,new Point(4,5)));                           //RUN TIME data type is Circle
		func1(new Employee("Ram",new Date(1,1,2000),101,"IT",50000));  //RUN TIME data type is Employee
		func1(new Scanner(System.in));                                  //RUN TIME data type is Scanner
	}
	
	
	//compile time data type Object
      public static void func1(Object obj)
      {
    	  if(obj instanceof String)
    	  {
    		  System.out.println("String in UpperCase:"+((String) obj).toUpperCase());//DOWNCASTING
    	  }
    	  if(obj instanceof Scanner)
    	  {
    		  System.out.print("Enter anything:");
    	      String s=((Scanner) obj).nextLine(); //DOWNCASTING
    	      System.out.println(s);
    	  } 
    	  if(obj instanceof Circle)
    	  {
    		  System.out.println("Circle Radius:"+ ((Circle) obj).getRadius()); //DOWNCASTING
    		
    	  }
    	  if(obj instanceof Employee)
    	  {
    		  System.out.println("Employee Salary:" + ((Employee)obj).getSalary()); //DOWNCASTING
    	  }
      }
}
