package study.collections;

public class UserPallete {
		
	public static void main(String[] args) {
		Pallete pallete=new Pallete();
		pallete.addToPallete("Red");
		pallete.addToPallete("Pink");
		pallete.addToPallete("Blue");
		pallete.addToPallete("Green");
		System.out.println("Pallete:");
		pallete.showAllColorsPallete();
		System.out.println("\nAfter removing from Pallete:");
		pallete.removefromPallete("Blue");
		pallete.showAllColorsPallete();
		
		if(pallete.isColorinPalllete("Green"))
			System.out.println("\ncolor is present in pallete");
		else
		{	System.out.println("\ncolor is not present in palletee");
	}
		pallete.removeAllColors();
		System.out.println("\nAfter removing all from Pallete:");
		pallete.showAllColorsPallete();
		
		
	}//end of main
}//end of user
