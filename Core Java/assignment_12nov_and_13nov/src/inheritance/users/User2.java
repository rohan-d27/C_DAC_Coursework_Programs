package inheritance.users;

import inheritance.Date;
import inheritance.InternshipStudent;

public class User2 {

	public static void main(String[] args) {
		InternshipStudent istd =new InternshipStudent("Sham",new Date(2,2,2002),2,5000);
		System.out.println("Name: "+istd.getName()+"\nDOB:"+istd.getDob()+"\nRollNo: "+istd.getRollno()+"\nStipend:"+istd.getStipend());
	}

}
