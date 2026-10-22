package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupByDepertmentAndCalculateAvarageSalary {
	public static void main(String[] args) {
		List<Classmate> employees =Arrays.asList(
			new Classmate(1, "John", "HR", 50000d),
			new Classmate(2, "Jane", "IT", 70000d),
			new Classmate(3, "Mike", "IT", 80000d),
			new Classmate(4, "Sara", "Finance", 60000d),
			new Classmate(5, "Paul", "HR", 55000d)
		);
		
		System.out.println(employees);
		
		 Map<String,Double> averageSalary = employees.stream()
		.collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.averagingDouble(x->x.getSalary())));

		 System.out.println(averageSalary);

		 System.out.println(employees.stream()
				 .collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.summarizingDouble(x->x.getSalary()))));
	
		 
		 //Highet Paid Salary of Each Department
		 System.out.println(
				 employees.stream()
		 .collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.maxBy((x,y)->Double.compare(x.getSalary(), y.getSalary()))))
		 );
		 
		 //Lowest Paid Salary of Each Department
		 System.out.println(
				 employees.stream()
		 .collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.minBy((x,y)->Double.compare(x.getSalary(), y.getSalary()))))
		 );
	}
}

class Classmate{
	private Integer id;
	private String name;
	private String department;
	private Double salary;
	
	public Classmate(Integer id, String name, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Classmate() {
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
		Classmate other = (Classmate) obj;
		return Objects.equals(department, other.department) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}