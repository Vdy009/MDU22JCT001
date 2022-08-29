package Entitiy;

import java.sql.Date;

public class AvailabilityEntity {
	//Availability(String storeNo , String productId,Double availQty, java.util.Date date,) 
	private String storeNo;
	private String productId;
	private Date date;
	private Double availQty;
	
	
	public AvailabilityEntity(String storeNo, String productId, java.util.Date date2, Double availQty) {
		super();
		this.storeNo = storeNo;
		this.productId = productId;
		this.date = date2;
		this.availQty = availQty;
	}


	


	public String getStoreNo() {
		return storeNo;
	}


	
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}


	
	public String getProductId() {
		return productId;
	}


	
	public void setProductId(String productId) {
		this.productId = productId;
	}


	public Date getDate() {
		return date;
	}


	
	public void setDate(Date date) {
		this.date = date;
	}


	public Double getAvailQty() {
		return availQty;
	}


	
	public void setAvailQty(Double availQty) {
		this.availQty = availQty;
	}



	@Override
	public String toString() {
		return "AvailabilityEntity [storeNo=" + storeNo + ", productId=" + productId + ", date=" + date + ", availQty="
				+ availQty + "]";
	}
	
	
	
	

}
