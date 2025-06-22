package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

//Given a sentence ,find the word that has the 2nd  nth highest lenght 
public class NthLongestWord {
	public static void main(String[] args) {
		String sentence = "I am Learing Stream API in Java";

		//Largest
		String nthLargest = Arrays.stream(sentence.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(nthLargest +" Lenght is "+nthLargest.length());
		//Smallest 
		System.out.println(Arrays.stream(sentence.split(" ")).sorted(Comparator.comparing(String::length)).skip(1).findFirst().get());
	}
}
