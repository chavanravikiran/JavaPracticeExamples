package InterviewQuestionsOnCollections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsUsingToSet {
	public static void main(String[] args) {
		List<String> language = new LinkedList<>();
		language.add("Java");
		language.add("Spring");
		language.add("Spring Boot");
		language.add("Spring MVC");
		language.add("Spring Data JPA");
		language.add("Spring Batch");
		language.add("Spring Batch");
		language.add("Java");
		
		System.out.println(""+language);
		
		System.out.println(language.stream()
		.collect(Collectors.toSet()));
	}
}
