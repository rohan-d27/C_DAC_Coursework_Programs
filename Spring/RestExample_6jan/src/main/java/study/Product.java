package study;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	
	@XmlElement
	private String productName,prodDesc;
	
	@XmlElement  double unitCost;
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", prodDesc=" + prodDesc + ", unitCost=" + unitCost + "]";
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public Product(String productName, String prodDesc, double unitCost) {
		super();
		this.productName = productName;
		this.prodDesc = prodDesc;
		this.unitCost = unitCost;
	}
	
	

}
