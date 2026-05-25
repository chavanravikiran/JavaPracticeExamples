package Multithreading;

public class CounterThread {
	private int count =0;
	
	
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
