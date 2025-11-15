package StringExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Input=aabcaaccc
//Output=a=2,b=1,c=1,a=2,c=3
public class HCLQuestionNo2 {
	public static void main(String[] args) {
		String str = "aabcaaccc";

		  List<String> result = new ArrayList<>();

	        // Split str into list of "consecutive groups"
	        List<String> groups = new ArrayList<>();
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            if (i == 0 || str.charAt(i) == str.charAt(i - 1)) {
	                sb.append(str.charAt(i));
	            } else {
	                groups.add(sb.toString());
	                sb = new StringBuilder("" + str.charAt(i));
	            }
	        }
	        groups.add(sb.toString());
	        
	        System.out.println(groups.stream()
	                .map(g -> g.charAt(0) + "=" + g.length())
	                .collect(Collectors.joining(","))
	        );
	}
}