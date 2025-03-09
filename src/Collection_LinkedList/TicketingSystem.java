package Collection_LinkedList;

import java.util.Comparator;
import java.util.LinkedList;

public class TicketingSystem {
	 private LinkedList<SupportTicket> ticketQueue;

	    public TicketingSystem() {
	        this.ticketQueue = new LinkedList<>();
	    }

	    // Add a new support ticket
	    public void addTicket(SupportTicket ticket) {
	        ticketQueue.add(ticket);
	        System.out.println("Added new ticket: " + ticket);
	    }

	    // Peek at the next ticket to be processed
	    public void peekNextTicket() {
	        if (!ticketQueue.isEmpty()) {
	            System.out.println("Next Ticket: " + ticketQueue.peek());
	        } else {
	            System.out.println("No tickets available.");
	        }
	    }

	    // Process (remove) the highest-priority ticket
	    public void processNextTicket() {
	        if (!ticketQueue.isEmpty()) {
	            SupportTicket processedTicket = ticketQueue.poll();
	            System.out.println("Processing ticket: " + processedTicket);
	        } else {
	            System.out.println("No tickets to process.");
	        }
	    }

	    // View all pending tickets
	    public void viewAllTickets() {
	        if (ticketQueue.isEmpty()) {
	            System.out.println("No pending tickets.");
	        } else {
	            System.out.println("Pending Tickets:");
	            for (SupportTicket ticket : ticketQueue) {
	                System.out.println(ticket);
	            }
	        }
	    }

	    // Sort tickets by priority (lower number = higher priority)
	    public void sortTicketsByPriority() {
	        ticketQueue.sort(Comparator.comparingInt(SupportTicket::getPriority));
	        System.out.println("Tickets sorted by priority.");
	    }
}
