package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class PartitioningByAgeGroup2 {
	public static void main(String[] args) {
		List<Student> student = Arrays.asList(
			 new Student("Ravi", 22),
	         new Student("Amit", 35),
	         new Student("Priya", 28),
	         new Student("Sneha", 42),
	         new Student("Kiran", 30),
	         new Student("Rahul", 19)
         );
		
		Map<Object, Object> result = student.stream()
		.collect(Collectors.partitioningBy(x->x.getAge()>=20))
		.entrySet()
		.stream()
		.collect(Collectors.toMap(x->x.getKey()==false ? "Young" : "Older", x->x.getValue()));
		
		System.out.println(result);
	}
}


class Student{
	private String name;
    private int age;
	
    public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
    
}