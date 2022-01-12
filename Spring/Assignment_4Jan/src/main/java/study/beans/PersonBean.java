package study.beans;

public class PersonBean {
	private String name;
	private AddressBean address;
	private CardsBean cards;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	public CardsBean getCards() {
		return cards;
	}
	public void setCards(CardsBean cards) {
		this.cards = cards;
	}
	

}
