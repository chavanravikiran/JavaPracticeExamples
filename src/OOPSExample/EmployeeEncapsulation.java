package OOPSExample;

public class EmployeeEncapsulation {
    // Step 1: Private data members (data hiding)
    private String name;
    private int age;
    private double salary;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// you can add validation before assigning
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		 // add validation
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18.");
        }
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		// add validation
        if (salary > 0) {
        	this.salary = salary;
        }else {
        	System.out.println("Salary must be positive.");
        }
	}
 
    
    
}