package OOPSExample;

public class AutoboxingUnboxingExample {
	public static void main(String[] args) {
        
		// Autoboxing: Primitive → Wrapper
        int num = 10;       // Primitive
        Integer obj = num;  // Autoboxing (int → Integer)
        System.out.println("Autoboxed Integer: " + obj);

        // Unboxing: Wrapper → Primitive
        Integer number = new Integer(50);  // Wrapper Object
        int primitiveNum = number;  // Unboxing (Integer → int)
        System.out.println("Unboxed int: " + primitiveNum);
    }
}
