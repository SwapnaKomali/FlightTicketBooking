package com.kingflyer.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.Exception.ResourceNotFoundException;
import com.kingflyer.Model.Flight;
import com.kingflyer.Service.FlightService;


@RestController

@RequestMapping("/flight")
public class FlightController {

	
	@Autowired

	private FlightService flightservice;

	@PostMapping("/addFlightdetails")
	public ResponseEntity<Flight> addFlight(@Validated@RequestBody Flight e) {
	System.out.println(e);
	Flight s = flightservice.addFlightdetails(e);

	return new ResponseEntity<Flight>(s, HttpStatus.OK);
	}
	
	/*public FlightService getFlightservice() {
	return flightservice;
}

public void setFlightservice(FlightService flightservice) {
	this.flightservice = flightservice;
}*/
	
	
	@PutMapping("/UpdateFlightById")
	public ResponseEntity<String> updateFlightById(@Validated @RequestBody Flight f)
	{
		String status = null;
		Optional<Flight> obj = flightservice.findById(f.getId());
		
		if(obj.isPresent()) {
			flightservice.updateFlightById(f);
			status = "Successfully Updated";
		}
		/*
		 * else { status = "Invalid Id"; }
		 */
		
		else {
			throw new ResourceNotFoundException("Given id it's not available in db..");
			}
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
}
