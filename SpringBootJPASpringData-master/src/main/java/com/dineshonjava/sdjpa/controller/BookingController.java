/**
 * 
 */
package com.dineshonjava.sdjpa.controller;

import java.io.IOException;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dineshonjava.sdjpa.models.Booking;
import com.dineshonjava.sdjpa.models.BookingRepository;



/**
 * @author Dinesh.Rajput
 *
 */
@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	BookingRepository bookingRepository;

	/**
	 * GET /create --> Create a new booking and save it in the database.
	 */
	// http://localhost:8181/booking/create?psngrName=Arnav&destination=USA&departure=Delhi

	/*public static void serializetoXml() throws JsonGenerationException, JsonMappingException, IOException {

		try {
			XmlMapper mapper = new XmlMapper();
			String data = mapper.writeValueAsString(new Mobile("Moto", 10000, "32GB"));

			//https://howtodoinjava.com/jaxb/read-xml-to-java-object/
			String xmlcontent = data.toString();
			
			System.out.println( xmlcontent );
			
		}

		catch (JsonProcessingException e) {
			System.out.println(e);
		}

	}*/
	
	@RequestMapping("/create")
	public Booking create(Booking booking) {
		booking.setTravelDate(new Date());
		booking = bookingRepository.save(booking);
		return booking;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * GET /read --> Read a booking by booking id from the database.
	 */

	// http://localhost:8181/booking/read?bookingId=1
	@RequestMapping("/read")
	public Booking read(@RequestParam Long bookingId) {
		Booking booking = bookingRepository.findOne(bookingId);
		return booking;
	}

	/**
	 * GET /update --> Update a booking record and save it in the database.
	 */
	// http://localhost:8181/booking/update?bookingId=5&psngrName=Suresh
	@RequestMapping("/update")
	public Booking update(@RequestParam Long bookingId, @RequestParam String psngrName) {
		Booking booking = bookingRepository.findOne(bookingId);
		booking.setPsngrName(psngrName);
		booking = bookingRepository.save(booking);
		return booking;
	}

	/**
	 * GET /delete --> Delete a booking from the database.
	 */

	// http://localhost:8181/booking/delete?bookingId=5
	@RequestMapping("/delete")
	public String delete(@RequestParam Long bookingId) {
		bookingRepository.delete(bookingId);
		return "booking #" + bookingId + " deleted successfully";
	}
}
