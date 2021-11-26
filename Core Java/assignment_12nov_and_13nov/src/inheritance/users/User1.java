package inheritance.users;

import inheritance.Date;
import inheritance.Student;

public class User1 {

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.setName("Ram");
		s1.setRollno(1);
		s1.setDob(new Date(1,1,2000));
        System.out.println("Name: "+s1.getName()+"\nDOB:"+s1.getDob()+"\nRollNo: "+s1.getRollno());
	}

}
