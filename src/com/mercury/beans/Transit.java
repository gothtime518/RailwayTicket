package com.mercury.beans;

public class Transit {
	private int transitNo;
	private int trainNo;
	private int depatureStation;
	private int arrivalStation;
	private int price;
	private String time;
	
	public int getTransitNo() {
		return transitNo;
	}
	public void setTransitNo(int transitNo) {
		this.transitNo = transitNo;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public int getDepatureStation() {
		return depatureStation;
	}
	public void setDepatureStation(int depatureStation) {
		this.depatureStation = depatureStation;
	}
	public int getArrivalStation() {
		return arrivalStation;
	}
	public void setArrivalStation(int arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public Transit(int transitNo, int trainNo, int depatureStation, int arrivalStation, int price, String time) {
		this.transitNo = transitNo;
		this.trainNo = trainNo;
		this.depatureStation = depatureStation;
		this.arrivalStation = arrivalStation;
		this.price = price;
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Transit:[transitNo = " + transitNo + ",trainNo = " + trainNo + ",depatureStation = " +
				",arrivalStation = " + arrivalStation + ", price = " + price + ", time = " + time + "]";
	}

}
