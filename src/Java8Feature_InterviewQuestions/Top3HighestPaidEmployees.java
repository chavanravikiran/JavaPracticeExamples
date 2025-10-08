package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top3HighestPaidEmployees {
	public static void main(String args[]){
		Employees emp1 = new Employees("Ravi",1000L);
		Employees emp2 = new Employees("Kiran",2000L);
		Employees emp3 = new Employees("satish",1500L);
		Employees emp4 = new Employees("Sachin",2500L);
		
		List<Employees> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		
		List<Employees> sortedList =employeeList.stream()
		.sorted(Comparator.comparingDouble(e->e.salary))
		.collect(Collectors.toList());
		
		System.out.println(sortedList.stream()
				.map(x->x)
				.skip(1)
				.limit(3)
				.collect(Collectors.toList())
		);
	}

	static class Employees{ 
		private String name; 
		private Long salary;
		
		public Employees(String name, Long salary) {
			super();
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employees [name=" + name + ", salary=" + salary + "]";
		}
		
		
	}
}
