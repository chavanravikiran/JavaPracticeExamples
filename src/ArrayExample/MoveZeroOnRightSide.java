package ArrayExample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeroOnRightSide {
	public static void main(String[] args) {
		int arr[] = {0,9,0,-3,0,5};
		
		usingTraditionalWay(arr);
		usingStreamWay(arr);
	}


	private static void usingTraditionalWay(int[] arr) {
		List<Integer> result = new LinkedList<>();
		Integer count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count=count+1;
			}else {
				result.add(arr[i]);
			}
		}
		for(int j=0; j<count; j++) {
			result.add(0);
		}
		System.out.println("Using Traditional Way "+result);
	}
	
	private static void usingStreamWay(int[] arr) {
		List<Integer> onlyZero =Arrays.stream(arr).boxed()
		.filter(x->x==0)
		.collect(Collectors.toList());
		
		List<Integer> nonZero =Arrays.stream(arr).boxed()
				.filter(x->x!=0)
				.collect(Collectors.toList());
				
		List<Integer> result = new LinkedList<>();

		result.addAll(nonZero);
		result.addAll(onlyZero);
		System.out.println("Using Stream Way "+result);
	}
}
