package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Can we store duplicate elements in an ArrayList? If yes, what are the ways to remove duplicate elements from ArrayList?
public class AddDuplicateAndThenRemoveDuplicateElement {
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(null);
		number.add(1);
		number.add(2);
		number.add(1);
		number.add(1);
		number.add(3);
		
		Collections.reverse(number);
		System.out.println("Original ArrayLisr "+number);
		
		//using HashSet
		Set<Integer> set = new HashSet<>(number);
		System.out.println("Remove Duplicate Using HashSet "+set);
		
		//using LinkedHashSet
		HashSet<Integer> hashSet = new LinkedHashSet<>(number);
		System.out.println("Remove Duplicate Using LinkedHashSet "+hashSet);
		
		//Using Stream
		List<Integer> stream = number.stream()
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println("Remove Duplicate Using Stream "+stream);
	}
}
