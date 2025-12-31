package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Input [1, 2, -3, -5, 4, -6, 7]
//Output [1, -3, 2, -5, 4, -6, 7]
public class AlternateArrangement {
	public static void main(String[] args) {
		int arr[]= {1, 2, -3, -5, 4, -6, 7};
		
		List<Integer> positive = Arrays.stream(arr).boxed()
		.filter(x->x>0)
		.collect(Collectors.toList());
		
		List<Integer> negative = Arrays.stream(arr).boxed()
				.filter(x->x<0)
				.collect(Collectors.toList());
		
		List<Integer> resultList = new ArrayList<>();
		for(int i=0; i<positive.size()-1; i++) {
			resultList.add(positive.get(i));
			resultList.add(negative.get(i));
		}
		
		System.out.println(resultList);
	}
}
