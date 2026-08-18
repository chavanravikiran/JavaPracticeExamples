package Java17Features;

public class BeforeRecords {
	
	private final int id;
	private final String name;
	
	public BeforeRecords(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeforeRecords [id=" + id + ", name=" + name + "]";
	}
	
	
}

class Employee {
	
	public static void main(String[] args) {
		BeforeRecords b = new BeforeRecords(1,"Swapnil");
		System.out.println(b);
	}
}