package abstractclass;

public class Toy extends Product {
   private String name;
   private String  category;
   
   
   public Toy() {
	
}


private int price;

   
    public Toy(String name, String category, int price) {
	this.name = name;
	this.category = category;
	this.price = price;
}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	
	public int getFinalCost() {
		int fc=this.price-(this.price/100)*this.getDisc();
		return fc;
	}


	
	public int getDisc() {
		int disc=10;
		if(this.getPrice()>=500)
		{
			return disc;
		}
		else
		{
			return 0;
		}
	}
   
	public String toString() {
		return "Toy Name=" + name + ", Category=" + category + ", Price=" + price + ", Discount="+this.getDisc()+", Final Price="+this.getFinalCost()+"\n";
	}

	
}
