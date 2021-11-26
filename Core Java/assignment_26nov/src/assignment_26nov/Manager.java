package assignment_26nov;

public class Manager extends Employee {
private int maxteamSize;
	

public Manager(String name, int age, String gender, int empid, String role, int bankaccno, int basicSal,int maxteamSize) {
	super(name, age, gender,empid,role,bankaccno,basicSal);
	this.maxteamSize=maxteamSize;
}
public int getMaxteamSize() {
	return maxteamSize;
}

public void setMaxteamSize(int maxteamSize) {
	this.maxteamSize = maxteamSize;
}

@Override
public String toString() {
	return super.toString()+"\nMax team Size=" + maxteamSize+"";
}
@Override
public float cal_Salary() {
	float  salary=this.getBasicSal()+((0.5F)*this.getBasicSal())+10000;
	return salary;
}


}