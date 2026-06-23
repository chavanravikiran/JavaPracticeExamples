package ObjectClass;

import java.util.ArrayList;
import java.util.List;

//String is immutable 
//now i want to create immutable object
	//fields are final private
	//no setter method
	//class is final
	//Deep Copy of List ,map ,etc in constructor
public class ObjectClassDemo{
	public static void main(String[] args) {
		List<String> langauges = new ArrayList<>();
		langauges.add("Marathi");
		langauges.add("Hindi");
		langauges.add("English");
		
		Student s = new Student("Ravi",28L,89.97,langauges);
//		s.name="Ravi";
//		s.age=20L;
//		s.percentage=70.50;
//		
//		System.out.println(s);
//		s.name ="Kiran";
		System.out.println(s);
		
	}
}

final class Student {
	private String name;
	private Long age;
	private Double percentage;
	private List<String> language;
	
	
	public String getName() {
		return name;
	}

	public Long getAge() {
		return age;
	}

	public Double getPercentage() {
		return percentage;
	}

	public List<String> getLanguage() {
		return language;
	}

	public Student(String name, Long age, Double percentage, List<String> language) {
		super();
		this.name = name;
		this.age = age;
		this.percentage = percentage;
		
		List<String> lang = new ArrayList<>();
		for (String str : language) {
			lang.add(str);
			System.out.println("lang kai ahe : "+str);
		}
		this.language=lang;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", percentage=" + percentage + ", language=" + language + "]";
	}


	
}
