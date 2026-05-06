package LeetCode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		String result = longestCommonPrefix(strs);
		System.out.println("Longest Common Prefix: " + result);
	}

	private static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String temp = strs[0]; 
		String result = ""; 
		for (int i = 0; i < temp.length(); i++) 
		{ 
			char ch = temp.charAt(i); 
			for (int j = 1; j < strs.length; j++) { 
			
			if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
				return result; 
				} 
			} 
			result += ch; 
		} 
		return result;
	}
}
