package InnerClass;

public class StaticNestedOrInnerClass {
	 public static void main(String[] args) {
        Outer1.Inner inner = new Outer1.Inner();  // No need for Outer class object
        inner.display();
    }
}

class Outer1 {
    static class Inner {
        void display() {
            System.out.println("Static Inner Class");
        }
    }
}
