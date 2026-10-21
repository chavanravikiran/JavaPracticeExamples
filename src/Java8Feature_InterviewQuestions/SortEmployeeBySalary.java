package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortEmployeeBySalary {
	public static void main(String[] args) {
		List<OrgEmployee> orEmp = Arrays.asList(
			new OrgEmployee(101,"Jhon",50000d),
			new OrgEmployee(102,"Alice",70000d),
			new OrgEmployee(103,"Bob",45000d),
			new OrgEmployee(104,"David",90000d)
		);
		
		System.out.println(orEmp);
		List<OrgEmployee> sorderEmpl =orEmp.stream()
		//.sorted(Comparator.comparingDouble(OrgEmployee::getSalary).reversed())
		.sorted((x,y)->Double.compare(y.getSalary(), x.getSalary()))
		.collect(Collectors.toList());
		
		System.out.println(sorderEmpl);
	}
	
}

class OrgEmployee{
	
	private Integer id;
	private String name;
	private Double salary;
	
	public OrgEmployee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public OrgEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
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
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrgEmployee other = (OrgEmployee) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "OrgEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}