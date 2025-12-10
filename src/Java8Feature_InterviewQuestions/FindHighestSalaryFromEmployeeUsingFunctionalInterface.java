package Java8Feature_InterviewQuestions;

//Functional interface to find Emp details who has highest salary out of 3 arguments(e1,e2,e3) . Implement the logic using lambda exp
public class FindHighestSalaryFromEmployeeUsingFunctionalInterface {
	public static void main(String[] args) {
		ComponyEmployee e1 = new ComponyEmployee("Ravi", 50000);
		ComponyEmployee e2 = new ComponyEmployee("Kiran", 65000);
		ComponyEmployee e3 = new ComponyEmployee("John", 60000);
	
		 EmployeeInterface obj = (emp1, emp2, emp3) -> {
			    return (emp1.getSalary() > emp2.getSalary()
			            ? (emp1.getSalary() > emp3.getSalary() ? emp1 : emp3)
			            : (emp2.getSalary() > emp3.getSalary() ? emp2 : emp3)
			    );
			};
		
		System.out.println(obj.highestSalary(e1,e2,e3));
	}
}

@FunctionalInterface
interface EmployeeInterface{
	ComponyEmployee highestSalary(ComponyEmployee e1,ComponyEmployee e2,ComponyEmployee e3);
}
class ComponyEmployee{
	private String name;
    private double salary;
	
    public ComponyEmployee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
    

	public ComponyEmployee() {
		super();
	}

	@Override
	public String toString() {
		return "ComponyEmployee [name=" + name + ", salary=" + salary + "]";
	}

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
    
}
