package Collection_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample2 {
	
	public static void main(String[] args) {
        // Create LinkedHashSet of Employee objects
        Set<Employee> employees = new LinkedHashSet<>();

        // Adding employees
        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 60000));
        employees.add(new Employee(1, "Alice", 50000)); // Duplicate? No, because equals() is not overridden!
        employees.add(new Employee(3, null, 8353));
        employees.add(new Employee(4, "Alice", 50000)); // Duplicate? No, because equals() is not overridden!
        // Print elements
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // toString() for readable output
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}