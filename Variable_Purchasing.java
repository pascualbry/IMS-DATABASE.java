package Database;

import java.sql.Timestamp;

public class Variable_Purchasing {
	
	private int tag;
	private Timestamp receiveTime;
	private String clientName;
	private String contactNumber;
	private String location;
	private int total;
	private int finalTotal;
	private String dateReceive;
	private String newPrice;
	
	public String getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(String newPrice) {
		this.newPrice = newPrice;
	}
	public String getDateReceive() {
		return dateReceive;
	}
	public void setDateReceive(String dateReceive) {
		this.dateReceive = dateReceive;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public Timestamp getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(Timestamp receiveTime) {
		this.receiveTime = receiveTime;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getFinalTotal() {
		return finalTotal;
	}
	public void setFinalTotal(int finalTotal) {
		this.finalTotal = finalTotal;
	}

}
