package study_isa;

import inheritance.Date;

public class Product {
  private String name;
  private Date date_of_mfg;
  private int price;

  
  public Product() {
	
}


public Product(String name, Date date_of_mfg, int price) {
	this.name = name;
	this.date_of_mfg = date_of_mfg;
	this.price = price;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Date getDate_of_mfg() {
	return date_of_mfg;
}


public void setDate_of_mfg(Date date_of_mfg) {
	this.date_of_mfg = date_of_mfg;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}
  
 public  String showProductInfo()
 {
	 return "Product Name: " + name + "\nDate_of_mfg:" + date_of_mfg + "\nPrice: " + price + "\n"; 
 }

}
