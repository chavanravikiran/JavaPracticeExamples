package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeStreamExamples {
	public static void main(String[] args) {

		List<EmployeeEntity> employees1 = new ArrayList<>();
		 employees1.add(new EmployeeEntity(1, "Ravi", "IT", 80000, 28));
		 employees1.add(new EmployeeEntity(2, "Priya", "HR", 60000, 30));
		 employees1.add(new EmployeeEntity(3, "Karan", "Finance", 75000, 35));
		 employees1.add(new EmployeeEntity(4, "Asha", "IT", 90000, 32));
		 employees1.add(new EmployeeEntity(5, "Suresh", "Finance", 55000, 26));

		 System.out.println(employees1.toString());
		 
		 //1.Filter employees by department
		 List<EmployeeEntity> onlyDept = employees1.stream()
		 .filter(x->x.getDepartment().equals("Finance"))
		 .collect(Collectors.toList());
		 
		 System.out.println("Whole Entity "+onlyDept);
		 
		 //2. only get Departname whose having age >30
		 System.out.println("only get Departname whose having age >30 "+employees1.stream()
			 .filter(x->x.getAge()>=30)
			 .map(x->x.getDepartment())
			 .collect(Collectors.toList())
		 );
		 
		 //3.find out count of dept. whose having age is greater than 30
		 System.out.println("find out count of dept. whose having age is greater than 30"+
				 employees1.stream()
				 .filter(x->x.getAge()>=30)
				 .map(x->x.getDepartment())
				 .collect(Collectors.groupingBy(x->x,Collectors.counting()))
		);
		 
		 //4.Get all entity records of employees earning more than 70,000
		 System.out.println("Get all entity records of employees earning more than 70,000 "+employees1.stream()
			 .filter(x->x.getSalary()>=70000)
			 .collect(Collectors.toList())
		 );
		 
		//4.Get names and age of employees earning more than 70,000
		 System.out.println("Get names and age of employees earning more than 70,000 "+employees1.stream()
			 .filter(x->x.getSalary()>=70000)
			 .map(x->x.getName() +"-"+ x.getAge())
			 .collect(Collectors.toList())
		 );
		 
		 //5.Sort employees by salary (descending)
		 System.out.println("Sort employees by salary (descending) "+employees1.stream()
			 .sorted(Comparator.comparing(EmployeeEntity::getSalary).reversed())
			 .collect(Collectors.toList())
		 );
	}
}


class EmployeeEntity {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeEntity(int id, String name, String department, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", age=" + age + "]";
	}
    
 
    
}