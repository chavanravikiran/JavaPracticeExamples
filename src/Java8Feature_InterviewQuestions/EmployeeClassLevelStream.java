package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeClassLevelStream{
	public static void main(String[] args) {
		List<EntityEmployee> employee = Arrays.asList(
				new EntityEmployee(1, "Ravi", "IT", 100),
				new EntityEmployee(2, "Rushi", "Computer", 100),
				new EntityEmployee(3, "Dhampal", "HR", 200),
				new EntityEmployee(4, "Rakesh", "HR", 150),
				new EntityEmployee(5, "Raj", "ScrumMaster", 250)
				);
		
		// 1. Print all employees
		employee.stream()
		.forEach(System.out::print);
		
		//2. Print Only Who has EmployeeName ="Ravi".
		List<EntityEmployee> nameWith = employee.stream()
		.filter(x->x.getName().equals("Ravi"))
		.collect(Collectors.toList());
		
		System.out.println(nameWith);
		
		//3. print Only Employees List
		List<String> employeeName = employee.stream()
		.map(x->x.getName())
		.collect(Collectors.toList());
		
		System.out.println(employeeName);
		
		
		// 4. Employees whose salary > 150
		List<EntityEmployee> greaterThanSalary = employee.stream()
		.filter(x->x.getSalary()>=150)
		.collect(Collectors.toList());
		
		System.out.println("Employees whose salary > 150 count is"+greaterThanSalary.size()+" - "+greaterThanSalary);
		
		// 5. Increase salary by 10%
		List<EntityEmployee> incrementSalary = employee.stream()
		.map(x->new EntityEmployee(x.getId(), x.getName(), x.getDepartment(), x.getSalary()*10))
		.collect(Collectors.toList());
		
		System.out.println(" Increase salary by 10% "+incrementSalary);
	
		//6. Sort by salary in desc order
		List<EntityEmployee> sortedSalary= employee.stream()
		.sorted((a,b)->Double.compare(b.getSalary(), a.getSalary()))
		.collect(Collectors.toList());
		
		System.out.println("Sort by salary in desc order "+ sortedSalary );
		
		//7.Sort by Salary and Name
//		List<EntityEmployee> sortedSalaryAndName = employee.stream()
//		.sorted((x,y)->Double.compare(x.getSalary(), y.getSalary()))
//		.sorted((a,b)->a.getName().compareTo(b.getName()))
//		.collect(Collectors.toList());
		//Here Multiple sorted() calls are generally not recommended, because each call performs a complete sort.
		
		//For multiple sorting conditions, use Comparator.thenComparing(), which is more efficient and clearer.
		List<EntityEmployee> sortedSalaryAndName = employee.stream()
		.sorted(Comparator.comparing(EntityEmployee::getSalary).reversed().thenComparing(EntityEmployee::getName))
		.collect(Collectors.toList());
		System.out.println("Sort by Salary and Name " +sortedSalaryAndName);
		
		//7. Highest Salary Employee
		EntityEmployee highestSalary = employee.stream()
		.max((x,y)->Double.compare(x.getSalary(), y.getSalary()))
		.get();
		
		System.out.println("Highest Salary Employee "+highestSalary);
		
		//8. Highest Salary Employee
		System.out.println(employee.stream()
		.min((x,y)->Double.compare((x.getSalary()), y.getSalary())));
		
		// 9. Total Salary
		Double sumOfSalary = employee.stream()
				.mapToDouble(x->x.getSalary()).sum();
		System.out.println("Total Salary "+sumOfSalary);
		
		Double sumOfSalary1 = employee.stream()
		        .map(x -> x.getSalary())
		        .reduce(0.0, (a, b) -> a + b);

		System.out.println("Total Salary = " + sumOfSalary1);
		
		// 11. Group By Department
		Map<String, List<EntityEmployee>> groupByDept = employee.stream()
		.collect(Collectors.groupingBy(x->x.getDepartment()));
		
		List<List<EntityEmployee>> list=groupByDept.entrySet().stream().map(x->x.getValue())
		.collect(Collectors.toList());
		
		list.stream()
		.flatMap(x->x.stream())
		.forEach(System.out::println);
		
		
		// 12. Count Employees in Each Department
		Map<String,Long> deptCount=employee.stream()
		.collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.counting()));
		 System.out.println("Count Employees in Each Department : "+deptCount);

		 // 13.Find Any Employee 
		 System.out.println("\nFind Any Employee");
		 
		 employee.stream()
		 .findAny()
		 .ifPresent(System.out::println);
		 
		 // 14. Distinct Departments
		 List<String> distinctDept = employee.stream()
		 .map(x->x.getDepartment())
		 .distinct()
		 .collect(Collectors.toList());
		 
		 System.out.println("Distinct Departments : "+distinctDept);
		 
		 //15. Skip First 2 Employees
		List<EntityEmployee> skipFirstNRecords = employee.stream()
		 .skip(2)
		 .collect(Collectors.toList());
		
		System.out.println("Skip First 2 Employees : "+skipFirstNRecords);
		
		//16. Limit First 3 Employees
		List<EntityEmployee> printFirstNRecords = employee.stream()
				 .limit(3)
				 .collect(Collectors.toList());
		
		System.out.println("Limit First 3 Employees : "+printFirstNRecords);
		
		//17. Find the second-highest salary.
		Double highestS = employee.stream()
		.sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).skip(1).max((x,y)->Double.compare(x.getSalary(), y.getSalary())).get().getSalary();

		System.out.println("second Highest "+highestS);

		//Find the second-highest salary.
		List<EntityEmployee> sort = employee.stream()
		.sorted(Comparator.comparing(EntityEmployee::getSalary).reversed())
		.collect(Collectors.toList());
				
		System.out.println("2nd Highest Salary : "+sort.stream().skip(1).limit(1).map(x->x.getSalary()).findFirst().get());

		System.out.println("2nd Highest Salary : "+employee.stream()
				.sorted(Comparator.comparing(EntityEmployee::getSalary).reversed())
				.skip(1).limit(1).map(x->x.getSalary()).findFirst().get());
		
		
		//18. Calculate average salary department-wise.
		Double average =employee.stream()
		.mapToDouble(x->x.getSalary()).average().getAsDouble();
		
		System.out.println("Calculate average salary department-wise : "+average);
		
		Double averageUsingReduce = employee.stream()
		        .map(x->x.getSalary())
		        .reduce(0.0, (a, b) -> a + b) / employee.size();

		System.out.println("Average Salary using Reduce Method = " + averageUsingReduce);
		
		// 19. Find duplicate department names
		List<String> duplicateDept = employee.stream()
		.collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.counting()))
		.entrySet().stream()
		.filter(x->x.getValue()>=2)
		.map(x->x.getKey())
		.collect(Collectors.toList());
		
		System.out.println("Find duplicate department names : "+ duplicateDept);
		
		//20 .Join all employee names into a comma-separated string.
		String employeeNames = employee.stream()
		        .map(x->x.getName())
		        .collect(Collectors.joining(", "));

		System.out.println("Join all employee names into a comma-separated string : "+employeeNames);
		
		// 21. Find the first employee from the HR department.
		EntityEmployee findFirst = employee.stream()
		.filter(x->x.getDepartment().equals("HR"))
		.findFirst().get();
		
		System.out.println("Find the first employee from the HR department : "+findFirst);
		
		// 22. Convert List<Employee> to Map<Integer, Employee>.
		Map<Integer,EntityEmployee> listToMap = employee.stream()
		.collect(Collectors.toMap(x->x.getId(), x->x,(existing, duplicate) -> existing));
		
		System.out.println("Convert List<Employee> to Map<Integer, Employee> :"+ listToMap);
	}
}

class EntityEmployee {

	private int id;
	private String name;
	private String department;
	private double salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EntityEmployee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ "]";
	}

	public EntityEmployee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public EntityEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
}