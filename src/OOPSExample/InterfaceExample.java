package OOPSExample;

public class InterfaceExample {
	public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Output: Dog barks
    }
}


//Defining an interface
interface Animal {
 void sound();  // Abstract method (must be implemented)
}

//Implementing the interface
class Dog implements Animal {
 public void sound() {
     System.out.println("Dog barks");
 }
}