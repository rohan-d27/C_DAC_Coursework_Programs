package tryout;

public class Main {

	public static void main(String[] args) {
		//String s = "hello";
		//String s1 = s.concat("world");
		StringBuffer s = new StringBuffer("hello");
		StringBuffer s1 = s.append("world");

		if(s==s1)
			System.out.println("they are same");
		else
			System.out.println("they are different");



	}

}
