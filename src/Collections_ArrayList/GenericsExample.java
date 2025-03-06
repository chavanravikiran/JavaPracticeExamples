package Collections_ArrayList;

import java.util.ArrayList;

// Specifing type of element to be hold in ArrayList is called as Generics
public class GenericsExample {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();//String Generic Collection
		
		list.add("Ravikiran");
		list.add("Chavan");
//		list.add(100);//ClassCastException run time error 
		
		for (Object objStr : list) {
			System.out.println(objStr);
		}
		
		System.out.println("-----------------------------");
		
		ArrayList<Integer> listInt = new ArrayList<>();//Integer Generic Collection
		listInt.add(103);
		listInt.add(193);
		listInt.add(191);
//		listInt.add("ravikiran");// ClassCastException run time error
		
		for (Object objInt : listInt) {
			System.out.println(objInt);
		}
	}
}
