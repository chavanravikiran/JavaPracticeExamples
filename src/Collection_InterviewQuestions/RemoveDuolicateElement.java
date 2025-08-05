package Collection_InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

//Remove Duplicate Element from ArrayList 
public class RemoveDuolicateElement {
	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(5);
		
		//Print Using Iterator
		Iterator obj = list.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		usingLinkedHashSet(list);
		usingStream(list);
	}


	private static void usingLinkedHashSet(ArrayList<Integer> list) {//Remove Duplicate Element
		Set<Integer> set = new LinkedHashSet<>(list);
		
		System.out.println("Only Print Unique Element from ArrayList using LinkedHashSet");
		Iterator obj1 = set.iterator();
		while(obj1.hasNext()) {
			System.out.println(obj1.next());
		}		
	}

	private static void usingStream(ArrayList<Integer> list) {
		System.out.println("Only Print Unique Element from ArrayList Using Stream");
		System.out.println(list.stream()
		.distinct()
		.collect(Collectors.toList()));
	}
}
