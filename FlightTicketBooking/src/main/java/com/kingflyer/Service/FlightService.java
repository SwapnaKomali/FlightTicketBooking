package com.kingflyer.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.Model.Flight;
import com.kingflyer.Repository.FlightRepo;

@Service
@Transactional
public class FlightService {

	@Autowired
	FlightRepo repo;

	public Flight addFlightdetails(Flight e) {
		// TODO Auto-generated method stub
		Flight f = repo.save(e);
		return f;
	}

	
	  public Optional<Flight> findById(int flightId) { return
	  repo.findById(flightId); }
	 

	public void updateFlightById(Flight f) {
		repo.save(f);
	}

	
	/*
	 * public Object addFlight(Flight flight) { // TODO Auto-generated method stub
	 * return null; }
	 */
	/**
	 * public List<Flight> getAllFlights(int flightId) {
	 * 
	 * return (List<Flight>) flightrepo.findAll(); }
	 */
		

}
