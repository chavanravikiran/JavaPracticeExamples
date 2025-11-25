package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

// Write a code for finding highest salary of employee using functional interface and implement lambda expression
//Output 90000.0
public class FindingHighestSalaryOfEmployeeUsingFunctionalInterface {
	public static void main(String[] args) {
		List<CompanyEmployee> empList = new ArrayList<>();
		empList.add(new CompanyEmployee("Ravi", 70000));
		empList.add(new CompanyEmployee("Kiran", 10000));
		empList.add(new CompanyEmployee("Rajani", 90000));
		empList.add(new CompanyEmployee("Sunil Sheti", 20000));
		empList.add(new CompanyEmployee("Sanjay Dat", 58000));

		MaxSalaryFinder obj = (list) -> {
			return list.stream().max((a, b) -> Double.compare(a.getSalary(), b.getSalary())).get();
		};

		System.out.println(obj.findMaxSalary(empList).getSalary());

	}
}

@FunctionalInterface
interface MaxSalaryFinder {
	CompanyEmployee findMaxSalary(List<CompanyEmployee> emp);
}

class CompanyEmployee {
	private String name;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public CompanyEmployee() {
		super();
	}

	public CompanyEmployee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
