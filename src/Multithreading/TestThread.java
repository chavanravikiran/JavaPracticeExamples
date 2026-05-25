package Multithreading;

public class TestThread extends Thread {

	@Override
	public void run() {
		for (;;) {
			System.out.println("Test Extends from Thread Class ");
		}
	}

}
