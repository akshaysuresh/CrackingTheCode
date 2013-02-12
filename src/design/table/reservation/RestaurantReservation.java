package design.table.reservation;

public class RestaurantReservation {

	//Only online bookings
	// Table - Id, capacity, isBooked, int[] -- different time slots
	// Basically take request from person..if odd number add 1 to make it even and look for a table with that many seats and appropriate time.
	
	//Probably hashmap key is number of seats - value is all tables that have those many seats..iterate through all of those and find the one that
	//matches the requested time slot
	
}
