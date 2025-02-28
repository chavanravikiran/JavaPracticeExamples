package InnerClass;

public class LocalInnerClass {
	 public static void main(String[] args) {
	        Outer2 outer = new Outer2();
	        outer.outerMethod();
	    }
}

class Outer2 {
    void outerMethod() {
    	System.out.println("Line 12");
        class Inner {
            void display() {
                System.out.println("Local Inner Class");
            }
        }
        System.out.println("Line 18");
        Inner inner = new Inner();
        inner.display();
    }
}
