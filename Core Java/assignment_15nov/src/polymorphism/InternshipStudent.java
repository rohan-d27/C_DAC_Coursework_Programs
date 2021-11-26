package polymorphism;

public class InternshipStudent extends Student {
	int stipend;

	public InternshipStudent() {
		//System.out.println("No Parameter constructor of InternshipStudent class");
	}

	public InternshipStudent(String n,Date d,int rn,int stipend) {
		super(n,d,rn);
		this.stipend=stipend;
		//System.out.println("Parameterized constructor of InternshipStudent class");
	}

	public int getStipend() {
		return stipend;
	}

	public void setStipend(int stipend) {
		this.stipend = stipend;
	}

	@Override
	public String toString() {
		return "InternshipStudent stipend=" + stipend + ", Rollno=" + getRollno() + ", Name=" + getName()
				+ "\n";
	}
	public boolean equals(Object obj)
	{
		InternshipStudent temp=(InternshipStudent)obj;
		if(this.getName().equals(temp.getName())&&this.getDob().equals(temp.getDob())&&this.getRollno()==temp.getRollno()&&this.getStipend()==temp.getStipend())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
