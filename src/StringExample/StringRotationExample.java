package StringExample;

public class StringRotationExample {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dabc";
		
		if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }
	}

	private static boolean isRotation(String s1, String s2) {
		 if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
	}
}
