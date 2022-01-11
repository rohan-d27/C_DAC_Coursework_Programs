package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "products2")
public class ProductEntity {
	@Id
	@Column(name = "product_id")
	private int product_id;

	@Column(name="product_name")
	private String product_name;

	@Column(name="product_desc")
	private String product_desc;

	@Column(name = "product_unit")
	private int product_unit;

	@Column(name = "product_cost")
	private int product_cost;

	@Column(name = "product_expiryDate")
	private String product_expiryDate;

	public ProductEntity(int product_id, String product_name, String product_desc, int product_unit, int product_cost,
			String product_expiryDate) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_desc = product_desc;
		this.product_unit = product_unit;
		this.product_cost = product_cost;
		this.product_expiryDate = product_expiryDate;
	}

	public ProductEntity() {
		super();
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public int getProduct_unit() {
		return product_unit;
	}

	public void setProduct_unit(int product_unit) {
		this.product_unit = product_unit;
	}

	public int getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(int product_cost) {
		this.product_cost = product_cost;
	}

	public String getProduct_expiryDate() {
		return product_expiryDate;
	}

	public void setProduct_expiryDate(String product_expiryDate) {
		this.product_expiryDate = product_expiryDate;
	}

	@Override
	public String toString() {
		return "ProductEntity product_id=" + product_id + ", product_name=" + product_name + ", product_desc="
				+ product_desc + ", product_unit=" + product_unit + ", product_cost=" + product_cost
				+ ", product_expiryDate=" + product_expiryDate + "\n";
	}

}
