package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

//Find First Non-Repeated Character in a String
//String str = 'swiss';
public class FindFirstNonRepeatedCharacterString {
	public static void main(String[] args) {
		String str = "swiss";
		
		System.out.println(Arrays.stream(str.split(""))//'s','w','i','s','s'
		.collect(Collectors.groupingBy(x->x,Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1)
		.map(x->x.getKey()).findFirst().get());
		
		
		System.out.println(
				Arrays.stream(str.split(""))////'s','w','i','s','s'
				.filter(x->str.indexOf(x) == str.lastIndexOf(x))  //s == 
				.findFirst().get()
		);
	}
}
