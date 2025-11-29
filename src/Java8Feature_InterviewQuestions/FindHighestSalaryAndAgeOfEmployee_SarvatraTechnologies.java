package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Find the highest Salary and age find out from employee
//[
//SarvatraEmployee [age=26, name=Sachitanand, salary=47000.0], 
//SarvatraEmployee [age=24, name=sakharam, salary=29000.0],
//SarvatraEmployee [age=22, name=Atul, salary=40000.0], 
//SarvatraEmployee [age=22, name=Satish, salary=37000.0], 
//SarvatraEmployee [age=21, name=Kiran, salary=93000.0], 
//SarvatraEmployee [age=20, name=Ravi, salary=30000.0]
//]
//

public class FindHighestSalaryAndAgeOfEmployee_SarvatraTechnologies {
	public static void main(String[] args) {
		List<SarvatraEmployee> emp = new ArrayList<>();
		emp.add(new SarvatraEmployee(20,"Ravi",30000d));
		emp.add(new SarvatraEmployee(21,"Kiran",93000d));
		emp.add(new SarvatraEmployee(22,"Satish",37000d));
		emp.add(new SarvatraEmployee(22,"Atul",40000d));
		emp.add(new SarvatraEmployee(24,"sakharam",29000d));
		emp.add(new SarvatraEmployee(26,"Sachitanand",47000d));
		
		System.out.println(
				emp.stream()
				.sorted((x,y)->Double.compare(y.getSalary(), x.getSalary()))
				.sorted((x,y)->Integer.compare(y.getAge(), x.getAge()))
				.collect(Collectors.toList())
		);
	}
}

class SarvatraEmployee{
	Integer age;
	String name;
	Double salary;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public SarvatraEmployee(Integer age, String name, Double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "SarvatraEmployee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}