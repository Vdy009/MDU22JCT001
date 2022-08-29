package Entitiy;

public class StatusEntity {
	
	String reqQty;
	String reqDate;
	String status;
	String storeNo;
	String productId;
	
	
	
	
	

	public StatusEntity(String reqQty, String reqDate, String status, String storeNo, String productId) {
		super();
		this.reqQty = reqQty;
		this.reqDate = reqDate;
		this.status = status;
		this.storeNo = storeNo;
		this.productId = productId;
	}

	/**
	 * @return the reqQty
	 */
	public String getReqQty() {
		return reqQty;
	}

	/**
	 * @param reqQty the reqQty to set
	 */
	public void setReqQty(String reqQty) {
		this.reqQty = reqQty;
	}

	/**
	 * @return the storeNo
	 */
	public String getStoreNo() {
		return storeNo;
	}

	/**
	 * @param storeNo the storeNo to set
	 */
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param reqDate the reqDate to set
	 */
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	@Override
	public String toString() {
		return "StatusEntity [reqQty=" + reqQty + ", reqDate=" + reqDate + ", status=" + status + ", storeNo=" + storeNo
				+ ", productId=" + productId + "]";
	}

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}



	

}
