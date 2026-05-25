package Multithreading;

public class ThreadMainUsingRunnbaleInterface implements Runnable{

	@Override
	public void run() {
		for(; ;) {
			System.out.println("Thread Main Using Runnbale Interface");
		}
	}
	
}
