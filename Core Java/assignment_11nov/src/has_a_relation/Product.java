package has_a_relation;

import java.util.Scanner;

public class Product {
  private String productname;
  private String description;
  private int price;
  private Date  expdate;

  
  public Product() {
	
}


public Product(String productname, String description, int price, Date expdate) {
	super();
	this.productname = productname;
	this.description = description;
	this.price = price;
	this.expdate = expdate;
}


public String getProductname() {
	return productname;
}


public void setProductname(String productname) {
	this.productname = productname;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public Date getExpdate() {
	return expdate;
}


public void setExpdate(Date expdate) {
	this.expdate = expdate;
}


public void populate_product()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter productname:");
	String str=sc.next();
	this.setProductname(str);
	System.out.println("Enter product description:");
	String str1=sc.next();
	this.setDescription(str1);
	System.out.println("Enter product price:");
	int r=sc.nextInt();
	this.setPrice(r);
	Date e=new Date();
	System.out.println("Enter ExpiryDate:");
	System.out.println("Enter Date:");
	int d=sc.nextInt();
	e.setDate(d);
	System.out.println("Enter Month:");
	int m=sc.nextInt();
	e.setMonth(m);
	System.out.println("Enter Year:");
	int y=sc.nextInt();
	e.setYear(y);
	this.setExpdate(e);
}
public String toString() {
	return "Product ProductName: " + productname + ", Description: " + description + ", Price: " + price + "Expiry Date"
			+ expdate ;
}
  

  
  
  
}
