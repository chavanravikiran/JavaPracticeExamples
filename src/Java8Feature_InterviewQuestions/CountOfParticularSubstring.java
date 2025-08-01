package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Count of particular substring
public class CountOfParticularSubstring {
	public static void main(String[] args) {
		String str = "whatisgoingowhatareyoudoing";
		String find= "what";
		
		Long count = IntStream.range(0, str.length()-find.length()-1)
		.filter(x->str.substring(x,x+find.length()).equals(find))
		.count();
		
		System.out.println(count);
		
		int count1 = anotherWay(str,find);
		System.out.println(count1);
	}

	private static int anotherWay(String str, String find) {
		List<String> newString = new ArrayList<>();
		for (int i = 0; i <= str.length()- find.length(); i++) {
			newString.add(str.substring(i,i+find.length()));
		}
		System.out.println(newString);
		
		return newString.stream()
				.filter(x->x.equals(find))
				.collect(Collectors.toList()).size();
	}
}
