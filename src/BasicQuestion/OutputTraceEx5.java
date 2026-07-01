package BasicQuestion;

public class OutputTraceEx5 {
	public static void main(String[] args) {
		Car2 c = new Car2();
		c.drive();
		c.race();
		c.callPrivateMethod();
		System.out.println(c.maxSpeed);
		
		Vehical2 v = new Vehical2();
		v.drive();
		v.race();
		System.out.println(v.maxSpeed);
		
		Vehical2 vc = new Car2();//-->Dynamic Polymorphism
		vc.drive();//Vehical2 drive
		vc.race();
		System.out.println(vc.maxSpeed);//vehical che variable call honar na ki Car-->For variables, Java uses the reference type.
		
//		Car2 cv = new Vehical2();//Down Casting -->Complite Time Error
//		cv.drive();
//		cv.race();
		
		Vehical2.drive();
		Car2.drive();
	}
}

class Vehical2 {
	int maxSpeed = 200;

	public static void drive() {
		System.out.println("Drive Vehical !!");
	}

	public void race() {
		System.out.println("Vehical Driving at Speed !!!" + maxSpeed);
	}

	private void test() {
		System.out.println("Vehical Private Method !!!");
	}
}

class Car2 extends Vehical2 {
	int maxSpeed = 300;

	public static void drive() {
		System.out.println("Drive Car !!");
	}

	public void race() {
		System.out.println("Car Driving at Speed !!!" + maxSpeed);
	}
	
	private void test() {
		System.out.println("Car Private Method !!!");
	}
	
	void callPrivateMethod(){
		test();
	}
}

//Output
//-------------------------------------------
//Drive Car !!
//Car Driving at Speed !!!300
//Car Private Method !!!
//Drive Vehical !!
//Vehical Driving at Speed !!!200
//Drive Vehical !!
//Car Driving at Speed !!!300
//Drive Vehical !!
//Drive Car !!



//We can not Override the static ,private , final Method and constructors
//We can Override only public,protected,abstract and if the subclass is in the same package
// Variable extends hot nahit jevha Reference Parent and object child cha asto tevha .

