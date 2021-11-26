import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter 2 numbers:");
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		Number number1 = new Number(n1);
		Number number2 = new Number(n2);
		
		Number result = MathOperations.addition(number1, number2);
		System.out.println("Addition: " + result);
		
		result = MathOperations.sub(number1, number2);
		System.out.println("Sub: " + result);
		
	}
}

