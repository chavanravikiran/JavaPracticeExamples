package Java8Feature_InterviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//How can you use flatMap to convert a list of departments with employees into a list of all employees?
public class ConvertListOfDepartmentWithEmployeeUsingFlatMap {
	public static void main(String[] args) {
			Employees emp1 = new Employees("Ravi","Software Developer");
			Employees emp2 = new Employees("Kiran","Java Developer");
			Employees emp3 = new Employees("satish","Python Developer");
			Employees emp4 = new Employees("Sachin","PHP Developer");
			
			System.out.println(
					Stream.of(emp1,emp2,emp3,emp4)
					.map(x->x.getDepartments())
					.collect(Collectors.toList())
			);
	}
	
	static class Employees{
		private String name;
		private String departments;
		
		@Override
		public String toString() {
			return "Employees [name=" + name + ", departments=" + departments + "]";
		}
		
		public Employees(String name, String departments) {
			super();
			this.name = name;
			this.departments = departments;
		}
		
		public Employees() {
			super();
		}

		public String getDepartments() {
			return departments;
		}

		public void setDepartments(String departments) {
			this.departments = departments;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
	}
}
