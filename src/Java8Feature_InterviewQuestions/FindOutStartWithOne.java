package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//-List madhe 1 pasun start honare no chi list return karaychi hoti
public class FindOutStartWithOne {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,23,11,15,26,1673,165,346);
		
		System.out.println(
				list.stream()
				.filter(x->String.valueOf(x).startsWith("1"))
				.collect(Collectors.toList())
		);
	}
}
