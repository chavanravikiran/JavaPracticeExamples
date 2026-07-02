package BasicQuestion;

public class OutputTraceEx15 {
	public static void main(String[] args) {
//		Parents15 pp = new Parents15();		//we can not create instance/Object of abstract class
		Child15 cc = new Child15();
		cc.printMessage();
		Parents15 pc = new Child15();
		pc.printMessage();
//		Child15 cp = new Parents15(); 		//Downcasting
	}
}

abstract class Parents15{
	public abstract void printMessage();
}

class Child15 extends Parents15{

	@Override
	public void printMessage() {
		System.out.println("Hello !!!");
	}
	
}