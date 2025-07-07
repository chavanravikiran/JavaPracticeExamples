package Collection_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//in a given array return true if it contain distinct value and false otherwise int a[]={1,3,3,2,4,6,7,9,0,0}
public class DistinctCheck {
	public static void main(String[] args) {
		int[] a = {1, 3, 3, 2, 4, 6, 7, 9, 0, 0};
//		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		
		hasAllDistinct(a);
		usingStream(a);
	}

	private static void hasAllDistinct(int[] a) {
		int originalSize = a.length;
		Set<Integer> set = new HashSet<>();
		for (int no : a) {
            set.add(no);
        }
		if(set.size() == originalSize) {
			System.out.println("Array Contains Unique Values");
		}else {
			System.out.println("Array doesnot Contains Unique Values");
		}
	}

	private static void usingStream(int[] a) {
		Boolean b= Arrays.stream(a)
					.boxed()
					.distinct()
					.count() == a.length;
		
		if(b) {
			System.out.println("Array Contains Unique Values");
		}else {
			System.out.println("Array doesnot Contains Unique Values");
		}

	}
}
