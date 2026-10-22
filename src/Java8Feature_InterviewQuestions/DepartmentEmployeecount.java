package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class DepartmentEmployeecount {
	public static void main(String[] args) {
		List<Classmate1> employees =Arrays.asList(
				new Classmate1(1, "John", "IT", 60000d),
				new Classmate1(2, "Alice", "HR", 55000d),
				new Classmate1(3, "Bob", "IT", 75000d),
				new Classmate1(4, "Carol", "HR", 70000d),
				new Classmate1(5, "David", "Finance", 65000d),
				new Classmate1(6, "Eva", "IT", 80000d),
				new Classmate1(7, "Frank", "Finance", 64000d),
				new Classmate1(8, "Ala", "Operation", 44000d)
			);
		/*
		 IT = 3,
		 HR = 3,
		 Finance = 2,
		 Operation = 1
		 */
		
		System.out.println(employees);
		
		Map<String,Long> dptCount =employees.stream()
		.collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.counting()));
		
		Map<String,Long> countGreaterThan2 = dptCount.entrySet().stream()
		.filter(x->x.getValue()>=2)
		.collect(Collectors.toMap(x->x.getKey(), x->x.getValue()));
		
		//Return Map<String,Long>
		System.out.println(countGreaterThan2);
		
		//Return Only Keys
		System.out.println(
				dptCount.entrySet().stream()
				.filter(x->x.getValue()>=2)
				.map(x->x.getKey())
				.collect(Collectors.toList())
		);
		
		
	}
}


class Classmate1{
	private Integer id;
	private String name;
	private String department;
	private Double salary;
	
	public Classmate1(Integer id, String name, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Classmate1() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classmate1 other = (Classmate1) obj;
		return Objects.equals(department, other.department) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "Classmate1 [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}