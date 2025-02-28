package InnerClass;

public class MemberInnerClass {
	public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();  // Creating Inner class object
        inner.display();
    }
}

class Outer {
    private String message = "Hello from Outer!";

    class Inner {
        void display() {
            System.out.println(message); // Accessing private member of Outer class
        }
    }
}