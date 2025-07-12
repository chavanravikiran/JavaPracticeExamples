package Collection_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample5 {
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
	   	list.add(20);
	    list.add(1,30);
	    list.add(0, 40);
	    list.add(2, 60);
	   
	    System.out.println("Original LinkedList "+list);//40,20,60,30
	    ListIterator<Integer> litr = list.listIterator(2);
	    while(litr.hasNext())
	    	System.out.println(litr.next());
	    }
}
