package Java8Feature_FunctionInterface;

@FunctionalInterface
interface Sayable {
	//Abstract method
    void say(String message);
    
    // default method inside functional interface
    default void greet() {
        System.out.println("Hello from default method!");
    }
    
    // Static method
    static void info() {
        System.out.println("Hello from static method in Sayable interface!");
    }
    static void infoV1(String str) {
    	System.out.println("Hello from static method in Sayable interface!"+str);
    }
}

public class SimpleFunctionalInterfaceExample {
	 public static void main(String[] args) {
	        // Create a lambda for the functional interface
	        Sayable sayable = (msg) -> System.out.println("You said: " + msg);

	        sayable.say("Hello Functional Interface!");
	        
	        sayable.greet();
	        
	        Sayable.info();
	        Sayable.infoV1("HHHHHHHH");
	    }
}
