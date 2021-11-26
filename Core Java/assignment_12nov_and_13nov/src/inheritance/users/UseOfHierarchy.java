package inheritance.users;

import inheritance.Date;
import inheritance.InternshipStudent;
import inheritance.Student;

public class UseOfHierarchy {

	public static void main(String[] args) {
	Student s=new Student();
	s.setName("Ram");
	s.setDob(new Date(1,1,2000));
	
	s.setRollno(19);
	System.out.println("Name: "+s.getName()+" ,DOB: "+s.getDob()+" ,RollNO: "+s.getRollno());
	
  InternshipStudent istud =new InternshipStudent();
  istud.setName("Sham");
  istud.setDob(new Date(2,2,2002));
  istud.setRollno(21);
  istud.setStipend(5000);
	
  System.out.println("Name: "+istud.getName()+" ,DOB: "+istud.getDob()+" ,RollNO: "+istud.getRollno()+" ,Stipend"+istud.getStipend());
	
	
	
	}
  
}
