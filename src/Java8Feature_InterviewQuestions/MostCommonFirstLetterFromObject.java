package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MostCommonFirstLetterFromObject {
	public static void main(String[] args) {
		List<Classmate3> list = Arrays.asList(
				new Classmate3(1, "John", "IT", 60000d),
				new Classmate3(2, "Alice", "HR", 55000d),
				new Classmate3(3, "Bob", "IT", 75000d),
				new Classmate3(4, "Carol", "HR", 70000d),
				new Classmate3(5, "David", "Finance", 65000d),
				new Classmate3(6, "Eve", "IT", 80000d),
				new Classmate3(7, "Frank", "Finance", 64000d),
				new Classmate3(8, "Ala", "Operations", 44000d)
		);
				
		System.out.println(list.stream()
		.collect(Collectors.groupingBy(x->x.getName().charAt(0),Collectors.counting()))
		.entrySet().stream()
		.sorted((x,y)->Long.compare(y.getValue(), x.getValue()))
		.map(x->x.getKey())
		.findFirst().get());
	}
}


class Classmate3{
	private Integer id;
	private String name;
	private String department;
	private Double salary;
	
	public Classmate3(Integer id, String name, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Classmate3() {
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
	public String toString() {
		return "Classmate3 [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classmate3 other = (Classmate3) obj;
		return Objects.equals(department, other.department) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

	

	
	
}