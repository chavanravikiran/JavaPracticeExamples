package BasicQuestion;

public class OutputTraceEx3 {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		
		Vehical v = new Vehical();
		v.drive();
		
//		Car cv = new Vehical();  ---?Compile Time checking Car is Vehical is wrong -->correct is Vehical is Car DownCasting concept
//		cv.drive();
		
		Vehical vc = new Car();//Car cha object create hoto ani car chi drive method call hote
		vc.drive();
		
	}
}

class Vehical{
	public void drive() {
		System.out.println("Vehical drive method call !!! ");
	}
}

class Car extends Vehical{
	public void drive() {
		System.out.println("Car Drive Method Call !!! ");
	}
}

//Output
//-----------------------------------------
//Car Drive Method Call !!! 
//Vehical drive method call !!! 
//Car Drive Method Call !!! 
