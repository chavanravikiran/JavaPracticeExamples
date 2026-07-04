package BasicQuestion;

public class OutputTraceEx18 {
	public static void main(String[] args) {
		Car18 c = new Car18(10);
		c.drive();
	}
}

class Vehical18{
	int maxSpeed;
	
	Vehical18(int maxSpeed){
		System.out.println("Vehical constructor called !!!");
		this.maxSpeed = maxSpeed;
	}
	
	public void drive() {
		System.out.println("Vehical Speed is :"+maxSpeed);
	}
}

class Car18 extends Vehical18{

	Car18(int maxSpeed) {
		super(maxSpeed);//Super chya adhi apn konte statement lihita yet nahi
		System.out.println("Car constructor called !!!");
	}
	
	public void drive() {
		System.out.println("Car Speed is :"+maxSpeed);
	}
}


//Jr Parent class madhe argument constructor asel ani no argument constructor asel tr child class madhun call karave lagte te super() use karun


//output
//-----------------------------
//Vehical constructor called !!!
//Car constructor called !!!
//Car Speed is :10

