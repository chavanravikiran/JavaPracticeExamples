package Collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1,"Ravi");
		map.put(2,"");
		map.put(3,"kiran");
		map.put(4,null);
		map.put(null,null);
		
		System.out.println(map);
		
		Iterator<Map.Entry<Integer,String>> itr =map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() +"===>"+ entry.getValue());
		}
	}
}
