package Multithreading;

public class ThreadMainUsingRunnbaleInterface2 {
	public static void main(String[] args) {
		ThreadMainUsingRunnbaleInterface tr = new ThreadMainUsingRunnbaleInterface();
		Thread t = new Thread(tr);
		t.start();
		for(; ;) {
			System.out.println("main Class SOUT");
		}
			
	}
}
