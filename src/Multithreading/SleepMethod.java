package Multithreading;

//thread sleep for some time.
//Always Throw InterruptedException
//after Some time it execute
public class SleepMethod {
	public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        t1.start();
    }
}

class SleepExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}