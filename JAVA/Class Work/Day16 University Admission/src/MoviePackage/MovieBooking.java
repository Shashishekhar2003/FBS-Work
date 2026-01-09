package MoviePackage;

public class MovieBooking {

	static int availableTickets=50;
	static final int ticketPrice=200;
	
	final String [] Movies= {"3 Idiots", "Dangal", "Bahubali 2: The Conclusion", 
	        "Kabir Singh", "Chhichhore", "Zindagi Na Milegi Dobara", 
	        "Tanhaji", "Uri: The Surgical Strike", "War", "Bajrangi Bhaijaan"} ;
	
	void displayMovie() {
		System.out.println("/*/*/*/*/*/* Movies /*/*/*/*/*");
		for(int i=0; i < Movies.length;i++) {
			System.out.println((i+1)+"."+Movies[i]);
		}
	}
	
	String getMovieName(int choice) throws InvalidMovieSelectionException {
		if(choice<1 || choice>Movies.length) {
			throw new InvalidMovieSelectionException();
		}
		return Movies[choice-1];
	}

	void validateTickets(int tickets) throws InvalidTicketNumberException , TicketsSoldOutException {
		if(tickets <= 0) {
			throw new InvalidTicketNumberException();
		}
		
		if(tickets > availableTickets) {
			throw new TicketsSoldOutException();
		}
	}
	
	void bookTickets(int movieChoice , int tickets) throws InvalidMovieSelectionException , InvalidTicketNumberException , TicketsSoldOutException  {
		
		String moviename = getMovieName(movieChoice);
		validateTickets(tickets);
		
		availableTickets=availableTickets-tickets;
		
		int amount = tickets * ticketPrice;
		
		    System.out.println("\n🎉 Booking Successful for \"" + moviename + "\"!");
	        System.out.println("Tickets booked: " + tickets);
	        System.out.println("Total amount: ₹" + amount);
	        System.out.println("Remaining tickets: " + availableTickets);
		
	}
	
	static int getRemainingTickets() {
		return availableTickets;
	}
}
