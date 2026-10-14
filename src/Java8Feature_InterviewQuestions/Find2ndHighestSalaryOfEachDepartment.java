package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Find2ndHighestSalaryOfEachDepartment {
	public static void main(String[] args) {
		List<CompanyEmployee1> emp = new ArrayList<>();
		emp.add(new CompanyEmployee1("Ravi","Developer", 94300d));
		emp.add(new CompanyEmployee1("Kiran","Developer", 30000d));
		emp.add(new CompanyEmployee1("Rajat","IT", 40000d));
		emp.add(new CompanyEmployee1("Rajat","IT", 40000d));
		emp.add(new CompanyEmployee1("Harshad","QA", 35000d));
		emp.add(new CompanyEmployee1("Prafull","QA", 30000d));
		emp.add(new CompanyEmployee1("Aditya","Developer", 42000d));
		emp.add(new CompanyEmployee1("Rakesh","IT", 42000d));
		emp.add(new CompanyEmployee1("Dhampal","HR", 42000d));
		emp.add(new CompanyEmployee1("Swapnil","HR", 41000d));
	
		System.out.println(
				 emp.stream()
			        .collect(Collectors.groupingBy(
			            x -> x.getDept(),
			            Collectors.collectingAndThen(
			                Collectors.toList(),
			                x -> x.stream()
			                    .sorted((a, b) ->
			                        Double.compare(b.getSalary(), a.getSalary()))
			                    .map(a -> a.getSalary())
			                    .distinct()
			                    .skip(1)
			                    .findFirst()
			                    
			            .get())
			        ))
		);
	}
}


class CompanyEmployee1{
	
	String name;
	String dept;
	Double salary;
	
	public CompanyEmployee1(String name, String dept, Double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public CompanyEmployee1() {
		super();
		// TODO Auto-generated constructor stub
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

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "CompanyEmployee1 [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}