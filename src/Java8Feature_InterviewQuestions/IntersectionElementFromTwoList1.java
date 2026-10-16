package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntersectionElementFromTwoList1 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 5, 5, 1);
		List<Integer> list2 = Arrays.asList(5, 1, 2, 5, 6, 7);

		// 1,2,5

		List<Integer> nList1 = list1.stream()
				.distinct()
				.collect(Collectors.toList());

		List<Integer> nList2 = list2.stream()
				.distinct()
				.collect(Collectors.toList());

		List<Integer> intersectionResult = nList1.stream()
				.filter(x -> nList2.contains(x))
				.collect(Collectors.toList());

		System.out.println(intersectionResult);

		traditionalWay(nList1, nList2);
	}

	private static void traditionalWay(List<Integer> nList1, List<Integer> nList2) {

		List<Integer> intersectionResult2 = nList2.stream().filter(x -> nList1.contains(x))
				.collect(Collectors.toList());

		System.out.println(intersectionResult2);

		Map<Integer, Boolean> map = new HashMap<>();

		for (Integer num : nList1) {
			map.put(num, true);
		}

		List<Integer> result = new ArrayList<>();
		for (Integer res : nList2) {
			if (map.containsKey(res) && !result.contains(res)) {
				result.add(res);
			}
		}

		System.out.println(result);
	}
}
