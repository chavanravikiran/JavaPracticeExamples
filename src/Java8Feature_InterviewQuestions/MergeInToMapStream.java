package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MergeInToMapStream {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>(Arrays.asList("Ravi","Kiran","Atul","Chavan","Radha","Ramu"));
		
		System.out.println(str.stream()
		.collect(Collectors.toMap(x->x.length(),x->x,(exsiting,replace)->exsiting+","+replace))
		);
		
	}
}
