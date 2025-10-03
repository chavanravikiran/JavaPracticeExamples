package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Transform Person object stream into a single string
public class StringJoinUsingObject {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ravi", 29L, "Kasarsai pune"),
				new Person("kiran", 28L, "Thergoan pune"),
				new Person("Ravikiran", 26L, "Thergoan pune"),
				new Person("Sham", 32L, "Mumbai"),
				new Person("Atul", 27L, "Dubai")
			);
		
		
		String result = people.stream()
			    .map(Person::toString)
			    .collect(Collectors.joining(" | "));
		System.out.println(result);
		
		String getOnlyName = people.stream()
			    .map(Person::getName)
			    .collect(Collectors.joining(" | "));
		System.out.println(getOnlyName);
		
		//get Age is greater than 29
		System.out.println(people.stream()
			.filter(p -> p.getAge() >= 29)
			.map(Person::getName)
			.collect(Collectors.toList())
		);
		//whole Records want
		System.out.println(
				people.stream()
				.filter(x->x.getAge()>=29L)
				.map(Person :: getName)
				.map(x->x.toUpperCase())
				.collect(Collectors.toList())
				
				);
		
		System.out.println("Sort Using Person Age Desc "+people.stream()
			.sorted((x,y)->Long.compare(y.getAge(), x.getAge()))
			.collect(Collectors.toList())
		);
		
		System.out.println("Sort Using Name "+people.stream()
		.sorted(Comparator.comparing(Person :: getName))
				.collect(Collectors.toList())
			);
	}
}
