package Collection_LinkedList;

public class LinkedListCustomerSupportAppEx {
	 public static void main(String[] args) {
	       
		 	TicketingSystem system = new TicketingSystem();

	        // Adding sample tickets
	        system.addTicket(new SupportTicket(101, "Alice", "Cannot log in", 2));
	        system.addTicket(new SupportTicket(102, "Bob", "Payment issue", 1));
	        system.addTicket(new SupportTicket(103, "Charlie", "App crash on startup", 3));

	        // Viewing all tickets
	        system.viewAllTickets();

	        // Sorting tickets by priority
	        system.sortTicketsByPriority();
	        system.viewAllTickets();

	        // Checking next ticket without removing
	        system.peekNextTicket();

	        // Processing a ticket
	        system.processNextTicket();
	        system.viewAllTickets();
	    }
}

