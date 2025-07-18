package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//how to rotate an array to the left (anti-clockwise)
public class RotateLeftSimple {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        int d = 3; // number of positions to rotate
        
        usingTraditionalWay(arr,d);
        usingStreamWay(arr,d);
	}

	private static void usingTraditionalWay(int[] arr, int d) {
		int n = arr.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + d) % n];
        }

        // Print rotated array
        for (int num : rotated) {
            System.out.print(num + " ");
        }
	}
	
	private static void usingStreamWay(int[] arr, int d) {
		List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
		
		List<Integer> rotated = Stream.concat(
                list.subList(d, list.size()).stream(),
                list.subList(0, d).stream()
        ).collect(Collectors.toList());
		
		System.out.println(rotated);
	}
	
	
}
