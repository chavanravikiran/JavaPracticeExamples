package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//given an array of integers group the numbers by the range in which they belong.
//int a[]={1,2,3,11,15,24,25,36,47,46};
//o/p :-0=[1,2,3],10=[11,15],20=[24,25],30=[36],40=[47,46]
public class RangeBelongsToNumber {
	public static void main(String[] args) {
		int a[]= {1,2,3,11,15,24,25,36,47,46};
		
		Map<Object, List<Integer>>list1=Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(x->x/10*10, Collectors.toList()));
		System.out.println(list1);
		
		//Maintained Insertion Order
		Map<Object, List<Integer>>list2=Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(x->x/10*10,LinkedHashMap::new, Collectors.toList()));
		System.out.println(list2);
	}
}
