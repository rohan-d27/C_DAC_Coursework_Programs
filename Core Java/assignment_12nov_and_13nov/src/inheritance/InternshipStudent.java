package inheritance;

public class InternshipStudent extends Student {
	int stipend;

	public InternshipStudent() {
		System.out.println("No Parameter constructor of InternshipStudent class");
	}

	public InternshipStudent(String n,Date d,int rn,int stipend) {
		super(n,d,rn);
		this.stipend=stipend;
		System.out.println("Parameterized constructor of InternshipStudent class");
	}

	public int getStipend() {
		return stipend;
	}

	public void setStipend(int stipend) {
		this.stipend = stipend;
	}

}
