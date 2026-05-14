package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRangeFind {
	public static void main(String[] args) {
		List<Integer> range = new ArrayList<>(Arrays.asList(0,1,2,3,6,7,8));
				
		List<Integer> sorded = range.stream()
					.sorted()
					.collect(Collectors.toList());
		
		Integer min =sorded.get(0);
		Integer max =sorded.get(sorded.size()-1);
		
//		System.out.println(min+" "+max);
		
		int start = 0;
		int end = 0;
		String temp="";
		ArrayList<String> result = new ArrayList<>();
		
		for(int i=min;i<max-1; i++) {
			if(i==sorded.get(i)) {
				start=i;
				continue;
			}else if(i==sorded.get(i)) {
				end=sorded.get(i);
				break;
			}else if(i!=sorded.get(i)) {
				min=i+1;
				if(sorded.contains(min)) {
					temp=temp.concat(min.toString());
					print(temp);
				}
				continue;
			}
//			System.out.println("index "+i+" "+sorded.get(i));
		}
		temp =end+"-->"+start;
		System.out.println(temp);
		
	}
	
	private static void print(String temp) {
		System.out.println(temp);
	}
}
