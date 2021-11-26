package streams;
import java.util.Scanner;
public class UserColourTreeset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pallete p = new Pallete();
		while (true) {
			System.out.println("******** MENU ********** ");
			System.out.println("1.Add colour "
					+ "\n2.Show Colours of Palette\""
					+ "n3.Remove Colour from Palette"
					+ "\n4.Is Colour present in Palette"
					+ "\n5.Quit");
			System.out.println("Enter your choice");
			int key = sc.nextInt();

			if (key == 5) {
				break;
			}
			switch (key) {

			case 1:
				System.out.println("Enter the colour to add:");
				p.addToPalet(sc.next());
				break;

			case 2:
				System.out.println("Colours of Palette");
				p.showAllColorsInPallete();
				break;

			case 3:
				System.out.println("Enter the colour to remove from Palette:");
				p.removeFromPalette(sc.next());
				break;

			case 4:
				System.out.println("Enter the colour to check is colour present in Palette:");
				if (p.isColourInPalette(sc.next())) {
					System.out.println("Colour is present in treeSet");
				} else {
					System.out.println("Colour is Not present in treeSet");
				}
			}
		}
sc.close();
	}
}
