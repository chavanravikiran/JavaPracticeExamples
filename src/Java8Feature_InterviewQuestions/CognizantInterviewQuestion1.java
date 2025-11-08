package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Group on Department and find out >20K
public class CognizantInterviewQuestion1 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Ravi", "Java", "12345", 20000);
		Employee emp2 = new Employee("Kiran", "Angular", "73535", 21000);
		Employee emp3 = new Employee("Atula", "Java", "2335", 10000);
		Employee emp4 = new Employee("Raghav", "React", "93285", 20500);
		Employee emp5 = new Employee("diptesh", "Spring AI", "85735", 50000);
		
		List<Employee> empList = new ArrayList<>(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
		
		System.out.println(
			empList.stream()
			.collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.counting()))
			.entrySet().stream()
			.filter(x->x.getValue()<20000)
			.collect(Collectors.toList())
		);
		
		//  Distinct departments where at least one employee has salary > 20000
        System.out.println(empList.stream()
        		.filter(x->x.getSalary()>20000)
        		.map(x->x.getDepartment())
        		.collect(Collectors.toList()));
	}
	
}



class Employee{
	String name;
	String department;
	String mobileNo;
	Integer salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, mobileNo, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(mobileNo, other.mobileNo)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	public Employee(String name, String department, String mobileNo, Integer salary) {
		super();
		this.name = name;
		this.department = department;
		this.mobileNo = mobileNo;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
}