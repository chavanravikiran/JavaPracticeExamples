package Java8Feature_InterviewQuestions;

import java.util.stream.IntStream;

public class FindMiddleCharacter {
    public static void main(String[] args) {
        String input = "ravikiran";  // Example string
        int length = input.length();
        int middle = length / 2;
        
        //Traditional Way
        printMiddleCharacter(input,length,middle);

        //Using Stream
        printMiddleCharacterUsingStream(input,length,middle);
    }

	public static void printMiddleCharacter(String str,int length,int middle) {
        if (length % 2 == 0) {
            // Even length: print two middle characters
            System.out.println("Middle characters: " + str.charAt(middle - 1) + str.charAt(middle));
        } else {
            // Odd length: print one middle character
            System.out.println("Middle character: " + str.charAt(middle));
        }
    }

	private static void printMiddleCharacterUsingStream(String input, int length, int middle) {
		IntStream.range(0, length)
        .filter(i -> (length % 2 == 0) ? (i == middle - 1 || i == middle) : (i == middle))
        .mapToObj(input::charAt)
        .forEach(System.out::print);
	}
}

