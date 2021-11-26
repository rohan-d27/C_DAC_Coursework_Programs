package interfaceclass;

public class Laptop implements Sellable {
	private String brand; 
	private int RAM;
	private int HDD; 
	private String CPU_type; 
	private int cost;
	private double discount;
	
	public Laptop() {
		
	}

	public Laptop(String brand, int rAM, int hDD, String cPU_type, int cost) {
		super();
		this.brand = brand;
		RAM = rAM;
		HDD = hDD;
		CPU_type = cPU_type;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getHDD() {
		return HDD;
	}

	public void setHDD(int hDD) {
		HDD = hDD;
	}

	public String getCPU_type() {
		return CPU_type;
	}

	public void setCPU_type(String cPU_type) {
		CPU_type = cPU_type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	
	public void setDiscount(double d) {
		 this.discount=d;
	
	}
	
	public double getSellingPrice() {
		
		double sp=this.getCost()-((this.getCost()/100)*this.getDiscount());
		return sp;
	}
	public double getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return "Laptop brand=" + brand + "\nRAM=" + RAM + "\nHDD=" + HDD + "\nCPU type=" + CPU_type + "\ncost=" + cost
				+ "";
	}

}
