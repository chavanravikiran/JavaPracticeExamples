package StringExample;

public class ReverseStringUsingManualMethod {
	public static void main(String[] args) {
		
		String name="Ravikiran";
		System.out.println("original String is "+name);
		reverseString(name);
	}

	private static void reverseString(String name) {
		String updString = "";
		for(int i = name.length()-1; i >= 0; i--) {
			updString+=name.charAt(i);
		}
		System.out.println("Reverse String "+updString);
	}
}
