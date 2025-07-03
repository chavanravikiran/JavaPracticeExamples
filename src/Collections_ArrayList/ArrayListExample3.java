package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("JAVA");
		lists.add("React");
		lists.add("Spring MVC");
		lists.add("Spring Boot");
		
		for (String list : lists) {
			System.out.println(list.toUpperCase());
		}
		System.out.println("-------------------Below is Reverse Array List---------------------");
		Collections.reverse(lists);
		for (String list : lists) {
		    System.out.println(list.toUpperCase());
		}
		
		System.out.println("--------Update------");
		lists.set(2, "Spring AOP");
		System.out.println(lists);
		
		System.out.println("--------Remove------");
		lists.remove(1);
		System.out.println(lists);
		
		System.out.println("--------Sort by Asc Order ------");
		Collections.sort(lists);
		System.out.println(lists);
		
		//clone 
		ArrayList<String> newList = new ArrayList<>();
		System.out.println("To Check if arrayList is empty or not");
		if(newList.isEmpty()) {
			System.out.println("Given List is Empty !!! ");
		}else {
			System.out.println("Given List is not Empty !!! ");
		}
		newList.addAll(lists);
		
		System.out.println("To Check if arrayList is empty or not");
		if(newList.isEmpty()) {
			System.out.println("Given List is Empty !!! ");
		}else {
			System.out.println("Given List is not Empty !!! ");
		}
		
			
	}
}
