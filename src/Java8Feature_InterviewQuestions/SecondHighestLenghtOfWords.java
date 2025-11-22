package Java8Feature_InterviewQuestions;

import java.util.Arrays;

public class SecondHighestLenghtOfWords {
	public static void main(String[] args) {
		String str="I am Learning Stream API in Java";
		
		System.out.println(Arrays.stream(str.split(" "))
			.sorted((a,b)->Integer.compare(b.length(), a.length()))
			.skip(1)
			.findFirst().get()
		);
		
		System.out.println(Arrays.stream(str.split(" "))
				.sorted((a,b)->Integer.compare(b.length(), a.length()))
				.findFirst().get().length()
			);
	}
}
