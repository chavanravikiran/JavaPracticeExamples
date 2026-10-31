package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

//We can to find top 3 frequent
public class Top3FrequentWords {
	public static void main(String[] args) {
		String paragraph = "java is great. java is object oriented. java streams are powerful, and java is fun! fun";
		
	
		 System.out.println(Arrays.stream(paragraph.replaceAll("[^a-z\\s]", "").split(" "))
					.collect(Collectors.groupingBy(x->x,Collectors.counting()))
					.entrySet().stream()
					.distinct()
					.sorted((x,y)->Long.compare(y.getValue(), x.getValue()))
					.collect(Collectors.toMap(x->x.getKey(), x->x.getValue()))
		);
				
		 
		 System.out.println(Arrays.stream(paragraph.replaceAll("[^a-z\\s]", "").split(" "))
			.collect(Collectors.groupingBy(x->x,Collectors.counting()))
			.entrySet().stream()
			.distinct()
			.sorted((x,y)->Long.compare(y.getValue(), x.getValue()))
			.limit(3)
			.collect(Collectors.toMap(x->x.getKey(), x->x.getValue()))
		);
			
	}
	
}
