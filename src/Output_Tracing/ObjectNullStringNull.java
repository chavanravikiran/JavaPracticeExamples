package Output_Tracing;

public class ObjectNullStringNull {
	public static void main(String[] args) {
		testMethod(null);
	}

	private static void testMethod(Object object) {
		System.out.println("Object print : "+object);
	}
	
	private static void testMethod(String str) {
		System.out.println("String print : "+str);
	}
}
//both methods are applicable because null can be assigned to both Object and String.
//Java chooses the most specific method. Since String is a subclass of Object, the compiler selects
