package Inheritance;

class Animals{
	int i =10;
	void bark(){
		
	}
	
	void dead() {
		
	}
	
	void pee() {
		System.out.println("Animals Method ");
	}
}

class Cats extends Animals{
	int i =20;
	void run(){
		
	}
	
	void chat() {
		
	}
	
	void pee() {
		System.out.println("Animals Method ");
	}
	
	
}

public class InheritanceExample {
	public static void main(String[] args) {
		
		Animals a = new Cats();
		Animals b = new Animals();
		Cats c = new Cats();
		
		a.bark();
		a.dead();
//		a.run(); //
//		a.chat();
		System.out.println(a.i);
		a.pee();
		
		b.bark();
		b.dead();
//		b.run();
//		b.chat();
		System.out.println(b.i);
		b.pee();
		
		c.bark();
		c.dead();
		c.run();
		c.chat();
		System.out.println(c.i);
		c.pee();
		
	}
}


