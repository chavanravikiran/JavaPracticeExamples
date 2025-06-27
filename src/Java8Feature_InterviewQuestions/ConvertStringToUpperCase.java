package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert List of String to Uppercase
public class ConvertStringToUpperCase {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("kgf","panchayat","family man","money hiest");
		
		System.out.println(list.stream().map(x->x.toUpperCase()).collect(Collectors.toList()));
	}
}
