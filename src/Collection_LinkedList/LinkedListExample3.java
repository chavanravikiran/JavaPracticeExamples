package Collection_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample3 {
	
	public static void main(String[] args)
	{
	  LinkedList<String> list = new LinkedList<String>();
	  ListIterator<String> litr = list.listIterator();
	    list.add("Harry");
	    list.add("John");
	    list.add("Tom");
	    list.add("Deep");
	   
	   litr = list.listIterator();
	   if(litr.next().equals("John"))
	      litr.remove();
	   while(litr.hasNext())
	      System.out.println(litr.next());
	   }
}
