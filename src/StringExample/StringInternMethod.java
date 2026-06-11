package StringExample;

public class StringInternMethod {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		
		System.out.println(s1==s2);
		
		s1=s1.intern();
		System.out.println(s1 == s2);
	}
}
//Now both s1 and s2 point to the same object in the String Pool.

//String s1 = new String("Java");
//
//Heap            String Pool
//-----           -----------
//"Java"   ---->  "Java"
//   ^
//   |
//  s1