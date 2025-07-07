package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//find common elements
public class FindCommonElementsFromTwoArrayList {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
		
		//Using Stream
		List<Integer> common = usingStream(list1, list2);
		System.out.println("Common elements: " + common);
		
		//Using arrayList-Traditional Way
		List<Integer> common1 = usingTraditionalWay(list1, list2);
		System.out.println("Common elements: " + common1);
		
	}

	private static List<Integer> usingStream(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .filter(x->list2.contains(x)) // Check if list2 contains each element from list1
                .collect(Collectors.toList());
    }
	
	private static List<Integer> usingTraditionalWay(List<Integer> list1, List<Integer> list2) {
		List<Integer> common = new ArrayList<>(list1);
        common.retainAll(list2);//Keep only elements also in list2
		return common;
	}
	
}
