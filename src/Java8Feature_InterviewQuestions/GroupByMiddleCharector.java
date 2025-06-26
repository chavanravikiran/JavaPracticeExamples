package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given the String[] group the string based on the middle charectors
// i/p String[] str = {"ewe","jhj","rwd","gwj","dhj","gjs","djg","fsg"};
// O/p {s=[fsg], w=[ewe, rwd, gwj], h=[jhj, dhj], j=[gjs, djg]}
public class GroupByMiddleCharector {
	public static void main(String[] args) {
		String[] str = {"ewe","jhj","rwd","gwj","dhj","gjs","djg","fsg"};
		
		System.out.println(Arrays.stream(str).collect(Collectors.groupingBy(x->x.toString().substring(1, 2))));
		
	
		System.out.println(Stream.of(str).collect(Collectors.groupingBy(x->x.toString().substring(1, 2))));
	}
}
