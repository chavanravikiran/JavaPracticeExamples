package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Convert string list to map<String,Integer>and its equivalent lenght 
public class ListToMapExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple","Banana","Kiwi","Mango");
		
		Map<String,Integer> map = list.stream()
		.collect(Collectors.toMap(x->x, x->x.length()));
	
		System.out.println(map);
	}
}
