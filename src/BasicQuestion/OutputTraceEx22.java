package BasicQuestion;

public class OutputTraceEx22 {
	public static void main(String[] args) {
		Child22 c = new Child22();
		c.celebration();
		Child22 c1 = new Child22("Test");
	}
}


class Parent22{
	void Parent(String message){
		System.out.println("Parrent Constructor "+message);
	}
}

class Child22 extends Parent22{
	Child22(String message){
		System.out.println("Child Constructor "+message);
	}
	Child22(){
		super();
	}
	public void celebration() {
		System.out.println("celebration method from Child !!! ");
	}
}


//celebration method from Child !!! 
