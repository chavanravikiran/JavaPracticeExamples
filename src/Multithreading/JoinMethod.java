package Multithreading;

//The join() method waits for a thread to finish before proceeding another thread.
public class JoinMethod {
	public static void main(String[] args) {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();
        
        t1.start();
        try {
            t1.join(); // Waits for t1 to finish before starting t2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}

class JoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}