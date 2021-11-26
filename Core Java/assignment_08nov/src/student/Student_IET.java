package student;

public class Student_IET {
	private  String firstName;
	private  String lastName;	
	private  int age;
	private  int graduationYear;
	private  String graduationStream;


	public Student_IET() {

	}

	public Student_IET(String firstName, String lastName, int age, int graduationYear, String graduationStream) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.graduationYear = graduationYear;
		this.graduationStream = graduationStream;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(!firstName.trim().equals(""))
		{
			this.firstName = firstName;
			
		}
		else
		{
			System.out.println("First name Can not be blank!!!");
			
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(!lastName.trim().equals(""))
		{
			this.lastName = lastName;
		}
		else
		{
			System.out.println("Last name Can not be blank!!!");
			
			
		}
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0&&age<=80)
		{
			this.age = age;
		}
		else
		{
			System.out.println("Your age is either less than 18 or greater than 80!!");
		}
		
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		if(graduationYear>=2017 && graduationYear<=2021)
		{
			this.graduationYear = graduationYear;
		}
		else
		{
			System.out.println("Graduation Year must be between 2017 to 2021!!!");
		}
		
		
	}

	public String getGraduationStream() {
		return graduationStream;
	}

	public void setGraduationStream(String graduationStream) {
		if(graduationStream.equals("Computer") || graduationStream.equals("IT") || graduationStream.equals("Electrical")|| graduationStream.equals("Electronics"))
		{
			this.graduationStream = graduationStream;
		}
		else
		{
			System.out.println("Only IT/EE Streams allowed!!");
		}
		
	}

	
	public String toString() {
		return "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nGraduation Year: "
				+ graduationYear + "\nGraduation Stream: " + graduationStream + "";
	}




}
