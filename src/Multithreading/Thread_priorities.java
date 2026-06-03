package Multithreading;

class Test extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(getName() + " - Hello #" + i++);

            // Optional: Add small sleep to make output readable
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

public class Thread_priorities {
    public static void main(String[] args) {
        // Create multiple threads
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        // Set names for identification
        t1.setName("Thread-LOW");
        t2.setName("Thread-NORMAL");
        t3.setName("Thread-HIGH");

        // Set different priorities (1 to 10)
        t1.setPriority(Thread.MIN_PRIORITY);    // 1 - Lowest
        t2.setPriority(Thread.NORM_PRIORITY);   // 5 - Normal (default)
        t3.setPriority(Thread.MAX_PRIORITY);    // 10 - Highest

        // Display priorities
        System.out.println(t1.getName() + " priority: " + t1.getPriority());
        System.out.println(t2.getName() + " priority: " + t2.getPriority());
        System.out.println(t3.getName() + " priority: " + t3.getPriority());

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Let threads run for a few seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop threads (in a real app, use proper shutdown mechanism)
        System.exit(0);
    }
}