package streams;

import java.util.Iterator;
import java.util.TreeSet;

public class Pallete {

	private TreeSet<String> colours;

	public Pallete() {

		colours = new TreeSet<String>();
	}

	public Pallete(TreeSet<String> colours) {

		this.colours = colours;
	}

	public TreeSet<String> getColours() {
		return colours;
	}

	public void setColors(TreeSet<String> colours) {
		this.colours = colours;
	}

	@Override
	public String toString() {
		return "Colour colours=" + colours + "";
	}

	public void addToPalet(String colors) {

		this.colours.add(colors.toLowerCase());

	}

	public void showAllColorsInPallete() {

		Iterator<String> it = this.colours.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public void removeFromPalette(String colour) {

		this.colours.remove(colour.toLowerCase());
	}

	public boolean isColourInPalette(String colour) {

		for (String str : this.colours) {

			if (colour.equalsIgnoreCase(str)) {
				return true;
			}

		}
		return false;

	}

}
