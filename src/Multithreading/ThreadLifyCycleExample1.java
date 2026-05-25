package Multithreading;

public class ThreadLifyCycleExample1 extends Thread{

	@Override
	public void run() {
		System.out.println("RUNNING !!!!");//
	}

	public static void main(String[] args) throws InterruptedException{
		ThreadLifyCycleExample1 t1 = new ThreadLifyCycleExample1();
		System.out.println(t1.getState());//New
		
		System.out.println(Thread.currentThread().getState());//RUNNABLE
		t1.start();
		t1.sleep(1000);

		t1.join();
		System.out.println("last exe.stage !!");
		
	}
}
