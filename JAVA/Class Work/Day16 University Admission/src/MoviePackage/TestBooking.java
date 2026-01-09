package MoviePackage;

import java.util.Scanner;

public class TestBooking {

	public static void main(String [] a) {
		
		Scanner sc = new Scanner (System.in);
		
		MovieBooking MB = new MovieBooking();
		
		System.out.println("=== Welcome to Bollywood Ticket Booking System ===");
		
		while(MovieBooking.getRemainingTickets() > 0) {
			
			MB.displayMovie();
			
			System.out.println("Enter Movie Choice :");
			int movieChoice =  sc.nextInt();
			
			System.out.println("Enter number of tickets : ");
			int tickets = sc.nextInt();
			
			
			try
			{
				MB.bookTickets(movieChoice, tickets);
				
			}
			catch(InvalidMovieSelectionException e) {
				System.out.println(e);
			}
			catch(InvalidTicketNumberException e) {
				System.out.println(e);
			}
			catch(TicketsSoldOutException e) {
				System.out.println(e);
			}
			
			
			
		}
	}
}
