package Collection_LinkedList;

import java.util.LinkedList;

public class LinkedListExample4 {
	public static void main(String[] args)
	{
	  LinkedList<Integer> list = new LinkedList<Integer>();
	  list.add(20);
	  list.add(1,30);
	  list.add(0, 40);
	  list.add(50);
	  list.add(2, 60);
	  list.add(60);
   
	  System.out.println("original Linked List :"+list); ////40,20,60,30,50,60
	  System.out.println(list.peekFirst());//40
	  System.out.println(list.peekLast());//60
	  System.out.println(list.peek());//40
	  
	  
	  System.out.println(list);
	  System.out.println(list.lastIndexOf(60));//return index
	  System.out.println(list.element());//Retrieves, but does not remove, the head (first element) of this list.
	  }
}
