package Cursors_For_Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//Both Direction-Forward/Backword
//Add,Remove,Set value at the time of iteration

public class ListIteratorCursorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Rahul","Sneha","Priya","Amit","Ravi"));
		
		ListIterator<String> itr = list.listIterator();

        while (itr.hasNext()) {

            String name = itr.next();

            // set() - replace current element
            if (name.equals("Amit")) {
                itr.set("Amit C");
            }

            // add() - add element after current element
            if (name.equals("Priya")) {
                itr.add("Pooja");
            }

            // remove() - remove current element
            if (name.equals("Sneha")) {
                itr.remove();
            }
        }

        System.out.println(list);
		
	}
}
