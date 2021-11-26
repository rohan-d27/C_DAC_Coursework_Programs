package assignment_26nov;

public class Developer extends Employee {


private int lineOfCode;
public Developer(String name, int age, String gender, int empid, String role, int bankaccno, int basicSal,int lineOFCode) {
	super(name, age, gender, empid, role, bankaccno, basicSal);
	this.lineOfCode=lineOFCode;
}

public int getLineOfCode() {
	return lineOfCode;
}

public void setLineOfCode(int lineOfCode) {
	this.lineOfCode = lineOfCode;
}

@Override
public String toString() {
	return super.toString()+"\nLine Of Code=" + lineOfCode + "";
}

@Override
public float cal_Salary() {
	float salary=this.getBasicSal()+(0.25f)*this.getBasicSal()+8000+2*this.getLineOfCode();
	return salary;
}

}
