package Java8Feature_FunctionInterface;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindHighestSalaryOfEachDeperatment {
	public static void main(String[] args) {
		List<EmployeesClass> emp = List.of(
				new EmployeesClass("Amit","IT",80000),
				new EmployeesClass("Rahul","HR",60000),
				new EmployeesClass("Priya","IT",95000),
				new EmployeesClass("Sneha","HR",75000),
				new EmployeesClass("Nhea","Finance",85000)
		);
		
//		emp.stream()
//		.collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(EmployeesClass::getSalary)),optional -> optional.orElseThrow())));
		
		Map<String, EmployeesClass> result = emp.stream()
	            .collect(Collectors.toMap(
	                x -> x.getDepartment(),
	                x -> x,
	                (e1, e2) ->
	                    e1.getSalary() > e2.getSalary() ? e1 : e2
	            ));

	        System.out.println(result);
	}
}

class EmployeesClass {
	private String name;
	private String department;
	private Integer salary;

	public EmployeesClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeesClass(String name, String department, Integer salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeesClass [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeesClass other = (EmployeesClass) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}

}