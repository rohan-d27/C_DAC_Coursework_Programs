package assignment_26nov;

public class Main {

	public static void main(String[] args) {
		Employee mng=new Manager("A",30,"Male",20,"Manager",2345346,90000,50);
		System.out.println(mng);
		System.out.print("Total Salary=");
		mng.pay_Salary();
		Employee dev=new Developer("B",25,"Male",111,"Developer",274523,50000,2000);
		System.out.println("\n"+dev);
		System.out.print("Total Salary=");
		dev.pay_Salary();
		Employee qa=new QA("C",20,"Male",567,"QA",2844356,30000,100);
		System.out.println("\n"+qa);
		System.out.print("Total Salary=");
		qa.pay_Salary();
	}

}
