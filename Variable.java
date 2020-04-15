package Database;

import java.sql.*;

public class Variable {

	private int productTag;
	private String serialNumber;
	private String brand;
	private String productModel;
	private String productDescription;
	private String dateReceive;
	private Timestamp receiveTime;
	
	public Timestamp getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(Timestamp receiveTime) {
		this.receiveTime = receiveTime;
	}
	public String getDateReceive() {
		return dateReceive;
	}
	public void setDateReceive(String dateReceive) {
		this.dateReceive = dateReceive;
	}
	public int getProductTag() {
		return productTag;
	}
	public void setProductTag(int productTag) {
		this.productTag = productTag;
	}	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
