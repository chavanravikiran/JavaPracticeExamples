package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//String s="Hello World , Hello Welcome to Interview" 
//Find the count of each word and store in Map Sort the map by values
public class CountOfStringStream {
	public static void main(String[] args) {
		 String s="World Hello , Hello Welcome to Interview";
	      
	      
	        Map<String,Long> wordCount=Arrays.stream(s.replace(" , ", " ").split(" "))
	        				.collect(Collectors.groupingBy(x->x,Collectors.counting()));
	        
	      LinkedHashMap<String, Long> sortedMap = wordCount.entrySet()
	                .stream()
	                .sorted((a,b)->b.getValue().compareTo(a.getValue()))
	                .collect(Collectors.toMap(
	                        Map.Entry::getKey,
	                        Map.Entry::getValue,
	                        (e1, e2) -> e1,
	                        LinkedHashMap::new
	                ));
	      
	      System.out.println(sortedMap);
	}
}

//{Hello=2, Welcome=1, to=1, World=1, Interview=1}




