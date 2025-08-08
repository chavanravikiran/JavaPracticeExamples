package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

//Find the second largest number
public class FindSecondLargestElement {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(12,23));
		array.add(40);
		array.add(13);
		array.add(44);
		array.add(25);
		array.add(74);
		
		System.out.println("Original Array "+array);
		
		//Using Collection
		Integer number = usingTree(array);
		System.out.println("Second Largest Element is "+number);
		
		//Using Stream
		Integer number1 = usingStream(array);
		System.out.println("Second Largest Element is "+number1);
		
	}


	private static Integer usingTree(ArrayList<Integer> array) {
		Set<Integer> set = new TreeSet<>();
		set.addAll(array);
		List<Integer> sortedList = new ArrayList<>();
		sortedList.addAll(set);
		return sortedList.get(set.size()-2);
	}

	private static Integer usingStream(ArrayList<Integer> array) {
		return array.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst().get();
	}
}
