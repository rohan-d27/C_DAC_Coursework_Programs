package abstractclass.user;

import abstractclass.Dress;
import abstractclass.Product;
import abstractclass.Toy;

public class Shop {

	public static void main(String[] args) {
		
		Product[] shopping = new Product[3];
		shopping[0] = new Toy("Car", "battery", 100);
		shopping[1] = new Toy("Ball" ,"non-battery" ,100);
		shopping[2] = new Dress("Shirt","blue","L", 500);
		

		showBill(shopping);
	}

	private static void showBill(Product[] shopping) {
		int totalcost =0;
		
		System.out.println("***Your bill***** ");
		for (int i = 0; i < shopping.length; i++) {
			totalcost=totalcost+shopping[i].getFinalCost(); 
			System.out.println(shopping[i]);
			
		}
		System.out.println("**************");
		System.out.println("Total Cost : "+totalcost);
	}

	

}
