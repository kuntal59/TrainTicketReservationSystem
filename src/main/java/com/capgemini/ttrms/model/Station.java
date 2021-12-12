package com.capgemini.ttrms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Station {
	@Id
	@GeneratedValue
	private int stationId;
	private String stationName; 
	private int trainNo;
	private String arrivalTime;
	private String hault;
	public Station() {
		super();
	}
	public Station(int stationId, String stationName, int trainNo, String arrivalTime, String hault) {
		super();
		this.stationId = stationId;
		this.stationName = stationName;
		this.trainNo = trainNo;
		this.arrivalTime = arrivalTime;
		this.hault = hault;
	}
	public int getStationId() {
		return stationId;
	}
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getHault() {
		return hault;
	}
	public void setHault(String hault) {
		this.hault = hault;
	}

	
	
}
