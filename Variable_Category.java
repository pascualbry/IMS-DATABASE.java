package Database;

import java.sql.*;

public class Variable_Category {

	private String tag;
	private String category;
	private String dateReceive;
	private String status;
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDateReceive() {
		return dateReceive;
	}
	public void setDateReceive(String dateReceive) {
		this.dateReceive = dateReceive;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
