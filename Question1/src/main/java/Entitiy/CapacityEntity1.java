package Entitiy;

import java.sql.Date;

public class CapacityEntity1 {
	
	private String storeNo;
	private Date date;
	private Double noOfOrdersAccepted;
	
	
	public CapacityEntity1(String storeNo, Date date, Double noOfOrdersAccepted) {
		super();
		this.storeNo = storeNo;
		this.date = date;
		this.noOfOrdersAccepted = noOfOrdersAccepted;
	}


	
	public CapacityEntity1(String string, String string2, java.util.Date parse, double d) {
		// TODO Auto-generated constructor stub
	}



	public void CapacityEntity(String string, String string2, java.util.Date parse, double d) {
		// TODO Auto-generated constructor stub
	}



	public String getStoreNo() {
		return storeNo;
	}


	
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}


	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	
	public Double getNoOfOrdersAccepted() {
		return noOfOrdersAccepted;
	}


	
	public void setNoOfOrdersAccepted(Double noOfOrdersAccepted) {
		this.noOfOrdersAccepted = noOfOrdersAccepted;
	}
	
	
	
}
