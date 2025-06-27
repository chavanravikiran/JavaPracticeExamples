package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove all non-numeric characters from a list.
public class RemoveNonNumaricFromList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("12dsjs3","83dsjs3","932fssjs8","022dops");
		
		//Get only Charectors
		System.out.println(list.stream().map(x->x.replaceAll("[aA-zZ]","")).collect(Collectors.toList()));
		
		//Get Only numbers
		System.out.println(list.stream().map(x->x.replaceAll("[0-9]+","")).collect(Collectors.toList()));

	}
}
