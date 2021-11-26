package testWrapperClass;

public class TestWrapperClass2 {
	public static void main(String[] args) {
		String s1 = "12.56";
		String s2 = "13.1";
		double sum = Double.parseDouble(s1) + Double.parseDouble(s2); 
		System.out.println(sum);


		boolean ans = Character.isDigit('1');
		boolean ans1 = Character.isLetter('a');
		boolean ans2 = Character.isUpperCase('A');
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
	}

}
