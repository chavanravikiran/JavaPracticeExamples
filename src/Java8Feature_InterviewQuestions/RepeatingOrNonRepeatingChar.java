package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RepeatingOrNonRepeatingChar {
	public static void main(String[] args) {
		
		String str = "banana";
		
		//First Non Repeating Char
		System.out.println("Non Repeating Char : "+
				Arrays.stream(str.split(""))
				.filter(x->str.indexOf(x) == str.lastIndexOf(x))
				.findFirst().get()
		);

		// Last Non-Repeating Character
		System.out.println("Last Non-Repeating Char : "+
				Arrays.stream(str.split(""))
				.filter(x->str.indexOf(x) == str.lastIndexOf(x))
				.reduce((x,y)->x).get()
		);
		
		//First Repeating Characters
		System.out.println("Non Repeating Char : "+
				Arrays.stream(str.split(""))
				.filter(x->str.indexOf(x) != str.lastIndexOf(x))
				.findFirst().get()
		);
		
		// Last Repeating Character
        System.out.println("Last Repeating: " +
            Arrays.stream(str.split(""))
                .filter(x -> str.indexOf(x) != str.lastIndexOf(x))
                .reduce((first, second) -> second)
                .orElse("Not Found")
        );
        
        
        System.out.println("First Non Repeating : "+Arrays.stream(str.split(""))
        .collect(Collectors.groupingBy(x->x,Collectors.counting()))
        .entrySet().stream()
        .filter(x->x.getValue()==1)
        .map(x->x.getKey())
        .findFirst().get());
        
	}
}
