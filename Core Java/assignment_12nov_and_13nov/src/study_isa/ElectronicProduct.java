package study_isa;

import inheritance.Date;

public class ElectronicProduct extends Product {
     private float warrantyPeriod;
     private String specifications;
	
     
     public ElectronicProduct() {
		
	}


	public ElectronicProduct(String name, Date date_of_mfg, int price,float warrantyPeriod, String specifications) {
		super(name,date_of_mfg,price);
		this.warrantyPeriod = warrantyPeriod;
		this.specifications = specifications;
	}


	public float getWarrantyPeriod() {
		return warrantyPeriod;
	}


	public void setWarrantyPeriod(float warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}


	public String getSpecifications() {
		return specifications;
	}


	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String showEProdInfo() {
		return "ElectronicProduct Name: "+this.getName()+"\nDate_of_mfg: "+this.getDate_of_mfg()+"\nPrice: "+this.getPrice()+"\nWarranty Period: " + warrantyPeriod +" years"+ "\nSpecifications: " + specifications + "\n";
	}
     
     
     
}
