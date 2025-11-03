package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Question:-Java finds the longest word easily using streams or normal way
public class LongestWordFinder {

	public static void main(String[] args) {
		String sentence = "Java finds the longest word easily using streams or normal way";
		
		//Old Techniques
		String oldTechniques=usingOldTechnique(sentence);
		System.out.println(oldTechniques);
		
		//New Techniques -using Stream
		String newTechniques=usingNewTechnique(sentence);
		System.out.println(newTechniques);
		
		//New Techniques -- Using Stream
		usingNewTechniqueNew(sentence);
		
		usingNewStream(sentence);
	}




	private static String usingOldTechnique(String sentence) {
		String longestWord ="";
		String[] words = sentence.split(" ");
		for (String word : words) {
			if(word.length() >longestWord.length()) {
				longestWord=word;
			}
		}
		return "longest Word is '"+longestWord +"' and lenght of this word is "+longestWord.length();
	}
	

	private static String usingNewTechnique(String sentence) {
		Optional<String> longestWord = Arrays.stream(sentence.split(" "))
				.max((x,y) -> Integer.compare(x.length(), y.length()));
		
		return "longest Word is '"+longestWord.get() +"' and lenght of this word is "+longestWord.get().length();
	}

	private static String usingNewTechniqueNew(String sentence) {
		Map<Integer,String> map = Arrays.stream(sentence.split(" "))
		.collect(Collectors.toMap(x->x.length(), x->x,(existing, replacement) -> existing));
		
		System.out.println("---------"+map.entrySet().stream()
	    .sorted((e1, e2) -> e2.getKey() - e1.getKey()) // sort by key descending
//	    .sorted(Map.Entry.<Integer, String>comparingByKey(Comparator.reverseOrder()))
	    .findFirst());
		
		
		return null;
	}

	private static void usingNewStream(String sentence) {
		List<String> list = Arrays.asList(sentence.split(" "));
		
		System.out.println(
				list.stream()
				.sorted((a,b)->Integer.compare(b.length(), a.length()))
				.findFirst()
				.get()
		);
	}
}
