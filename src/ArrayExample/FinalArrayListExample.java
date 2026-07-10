package ArrayExample;

import java.util.ArrayList;

public class FinalArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		final ArrayList<Integer> newList = list;
		System.out.println(newList);
	}
	
}
