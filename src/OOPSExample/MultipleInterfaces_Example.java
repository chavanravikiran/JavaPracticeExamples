package OOPSExample;

public class MultipleInterfaces_Example {
	public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();       // Output: Car is starting...
        myCar.fuelType();    // Output: Petrol engine
    }
}


interface Vehicle {
    void start();
}

interface Engine {
    void fuelType();
}

// A class implementing multiple interfaces
class Car implements Vehicle, Engine {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void fuelType() {
        System.out.println("Petrol engine");
    }
}