package Java8Feature_InterviewQuestions;

import java.util.stream.IntStream;

//String s = "racecar";
public class PalindromString {
	public static void main(String[] args) {
		String s = "racecar";
	
		System.out.println("Using Stream :-"+usingStream(s));
		System.out.println("Using Traditional Way :-"+usingTraditional(s));
		
	}

	private static boolean usingTraditional(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().equals(sb);
	}

	private static boolean usingStream(String s) {
		return IntStream.range(0, s.length() / 2)
				 .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
	}
}
