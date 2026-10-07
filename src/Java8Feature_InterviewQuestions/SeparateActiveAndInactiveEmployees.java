package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class SeparateActiveAndInactiveEmployees {
	public static void main(String[] args) {

		List<Employees> employees = new ArrayList<>();

		employees.add(new Employees("Ravi", "IT", 75000d, true));
		employees.add(new Employees("Amit", "HR", 60000d, true));
		employees.add(new Employees("Priya", "IT", 85000d, false));
		employees.add(new Employees("Sneha", "Finance", 70000d, false));
		employees.add(new Employees("Rahul", "IT", 90000d, true));
		
		System.out.println(employees);
		
		Map<Boolean, List<Employees>> partitionling = employees.stream()
		.collect(Collectors.partitioningBy(x->x.getIsActive()));
		
		System.out.println(partitionling);
	}
}

class Employees {

	String name;
	String dept;
	Double salary;
	Boolean isActive;

	public Employees(String name, String dept, Double salary,Boolean isActive) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.isActive = isActive;
	}

	public Employees() {
		super();
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public Double getSalary() {
		return salary;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, isActive, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(isActive, other.isActive)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", dept=" + dept + ", salary=" + salary + ", isActive=" + isActive + "]";
	}
}
