package Collection_HashMap;

import java.util.*;

public class WeakHashMapExample {
	public static void main(String[] args) throws InterruptedException {

		WeakHashMap<Object, String> map = new WeakHashMap<>();
		Object key = new Object();

		map.put(key, "Ruby");

		System.out.println(map);

		key = null;

		System.gc();

		Thread.sleep(2000);

		System.out.println(map);

	}
}
