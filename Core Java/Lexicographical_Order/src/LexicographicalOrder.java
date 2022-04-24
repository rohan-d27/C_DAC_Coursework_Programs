
public class LexicographicalOrder {

	public static void main(String[] args) {
		String[] name = { "John", "Remo", "Mixy", "Julie", "Ronny" };
		int n = 5;
		System.out.println("Before Sorting");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i]);
		}
		for (int i = 0; i < n - 1; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (name[i].compareTo(name[j]) > 0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		System.out.println("\nAfter performing lexicographical order: ");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i]);
		}
	}

}
