package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartitioningByAgeGroup1 {
	public static void main(String[] args) {
		List<Integer> age = new ArrayList<>();
		age.add(15);
		age.add(14);
		age.add(19);
		age.add(20);
		age.add(15);
		age.add(22);
		
		
		System.out.println(
				age.stream()
				.collect(Collectors.partitioningBy(x->x >=18))
				.entrySet().stream()
				.collect(Collectors.toMap(x->x.getKey()==false ? "Under-Age":"Above-Age",y->y.getValue()))
		);
	}
}
