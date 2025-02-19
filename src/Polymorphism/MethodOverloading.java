package Polymorphism;

public class MethodOverloading {
	// Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
    	MethodOverloading math = new MethodOverloading();
        System.out.println(math.add(5, 10));      // Calls method with two int parameters
        System.out.println(math.add(5, 10, 15));  // Calls method with three int parameters
        System.out.println(math.add(5.5, 10.5));  // Calls method with double parameters
    }
}

