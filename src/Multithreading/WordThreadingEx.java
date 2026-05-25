package Multithreading;

public class WordThreadingEx {
	public static void main(String[] args) {
		TestThread ts = new TestThread(); 
		ts.start();	

		for (; ; ) {
			System.out.println("Hello");
		}
		
	}
}
