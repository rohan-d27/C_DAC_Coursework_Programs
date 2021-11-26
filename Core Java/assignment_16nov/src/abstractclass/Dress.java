package abstractclass;

public class Dress extends Product {
	   private String name;
	   private String  material;
	   private String size;
	   private int price;
	
	   
	public Dress(String name, String material, String size, int price) {
		this.name = name;
		this.material = material;
		this.size = size;
		this.price = price;
	}
	
	
	
	public Dress() {
		
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
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
		return "Dress name=" + name + ", material=" + material + ", size=" + size + ", price=" + price +", Discount="+this.getDisc()+", Final Price="+this.getFinalCost()+ "\n";
	}
	   
	   
	   
}
