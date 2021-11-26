package study_isa;

import inheritance.Date;

public class FoodProduct extends Product {
    private Date date_of_eXpiry;
    private String contents;
	
    public FoodProduct() {
		
	}

	public FoodProduct(String name, Date date_of_mfg, int price,Date date_of_eXpiry, String contents) {
		super(name,date_of_mfg,price);
		this.date_of_eXpiry = date_of_eXpiry;
		this.contents = contents;
	}

	public Date getDate_of_eXpiry() {
		return date_of_eXpiry;
	}

	public void setDate_of_eXpiry(Date date_of_eXpiry) {
		this.date_of_eXpiry = date_of_eXpiry;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	
	public String showFoodProdInfo() {
		return "FoodProduct Name: " + this.getName() + "\nDate_of_mfg: " + this.getDate_of_mfg() + "\nPrice: " + this.getPrice() + "\nDate_of_Expiry: " + date_of_eXpiry + "\nContents: " + contents + "\n";
	}

	
    
    
	
}
