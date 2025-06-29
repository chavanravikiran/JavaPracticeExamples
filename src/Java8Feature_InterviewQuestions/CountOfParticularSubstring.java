package Java8Feature_InterviewQuestions;

import java.util.stream.IntStream;

//Count of particular substring
public class CountOfParticularSubstring {
	public static void main(String[] args) {
		String str = "whatisgoingowhatareyoudoing";
		String substring = "what";
		
		Long count = IntStream.range(0, str.length()-substring.length()-1)
		.filter(x->str.substring(x,x+substring.length()).equals(substring))
		.count();
		
		System.out.println(count);
		
	}
}
