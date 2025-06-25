package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//wite a stream program to move all zero's to beginning of array int[]
//and in maintened insertion order then
public class MoveAllZeroTOBeginning {
	public static void main(String[] args) {
		int a[]= {0,1,3,5,0,5,0,3,0};
		
		System.out.println(Arrays.stream(a)
		.boxed()
		.sorted().collect(Collectors.toList()));
		
		
	List<Integer>list1 = Arrays.stream(a).boxed().filter(x -> x == 0).collect(Collectors.toList());
	List<Integer>list2 = Arrays.stream(a).boxed().filter(x -> x != 0).collect(Collectors.toList());
	
	List<Integer> finalList = new LinkedList<>();
	finalList.addAll(list1);
	finalList.addAll(list2);
	
	System.out.println(finalList);
	
	}
}
