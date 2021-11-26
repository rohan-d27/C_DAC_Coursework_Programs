package study.isa.user;

import inheritance.Date;
import study_isa.ElectronicProduct;
import study_isa.FoodProduct;
import study_isa.Product;

public class User_Q4 {
	public static void main(String[] args) {

		System.out.println("Using Parameterized constructor:\n");
		Product p1=new Product("Soap",new Date(1,11,2021),20);
		FoodProduct fp1=new FoodProduct("Lays Classic",new Date(23,9,2021),10,new Date(31,12,2021),"Potatoes, Vegetable Oil (Sunflower, Corn and/or Canola Oil), and Salt.");
		ElectronicProduct ep1=new ElectronicProduct("SmartTV",new Date(3,4,2021),20000,2.5f,"Screen Size:32 inch, FHD Display");

		System.out.println(p1.showProductInfo());
		System.out.println(fp1.showFoodProdInfo());
		System.out.println(ep1.showEProdInfo());



		System.out.println("Using No parameter constructor:\n");
		Product p=new Product();
		p.setName("Oil_Paint");
		p.setPrice(100);
		p.setDate_of_mfg(new Date(14,11,2021));

		//using no parameter constructor
		FoodProduct fp=new FoodProduct();
		fp.setName("DairyDelight");
		fp.setPrice(50);
		fp.setDate_of_mfg(new Date(15,11,2021));
		fp.setContents("Milk");
		fp.setDate_of_eXpiry(new Date(18,11,2021));

		//using no parameter constructor
		ElectronicProduct ep=new ElectronicProduct();
		ep.setName("Smartphone Charger");
		ep.setPrice(500);
		ep.setDate_of_mfg(new Date(14,11,2021));
		ep.setWarrantyPeriod(0.5f);
		ep.setSpecifications("Power Supply:220V-250V AC, Output Voltage:10V DC");

		System.out.println(p.showProductInfo());
		System.out.println(fp.showFoodProdInfo());
		System.out.println(ep.showEProdInfo());
	}
}
