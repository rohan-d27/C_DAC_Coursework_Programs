
public class Main {

	public static void main(String[] args) {
		
		Stack s1 = new Stack();

		Student ram = new Student("Ram", 14);
		Student sham = new Student("Sham", 23);
		
		s1.push(ram);
		s1.push(sham);
		s1.push(ram);
		s1.push(ram);
		s1.push(ram);
		s1.push(sham);
		
		System.out.println(s1);
		
	}

}



