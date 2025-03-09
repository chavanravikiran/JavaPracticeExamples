package Collection_LinkedList;

public class SupportTicket {
	private int id;
    private String customerName;
    private String issue;
    private int priority; // Lower number = Higher priority

    public SupportTicket(int id, String customerName, String issue, int priority) {
        this.id = id;
        this.customerName = customerName;
        this.issue = issue;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Customer: " + customerName + ", Issue: " + issue + ", Priority: " + priority;
    }
}
