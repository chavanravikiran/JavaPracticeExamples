package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Find Second Highest Element 
public class SecondHighestElement {
	public static void main(String[] args) {
		List<Integer> number = List.of(1,2,3,4,5,6,2,5);
		findUsingStream(number);
		findUsingTraditionalWay(number);
	}


	private static void findUsingStream(List<Integer> number) {
		Integer secondHighest=number.stream()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst().get();
		System.out.println(secondHighest);
	}

	private static void findUsingTraditionalWay(List<Integer> number) {
		Integer temp ;
		for(int i=0;i<number.size()-1;i++) {
			for(int j=i+1; j<number.size()-i-1;j++) {
				if(number.get(i) > number.get(j+1)) {
					temp=number.get(i);
					number.set(j,number.get(j+1));
					number.set(j+1,temp);
				}
			}
		}
		System.out.println("Using Traditional Way "+number.get(number.size()-1));
	}
}
