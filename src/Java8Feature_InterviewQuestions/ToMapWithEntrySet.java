package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToMapWithEntrySet {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi", "Kiran", "Chavan","Ravi",null,"Kiran"," ");

//		System.out.println(
				names.stream()
			.filter(x->x != null && !x.isEmpty() && !x.isBlank())
			.collect(Collectors.groupingBy(x->x,Collectors.counting()))
			.entrySet().stream()
			.filter(x->x.getValue()>=2)
//			.forEach(x->System.out.println("Key : "+x.getKey()+", Value :"+x.getValue()));
			.forEach(x->System.out.println(x));
//		);
		
		
	}
}
