package com.mercury.beans;

public class Train {
	private int trainNo;
	private int qty;
	private boolean enable;
	
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
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
	
	public Train(int trainNo, int qty, boolean enable) {
		this.trainNo = trainNo;
		this.qty = qty;
		this.enable = enable;
	}
	
	@Override
	public String toString() {
		return "Train:[trainNo =" + trainNo + ", qty = " + qty + ", enable = " + enable + "]";
	}

}
