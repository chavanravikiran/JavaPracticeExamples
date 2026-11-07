package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Calculate2ndHighestSalary {
	public static void main(String[] args) {
		List<EmployeeE> emp = Arrays.asList(
				new EmployeeE("Ravi", "IT", 40000),
			    new EmployeeE("Amit", "HR", 55000),
			    new EmployeeE("Rahul", "IT", 75000),
			    new EmployeeE("Priya", "Finance", 60000),
			    new EmployeeE("Sneha", "HR", 45000),
			    new EmployeeE("Kiran", "IT", 90000),
			    new EmployeeE("Neha", "Finance", 85000),
			    new EmployeeE("Akash", "Sales", 50000),
			    new EmployeeE("Pooja", "IT", 65000),
			    new EmployeeE("Vikas", "Sales", 70000),
			    new EmployeeE("Anjali", "Finance", 95000)
		);
		
		//find Highest salary of each Department
		System.out.println(emp.stream()
		.collect(Collectors.groupingBy(x->x.getDepartment(),
				Collectors.maxBy((x,y)->Double.compare(y.getSalary(), x.getSalary()))))
		);
		
		//Second Highest Salary of Each Department
		System.out.println(emp.stream()
		.collect(Collectors.groupingBy(x->x.getDepartment(),
				Collectors.collectingAndThen(Collectors.toList(), 
												x->x.stream()
												.sorted((z,y)->Double.compare(y.getSalary(), z.getSalary()))
												.skip(1)
												.findFirst()
												.get()
											)
										)
				)
		);
		
	}
}


class EmployeeE{
	String name;
	String Department;
	double salary;
	
	public EmployeeE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeE(String name, String department, double salary) {
		super();
		this.name = name;
		Department = department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return Department;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Department, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeE other = (EmployeeE) obj;
		return Objects.equals(Department, other.Department) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "EmployeeE [name=" + name + ", Department=" + Department + ", salary=" + salary + "]";
	}
	
	
}