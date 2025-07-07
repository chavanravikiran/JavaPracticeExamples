package Collections_ArrayList;

import java.util.ArrayList;

public class ArrayListExample4 {
	public static void main(String[] args)
	{
	   ArrayList<String> list = new ArrayList<String>();
	     list.add(null);
	     list.add(1, null);
	     list.add(1, null);
	     list.add(1, null);
	     System.out.println(list);
	   
	     ArrayList<String> list1 = new ArrayList<String>();
	     list1.add(null);
	     list1.add(0, "A");
	     list1.add(2, "B");
	     list1.add(1, "C");
	   //[null]
	   //[A,null,B]
	   //[A,C,null,B]
	     
	     ArrayList<String> list2 = new ArrayList<String>();
	     list.add(null);
	     list.add(0, "A");
	     list.add(null);
	     list.add(2, "B");
	     list.add("20");
	     list.add(1, "C");
	    System.out.println(list);
	  }
}
