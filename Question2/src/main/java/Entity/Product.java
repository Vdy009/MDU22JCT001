package Entity;

import java.sql.Date;

public class Product {
	
	
	 private String id;
	 private Date updateTimeStamp;
	 private double quantity;
	 
	 
	 
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getUpdateTimeStamp() {
		return updateTimeStamp;
	}
	public void setUpdateTimeStamp(Date updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
	public Product(String id, Date updateTimeStamp, double quantity) {
		super();
		this.id = id;
		this.updateTimeStamp = updateTimeStamp;
		this.quantity = quantity;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", updateTimeStamp=" + updateTimeStamp + ", quantity=" + quantity + "]";
	}
	 
	 
	
	

}
