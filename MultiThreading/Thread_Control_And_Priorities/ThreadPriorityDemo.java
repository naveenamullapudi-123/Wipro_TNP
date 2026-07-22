class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running: " + i);
        }
        System.out.println(getName() + " has completed.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        MyThread maxThread = new MyThread("MAX Priority Thread");
        MyThread minThread = new MyThread("MIN Priority Thread");
        MyThread normThread = new MyThread("NORM Priority Thread");

        // Set priorities
        maxThread.setPriority(Thread.MAX_PRIORITY); // 10
        minThread.setPriority(Thread.MIN_PRIORITY); // 1
        normThread.setPriority(Thread.NORM_PRIORITY); // 5

        // Start all threads at the same time
        maxThread.start();
        minThread.start();
        normThread.start();
    }
}