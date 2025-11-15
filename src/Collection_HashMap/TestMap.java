package Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {

        Map<EmployeeTest, String> map = new HashMap<>();

        map.put(new EmployeeTest(101, "Ravi", 50000), "Software Developer");
        map.put(new EmployeeTest(101, "Ravi", 50000), "Software Developer");
        map.put(new EmployeeTest(101, "Ravi", 50000), "Software Developer");

        System.out.println("Map size: " + map.size());
        
        String str = new String("Ravi");
        String str1 = "Ravi";
        String str2 = "Ravi";
        
        System.out.println(str == str1);
        System.out.println(str1 == str2);
    }
}
