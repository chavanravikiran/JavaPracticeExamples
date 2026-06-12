package StringExample;

public class ConvertStringToCharArray {
	public static void main(String[] args) {
		String name = "Ravikiran";
		
		char ch[] = name.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
	}
}
