package StringExample;

public class CompareEqualsAndOperators {
	 public static void main(String[] args) {
	        String s1 = new String("Hello");
	        String s2 = new String("Hello");
	        String s3 = s1; // s3 points to the same object as s1

	        // == Operator (Reference Comparison)
	        System.out.println("s1 == s2 :"+s1 == s2); // false (Different objects)
	        System.out.println("s1 == s1 :"+s1 == s1); // true (same objects)
	        System.out.println(s1 == s3); // true (Same reference)

	        // equals() Method (Value Comparison)
	        System.out.println(s1.equals(s2)); // true (Same content)

	        // compareTo() Method (Lexicographical Comparison)
	        String s4 = "Apple";
	        String s5 = "Banana";
	        System.out.println(s4.compareTo(s5)); // Negative (-1) because "Apple" < "Banana"
	        System.out.println(s5.compareTo(s4)); // Positive (1) because "Banana" > "Apple"
	        System.out.println(s1.compareTo(s2)); // 0 (Both are "Hello")
	    }
}
