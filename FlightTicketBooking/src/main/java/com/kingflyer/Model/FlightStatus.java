package com.kingflyer.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;






@Entity
@Table(name = "Status")
public class FlightStatus {

	@Id
	private int status_id;
	private int remainingEconomySeats;
	private int remainingPremiumSeats;
	private int remainingBusinessSeats;

	@OneToOne
	@JoinColumn(name="id")

	private Flight flight;


	public Flight getFlight() {
	return flight;
	}
	public void setFlight(Flight flight) {
	this.flight = flight;
	}

	public int getStatus_id() {
	return status_id;
	}
	public void setStatus_id(int status_id) {
	this.status_id = status_id;
	}
	public int getRemainingEconomySeats() {
	return remainingEconomySeats;
	}
	public void setRemainingEconomySeats(int remainingEconomySeats) {
	this.remainingEconomySeats = remainingEconomySeats;
	}
	public int getRemainingPremiumSeats() {
	return remainingPremiumSeats;
	}
	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
	this.remainingPremiumSeats = remainingPremiumSeats;
	}
	public int getRemainingBusinessSeats() {
	return remainingBusinessSeats;
	}
	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
	this.remainingBusinessSeats = remainingBusinessSeats;
	}



}
