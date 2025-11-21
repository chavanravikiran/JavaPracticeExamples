package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MobisoftInfotechInterview {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 50, 40, 90, 5, 20, 50, 57);
		
		//1st Way
		System.out.println(numbers.stream()
		.max((x,y)->Integer.compare(x, y)).get()
		);
		
		//2nd Way
		System.out.println(
				numbers.stream()
				.sorted(Collections.reverseOrder())
				.findFirst()
				.get()
		);
		
		//Remove duplicates from a list
		System.out.println(numbers.stream()
			.distinct()
			.collect(Collectors.toList())
		);
		
		//Find even numbers using Streams
		System.out.println(
				numbers.stream()
				.collect(Collectors.partitioningBy(x -> x % 2 == 0))
				.entrySet().stream()
				.collect(Collectors.toMap(x->x.getKey() == true ? "Even" : "Odd", x->x.getValue()))
		);
		
		//Convert a List of Strings to uppercase
		List<String> names = Arrays.asList("vivek", "kiran", "john");
		System.out.println(
				names.stream()
				.map(x->x.toUpperCase())
				.collect(Collectors.toList())
		);
		
		//Sort Company by department then salary
		List<Company> comp = new ArrayList<>();
		comp.add(new Company("Probity", "IT", 50000));
		comp.add(new Company("Cognizant", "Product Base", 80000));
		comp.add(new Company("Capgemini", "Service Base", 47000));
		comp.add(new Company("TCS", "BPO", 40000));
		comp.add(new Company("Mphasic", "BPO", 58000));
		
		System.out.println(comp.stream()
				.sorted(Comparator.comparing(Company::getDepartment).thenComparing(Company :: getSalary))
				.collect(Collectors.toList())
		);
		
	}
}

class Company{
	private String companyName;
	private String department;
	private double salary;
	
	
	public Company(String companyName, String department, double salary) {
		super();
		this.companyName = companyName;
		this.department = department;
		this.salary = salary;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", department=" + department + ", salary=" + salary + "]";
	}

}
