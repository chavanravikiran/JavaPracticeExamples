package Java8Feature_InterviewQuestions;

import java.util.stream.Stream;

public class AnyAllNoneMatchExample {
	public static void main(String[] args) {
		System.out.println(Stream.empty().anyMatch(x -> true));
		System.out.println(Stream.empty().allMatch(x -> true));
		System.out.println(Stream.empty().noneMatch(x -> true));
	}
}
//false
//true
//true
