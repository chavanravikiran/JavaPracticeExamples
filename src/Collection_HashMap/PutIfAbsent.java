package Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsent {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1,"Java");
		map.put(2,"Spring");
		map.put(1,"Python");
		map.putIfAbsent(3, "React");
		
		System.out.println(map);
	}
}
