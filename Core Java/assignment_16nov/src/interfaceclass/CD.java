package interfaceclass;

public class CD implements Sellable {
	private String name;
	private String category;
	private int cost;
	private int duration;
	private String artist;
    private double discount;
	private double sellingPrice;
	
	
	public CD() {
		
	}
	
	public CD(String name, String category, int cost, int duration, String artist) {
		
		this.name = name;
		this.category = category;
		this.cost = cost;
		this.duration = duration;
		this.artist = artist;
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	
	public double getSellingPrice() 
	{
		double sp=this.cost-(this.cost/100)*this.getDiscount();
		return sp;
	}
	
	public void  setDiscount(double discount) {
		this.discount=discount;
		
	}
	
	public double getDiscount() {
		return discount;
	}

	
	
	@Override
	public String toString() {
		return "CD name=" + name + "\ncategory=" + category + "\ncost=" + cost + "\nduration=" + duration + "\nartist="
				+ artist + "";
	}
	
}
