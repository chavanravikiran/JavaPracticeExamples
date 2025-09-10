package StringExample;

public class OutputTrace2 {
	public static void main(String[] args) {
		String str = null;
		String obj = "Java";
		
		System.out.println(obj + str);		//  Javanull
		System.out.println(obj.concat(str));	// Exception Null Pointer Exception
	}
}
