package Java8Feature_MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Why Use Method Reference ?
//Instead of writing a lambda expression, you can refer to an existing method if it matches the signature
//Reduce boilerplate code.
//Improve code Readability.

//Type of method Reference
//	1)Static Method Reference
//	2)Instance Method Reference
//	3)Constructor Method Reference

//2)Constructor Method Reference
public class ConstructorReferenceEx5 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi","Kiran","Atul");
		List<Student> result =names.stream()
				.map(Student::new)
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}


class Student{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return  name ;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}