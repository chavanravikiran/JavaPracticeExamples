package BasicQuestion;

public class OutputTraceEx16 {
	public static void main(String[] args) {
		Child16 c = (Child16) new Parents16();//Runtime error -->class BasicQuestion.Parents16 cannot be cast to class BasicQuestion.Child16
		c.printMsg();
	}
}


class Parents16{
	void printMsg() {
		System.out.println("Form Parent Class !!!");
	}
}

class Child16 extends Parents16{
	void printMsg() {
		System.out.println("Form Child Class !!!");
	}
}