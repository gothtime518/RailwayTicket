package com.mercury.beans;

public class Orders {
	private int orderNo;
	private int usersNo;
	private String orderDate;
	private int cardId;
	private int status;
	private int totalPrice;
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getUsersNo() {
		return usersNo;
	}
	public void setUsersNo(int usersNo) {
		this.usersNo = usersNo;
	}
	public String getorderDate() {
		return orderDate;
	}
	public void setorderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Orders(int orderNo, int usersNo, String orderDate, int cardId, int status, int totalPrice) {
		this.orderNo = orderNo;
		this.usersNo = usersNo;
		this.orderDate = orderDate;
		this.cardId = cardId;
		this.status = status;
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "orders:[ orderNo = " + orderNo + ", usersNo = " + usersNo + ", orderNo = " + orderNo +
				", cardId= " + cardId + ", status =" + status + ", totalPrice = " + totalPrice + "]";
	}

}
