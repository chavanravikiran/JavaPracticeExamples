package BasicQuestion;

//This :- This keyword is refer to current instance variable/Object
//			1)Why this keyword is used?
//			-->because it differentiat Local and Instance variable.(When Local and instance variable  is same name)
//			2)where to use this?
//			-->* This can use ti refer current class instance variable
//			   * This to refer current class method
//			   * This to refer current class constructor

//Super :- This super keyword is refer to immediate parent class object.
//			Is-A-Relationship required
public class ThisSuperKeyword {
	public static void main(String[] args) {
		Dog d = new Dog("Buddy");
		d.display();
	}
}

class Animal {
	String name = "Animal"; // instance variable in superclass

	Animal() {
		System.out.println("Animal constructor called");//1st
	}

	void showName() {
		System.out.println("Name from Animal: " + name);//5th --Animal
	}
}

class Dog extends Animal {
	String name = "Dog"; // instance variable in subclass

	Dog(String name) {
		super(); // calls Animal constructor

		// local variable
		String localName = name;//Buddy

		// 'this.name' refers to current class (Dog)
		this.name = name;//Buddy set Buddy instead of Dog

		// 'super.name' refers to parent class (Animal)
		System.out.println("Local variable: " + localName);//Buddy
		System.out.println("this.name (Dog): " + this.name);//Buddy
		System.out.println("super.name (Animal): " + super.name);//Animal
	}

	void display() {
		super.showName(); // calls method from Animal
		System.out.println("Name from Dog class: " + this.name);//6th Buddy
	}
}
