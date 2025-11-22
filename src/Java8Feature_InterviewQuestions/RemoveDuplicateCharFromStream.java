package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

//dabcadefg
//target = "dabcefg"
//remove duplicate and return in same order
public class RemoveDuplicateCharFromStream {
	public static void main(String[] args) {
		String str = "dabcadefg";
		
		usingStream(str);
		usingTraditionalWay(str);
		
	}


	private static void usingTraditionalWay(String str) {
		Set<String> set  = new LinkedHashSet<>();
		for(String obj : str.split("")) {
			set.add(obj);
		}
		
		String output = "";
		for(String result : set) {
			output.concat(result);
		}
		System.out.println(output);
	}


	private static void usingStream(String str) {
		System.out.println(Arrays.stream(str.split(""))
				.distinct()
				.collect(Collectors.joining())
		);
	}
}
