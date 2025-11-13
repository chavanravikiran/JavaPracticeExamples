package StringExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutputTrace1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
		list.set(2, list.get(0));//Replace index 2 (currently "C") with "A". and Now list = [A, B, A]
		list.add("D");	//	Problem: Arrays.asList() returns a fixed-size list. add() (or remove()) is not supported.
		
		System.out.println(list);
	}
}
