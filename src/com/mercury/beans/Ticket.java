package com.mercury.beans;

public class Ticket {
	private int ticketNo;
	private int orderNo;
	private int transitNo;
	private String ticketDate;
	private String time;
	private int qty;
	private boolean enable;
	
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getTransitNo() {
		return transitNo;
	}
	public void setTransitNo(int transitNo) {
		this.transitNo = transitNo;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	public Ticket(int ticketNo, int orderNo, int transitNo, String ticketDate, String time, int qty, boolean enable){
		this.ticketNo = ticketNo;
		this.orderNo = orderNo;
		this.transitNo = transitNo;
		this.ticketDate = ticketDate;
		this.time = time;
		this.qty = qty;
		this.enable = enable;
	}
	
	@Override
	public String toString() {
		return "Ticket:[ ticketNo = " + ticketNo + ", orderNo = " + orderNo + ", transitNo = " + transitNo +
				", ticketDate = " + ticketDate + ", time = "+ time + ", qty = " + qty +
				", enable = " + enable + "]";
	}

}
