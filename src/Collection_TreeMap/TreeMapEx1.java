package Collection_TreeMap;

import java.util.TreeMap;

public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> treeMap = new TreeMap<>();
		treeMap.put(11, "A");
		treeMap.put(25, "B");
		treeMap.put(33, "C");
		
		System.out.println(treeMap.headMap(33));
		System.out.println(treeMap.headMap(25));
		System.out.println(treeMap.headMap(11));
	}
}

//{11=A, 25=B}
//{11=A}
//{}
