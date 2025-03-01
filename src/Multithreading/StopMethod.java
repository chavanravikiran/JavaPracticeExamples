package Multithreading;

//It is use to stop thread
public class StopMethod {
	public static void main(String[] args) {
        StopExample t1 = new StopExample();
        t1.start();

        try {
            Thread.sleep(2000);
            t1.stop(); // Unsafe method
            System.out.println("Thread stopped.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class StopExample extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}