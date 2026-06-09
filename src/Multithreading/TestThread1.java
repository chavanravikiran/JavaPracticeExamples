package Multithreading;

public class TestThread1 {
	public static void main(String[] args) {

		
		Integer a = 128;
		Integer b = 128;

		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		CounterThread ct = new CounterThread();
		MyThread1 t1 = new MyThread1(ct);
		MyThread1 t2 = new MyThread1(ct);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e) {
		}
		System.out.println(ct.getCount());
	}
}
