package Java8Feature_InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class FlatMapExample1 {
	public static void main(String[] args) {
		Map<String,Integer> map1 = new LinkedHashMap<>(); 
		for(int i=0;i<5;i++) {
			map1.put(getRandomString(), i);
		}
		
		Map<String,Integer> map2 = new LinkedHashMap<>(); 
		for(int i=0;i<7;i++) {
			map2.put(getRandomString(), i);
		}
		
		Map<String,Integer> map3 = new LinkedHashMap<>(); 
		for(int i=0;i<3;i++) {
			map3.put(getRandomString(), i);
		}
		
		System.out.println("Map 1 : "+map1);
		System.out.println("Map 2 : "+map2);
		System.out.println("Map 3 : "+map3);
		
		
		Map<String,Map<String,Integer>>nestedMap=new LinkedHashMap<>();
		nestedMap.put("Map1", map1);
		nestedMap.put("Map2", map2);
		nestedMap.put("Map3", map3);
		
		System.out.println(nestedMap);
		
		List<Map<String, Integer>> map = nestedMap.values()
		.stream().collect(Collectors.toList());
		System.out.println("Map :"+ map);
		
		List<Integer> list = nestedMap.values()
		        .stream()
		        .flatMap(m -> m.values().stream())
		        .collect(Collectors.toList());
		System.out.println(list);
	}
	
	// Method to generate random string
    public static String getRandomString() {
        return UUID.randomUUID().toString().substring(0, 6);
    }
}
