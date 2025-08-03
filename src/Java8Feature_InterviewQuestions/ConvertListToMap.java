package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToMap {
	public static void main(String[] args) {
		List<String> singer = Arrays.asList("RA Rehaman","Lata Mangeshkar","Kumar Sanu","Sonu Nigam","Arijit Singh");
		
		System.out.println(
				singer.stream()
				.collect(Collectors.toMap(x->x,x->x.length()))
		);
	}
	
}
