package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="product4")
public class ProductEntity {
	@Id
	@Column
	private int id;
	@Column
	private int cost;
	@Column
	private String name;
	@Column
	private String information;
	
	public ProductEntity() {
		super();
		
	}

	

	public ProductEntity(int id, int cost, String name, String information) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.information = information;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", cost=" + cost + ", name=" + name + ", information=" + information + "]";
	}
	
}
