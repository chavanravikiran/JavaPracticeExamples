package Multithreading;

public class MyThread1 extends Thread {

	private CounterThread counterThread;

	public MyThread1(CounterThread counterThread) {
		this.counterThread = counterThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counterThread.increment();
		}
	}

}
