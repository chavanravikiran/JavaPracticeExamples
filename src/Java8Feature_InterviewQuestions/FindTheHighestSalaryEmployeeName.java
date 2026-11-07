package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindTheHighestSalaryEmployeeName {
	public static void main(String[] args) {
		List<EmployeeD> emp = Arrays.asList(
				new EmployeeD("Ravi", 50000),
			    new EmployeeD("Amit", 70000),
			    new EmployeeD("Rahul", 60000)
			);
		
		String highrstSalaryEmpName = emp.stream()
		.sorted((x,y)->Double.compare(y.getSalary(), x.getSalary()))
		.map(x->x.getName())
		.findFirst()
		.get();
		
		System.out.println("Highrst Salary Emp Name : "+highrstSalaryEmpName);
	}
}


class EmployeeD{
	private String name;
    private double salary;
	
    
    public EmployeeD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    public EmployeeD(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
    public String getName() {
		return name;
	}
	
    public double getSalary() {
		return salary;
	}
	
    public void setName(String name) {
		this.name = name;
	}
	
    public void setSalary(double salary) {
		this.salary = salary;
	}
	
    @Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeD other = (EmployeeD) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "EmployeeD [name=" + name + ", salary=" + salary + "]";
	}
    
    
}