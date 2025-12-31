package ArrayExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//List<Integer> list=[1,5,4,2,9,9,9]
//k=3;
//[1,5,4]=10
//[5,4,2]=11
//[4,2,9]=15
//output: 15

public class WindowsExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 4, 2, 9, 9, 9);

		List<Integer> listNew = list.stream().distinct().collect(Collectors.toList());

		System.out.println(listNew);
		Integer windowSize = 3;
		Integer target = 15;
		int temp = 1;

		tranditionalWay(listNew,windowSize,target);
		tranditionalWaySecond(listNew,windowSize,target);
		usingStreamWay(listNew,windowSize,target);
	}

	private static void tranditionalWay(List<Integer> listNew, Integer windowSize, Integer target) {
		for (int i = 0; i < listNew.size(); i++) {
			for (int j = i + 1; j < listNew.size() - 1; j++) {
				if (listNew.get(i) + listNew.get(j) + listNew.get(j + 1) == target) {
					System.out.println(listNew.get(i) + " " + listNew.get(j) + " " + listNew.get(j + 1));
				}
			}
		}
	}

	private static void tranditionalWaySecond(List<Integer> listNew, Integer windowSize, Integer target) {
		for (int i = 0; i <= listNew.size() - windowSize; i++) {
			if (listNew.get(i) + listNew.get(i + 1) + listNew.get(i + 2) == target) {
				System.out.println(listNew.subList(i, i + windowSize));
				break;
			}
		}
	}

	private static void usingStreamWay(List<Integer> listNew, Integer windowSize, Integer target) {
		System.out.println(
		        IntStream.range(0, listNew.size() - windowSize + 1)
		                .mapToObj(i -> listNew.subList(i, i + windowSize))
		                .filter(subList -> subList.stream().reduce(0, Integer::sum) == target)
		                .findFirst()
		                .orElse(Collections.emptyList())
		);
	}
}
