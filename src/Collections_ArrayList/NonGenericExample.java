package Collections_ArrayList;

import java.util.ArrayList;

public class NonGenericExample {
	 public static void main(String[] args) {
	        ArrayList list = new ArrayList();  // Raw collection (not recommended)

	        list.add("Java");
	        list.add(100);  // Allowed, but risky
	        list.add(3.14);

	        for (Object obj : list) {
	            String str = (String) obj;  // Type casting required (unsafe)
	            System.out.println(str);
	        }
	    }
}
