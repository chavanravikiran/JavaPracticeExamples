package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Input - ["Jonson","Randiortam"]
//output -[J, o, n, s, o, n, R, a, n, d, i, o, r, t, a, m] 
public class ConvertStringToChartectors2New {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Jonson","Randiortam");
		
		System.out.println(list.stream()
			.flatMap(str -> str.chars().mapToObj(c -> (char) c))
			.collect(Collectors.toList())
		);
	}
}
