package com.mercury.beans;

public class Station {
	private int stationNo;
	private String stationName;
	private boolean enable;
	
	public int getStationNo() {
		return stationNo;
	}
	public void setStationNo(int stationNo) {
		this.stationNo = stationNo;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	public Station(int stationNo, String stationName, boolean enable) {
		this.stationNo = stationNo;
		this.stationName = stationName;
		this.enable = enable;
	}
	
	@Override
	public String toString() {
		return "Station:[stationNo =" + stationNo + ", stationName =" + stationName + ", enable =" +
				enable + "]";
	}

}
