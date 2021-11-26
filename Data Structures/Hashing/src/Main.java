import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What should be the size of HashTable?");
		int size = sc.nextInt();

		StringHash stringHash = new StringHash(size);

		for (int i = 0; i < size; i++) {
			System.out.println("Enter String:");
			String inputStr = sc.next();
			stringHash.insert(inputStr);
		}
		
		System.out.println("Input search string:");
		String inpuString = sc.next();
		stringHash.search(inpuString);
	}
}
