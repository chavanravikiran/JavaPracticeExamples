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
		
		int count2 = anotherWay2(str,find);
        System.out.println("Count of '" + find + "' = " + count2);
        
        anotherWay3(str,find);
        anotherWay4(str,find);
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
	
	private static int anotherWay2(String str, String find) {
		int count = 0;
        int index = 0;

        while ((index = str.indexOf(find, index)) != -1) {
            count++;
            index = index + find.length();
        }
        return count;
	}
	
	static void anotherWay3(String str, String find) {
		int count = (str.length() - str.replace(find, "").length()) / find.length();
		System.out.println("anotherWay3 - "+count);
	}

	static void anotherWay4(String str, String find) {
		int count = str.split(find).length - 1;
		
		System.out.println("anotherWay4 - " +count);
	}
	
}
