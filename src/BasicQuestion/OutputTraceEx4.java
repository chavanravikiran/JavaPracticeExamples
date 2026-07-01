package BasicQuestion;

public class OutputTraceEx4 {
	public static void main(String[] args) {
		Car1 c = new Car1();
		c.drive();
		c.playMusic();
		
		Vehical1 v= new Vehical1();
		v.drive();
//		v.playMusic(); // PlayMusic Method does not present in Vehical Class

		Vehical1 vc = new Car1();
		vc.drive();
//		vc.playMusic(); // PlayMusic Method does not present in Vehical Class- object is created Car but here Reference of Vehical Class
		
	}
}

class Vehical1{
	public void drive() {
		System.out.println("Vehical drive method call !!! ");
	}
}

class Car1 extends Vehical1{
	public void drive() {
		System.out.println("Car Drive Method Call !!! ");
	}
	
	public void playMusic() {
		System.out.println("Playing Music in Car !!! ");
	}
}


//Output 
//-------------------------------------
//Car Drive Method Call !!! 
//Playing Music in Car !!! 
//Vehical drive method call !!! 
//Car Drive Method Call !!! 

