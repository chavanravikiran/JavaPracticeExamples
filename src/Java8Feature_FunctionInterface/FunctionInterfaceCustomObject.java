package Java8Feature_FunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceCustomObject {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ravi", 20L);
		Student s2 = new Student(2, "Ravikishan", 23L);
		Student s3 = new Student(3, "RaviKiran", 26L);
		Student s4 = new Student(4, "kiran", 50L);
		Student s5 = new Student(5, "Aravi", 10L);
		
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
		
		for (Student student : students) {
			System.out.println(student);
		}	
		
		//find out Student List which is name starts with Ravi
		Function<List<Student>, List<Student>> startWithRaviName= x ->{
			List<Student> result =new ArrayList<>();
			for (Student student : students) {
				if (student.getName().startsWith("Ravi")) {
					result.add(student);
				}; 
			}
			return result;
		};
		System.out.println("Name Start With Ravi -"+startWithRaviName.apply(students));
		
	}
	
}

class Student{
	
	public Integer id;
	public String name;
	public Long age;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getAge() {
		return age;
	}
	
	public void setAge(Long age) {
		this.age = age;
	}
	
	public Student(Integer id, String name, Long age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}