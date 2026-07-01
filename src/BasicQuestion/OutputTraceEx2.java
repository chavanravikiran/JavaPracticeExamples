package BasicQuestion;

public class OutputTraceEx2 {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t1.printNumber();
		t2.printNumber();
		t3.printNumber();
	}
}

class Test{
	
	int count;
	String str;
	
	Test(){
		//for int
		System.out.println(count);//\0
		count++;//0++ = 1
		
		//for String
		System.out.println(str);//null
		str = "Ravi";
	}
	public void printNumber() {
		System.out.println(count);//1
		System.out.println(str);//Ravi
	}
}