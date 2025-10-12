package Java8Feature_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PairSumLike10 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,7,5,8,6,4));
		
		Integer target = 10;

		System.out.println("Using TraditionalWay !!!!!!!!!!!!!!!!!!!!!!");
		usingTraditionalWay(nums,target);
		
		System.out.println("Using Stream Way !!!!!!!!!!!!!!!!!!!!!!");
		usingStream(nums,target);
		
		System.out.println("Using Hashset !!!!!!!!!!!!!!!!!!!!!!");
		usingHashSet(nums,target);
	}
	



	static void usingTraditionalWay(List<Integer> nums,Integer target) {
		for (int i = 0; i < nums.size(); i++) {
			for(int j=i+1; j < nums.size();j++) {
				if(nums.get(i)+nums.get(j) == target) {
					System.out.println(nums.get(i)+"-"+nums.get(j));
				}
			}
		}
	}

	private static void usingStream(List<Integer> nums, Integer target) {
		 List<String> pairs =
		            IntStream.range(0, nums.size())                      // loop over i
		                .boxed()
		                .flatMap(i -> IntStream.range(i + 1, nums.size()) // loop over j > i
		                    .filter(j -> nums.get(i) + nums.get(j) == target)
		                    .mapToObj(j -> nums.get(i) + " + " + nums.get(j) + " = " + target)
		                )
		                .collect(Collectors.toList());

		        pairs.forEach(System.out::println);
	}

	private static void usingHashSet(List<Integer> nums, Integer target) {
		Set<Integer> seen = new HashSet<>();
		for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println(num + " + " + complement + " = " + target);
            }
            seen.add(num);
        }
	}
}
