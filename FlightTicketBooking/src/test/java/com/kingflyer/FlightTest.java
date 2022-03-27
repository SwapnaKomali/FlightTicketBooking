package com.kingflyer;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.kingflyer.Model.Flight;
import com.kingflyer.Repository.FlightRepo;
import com.kingflyer.Service.FlightService;

/*@RunWith(SpringRunner.class)*/
@SpringBootTest
public class FlightTest {

	@MockBean
	private FlightRepo repository;
	@Autowired
	private FlightService service;
	
	
	@Test
	public void saveFlight() {
		Flight flight = new Flight(123, "Bangolore", "chennai");
		when(repository.save(flight)).thenReturn(flight);
		assertEquals(flight, service.addFlightdetails(flight));
	}
   
	
	
}
