package Collection_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find Out Extra and common Element From Two ArrayList
public class FindOutExtraElementFromTwoArrayList {
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<>(
				Arrays.asList("Pen", "Pencil", "Notebook", "Workbook", "Rubber", "Shopnar"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Workbook", "Rubber", "Scale", "Pen", "Pencil", "Notebook"));

		usingCollection(list1, list2);
		usingString(list1, list2);
	}

	private static void usingCollection(List<String> list1, List<String> list2) {
		// Find out Extra Element in list2--removeAll
		List<String> extra = new ArrayList<>(list2);
		extra.removeAll(list1); // remove elements present in list1
		System.out.println("Extra elements in list2: " + extra);

		// Find out common from list1
		List<String> common = new ArrayList<>(list2);
		common.retainAll(list1);
		System.out.println("Common Element Print " + common);

	}

	private static void usingString(List<String> list1, List<String> list2) {
		// Extra elements in list2 (not in list1)
		List<String> extraInList2 = list2.stream().filter(e -> !list1.contains(e)).collect(Collectors.toList());
		System.out.println("Extra elements in list2: " + extraInList2);
		
		// Common elements in both lists
		List<String> commonElements = list1.stream()
//                .filter(list2::contains)
				.filter(e -> list2.contains(e)).distinct().collect(Collectors.toList());
		System.out.println("Common elements in both lists: " + commonElements);
		
	}
}
