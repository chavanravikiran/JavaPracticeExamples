package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Move All Zeros to the End of a List (Without Changing Order)
//
//Input:
//[1, 0, -3, 0, 5, -2, 0, 8, 0, -1]
//Output:
//[1, -3, 5, -2, 8, -1, 0, 0, 0, 0]
public class MoveZeroAtEnd {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 0, -3, 0, 5, -2, 0, 8, 0, -1);
		
		usingStream(list);
		shiftZeroAtEndUsingStream(list);
	}

	private static void usingStream(List<Integer> list) {
		List<Integer> nonZero = list.stream()
		.filter(x->x!=0)
		.collect(Collectors.toList());
		
		List<Integer> allZero = list.stream()
				.filter(x->x==0)
				.collect(Collectors.toList());
				
		List<Integer> finalList = new ArrayList<>();
		finalList.addAll(nonZero);
		finalList.addAll(allZero);
		System.out.println(finalList);
	}
	
	private static void shiftZeroAtEndUsingStream(List<Integer> list) {
		List<Integer> positive = list.stream()
		.filter(x->x>=1)
		.collect(Collectors.toList());
		
		List<Integer> negative = list.stream()
		.filter(x->x<=0)
		.collect(Collectors.toList());
	
		List<Integer> finalList = new ArrayList<>();
		finalList.addAll(positive);
		finalList.addAll(negative);
		System.out.println(finalList);
	}
}