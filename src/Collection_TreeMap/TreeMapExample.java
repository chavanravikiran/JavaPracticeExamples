package Collection_TreeMap;

import java.util.TreeMap;

//Key value pair
//No duplicate Element
//key is not allowed
//no Null key but multiple null value
//Non Synchronize
//arrange Ascending Order
public class TreeMapExample {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		tree.put(1, "Apple");
		tree.put(2,"Banana");
		tree.put(5,"Greps");
		tree.put(6,"watermelon");
		tree.put(4,null);//null value allowed but null key is not allowed
//		tree.put(null,null);//null key is not allowed
		
		System.out.println(tree);//Asceding order
	}
}
