package OOPSExample;

public class EncapsulationExample {

	public static void main(String[] args) {
		EmployeeEncapsulation emp =new EmployeeEncapsulation();
		
		 // Accessing data via setters
        emp.setName("Ravi");
        emp.setAge(25);
        emp.setSalary(50000);
        
     // Accessing data via getters
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
	}
}

