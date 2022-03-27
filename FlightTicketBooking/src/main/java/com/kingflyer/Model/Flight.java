package com.kingflyer.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Flight")
public class Flight {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String departureLocation;
	private String arrivalLocation;

	

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	
	

	public Flight(int id, String departureLocation, String arrivalLocation) {
		super();
		this.id = id;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
	}



	private int fleetId;
	private int remainingEconomySeats;
	private int remainingBusinessSeats;
	private int remainingPremiumSeats;
	private Date departureTime;
	private Date arrivalTime;
	@Temporal(TemporalType.DATE)
	private Date travelDate;
	private int fareId;

	@OneToOne(mappedBy = "Flight")
	public int getId() {
		return id;
	}
           
	
	public int getFleetId() {
		return fleetId;
	}

	public void setFleetId(int fleetId) {
		this.fleetId = fleetId;
	}

	public int getRemainingEconomySeats() {
		return remainingEconomySeats;
	}

	public void setRemainingEconomySeats(int remainingEconomySeats) {
		this.remainingEconomySeats = remainingEconomySeats;
	}

	public int getRemainingBusinessSeats() {
		return remainingBusinessSeats;
	}

	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
		this.remainingBusinessSeats = remainingBusinessSeats;
	}

	public int getRemainingPremiumSeats() {
		return remainingPremiumSeats;
	}

	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
		this.remainingPremiumSeats = remainingPremiumSeats;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public int getFareId() {
		return fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation
				+ ", fleetId=" + fleetId + ", remainingEconomySeats=" + remainingEconomySeats
				+ ", remainingBusinessSeats=" + remainingBusinessSeats + ", remainingPremiumSeats="
				+ remainingPremiumSeats + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", travelDate=" + travelDate + ", fareId=" + fareId + "]";
	}

	

	

	public Flight(int i) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int i, String string, String string2, String string3, String string4, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	
}
