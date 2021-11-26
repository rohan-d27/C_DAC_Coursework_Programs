package implementsclass.user;

import java.util.Scanner;

import interfaceclass.CD;
import interfaceclass.Laptop;

public class User {

	public static void main(String[] args) {
		System.out.println("Enter Discount to give:");
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		CD cd1=new CD("Album1","Music",100,1,"Lata Mangeshkar");
		System.out.println(cd1);
		cd1.setDiscount(d);
		System.out.println("Selling price: "+cd1.getSellingPrice()+"\n");
		CD cd2=new CD("Sholay","Video",200,3,"Dharmendra,Sanjeev Kumar,Hema Malini,Amitabh Bachchan,Jaya Bhaduri,Iftekhar,Amjad Khan ");
		System.out.println(cd2);
		cd2.setDiscount(d);
		System.out.println("Selling price: "+cd2.getSellingPrice()+"\n");
		Laptop lp1=new Laptop("HP",8,500,"Quad Core",50000);
		System.out.println(lp1);
		lp1.setDiscount(d);
		System.out.println("Selling price: "+lp1.getSellingPrice()+"\n");
		Laptop lp2=new Laptop("Dell",8,256,"Dual Core",40000);
		System.out.println(lp2);
		lp2.setDiscount(d);
		System.out.println("Selling price: "+lp2.getSellingPrice()+"\n");
	}

}
