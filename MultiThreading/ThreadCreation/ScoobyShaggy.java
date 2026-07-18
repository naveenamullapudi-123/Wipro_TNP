class MyThread extends Thread {

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class ScoobyShaggy {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Set thread names
        t1.setName("Scooby");
        t2.setName("Shaggy");

        // Start threads
        t1.start();
        t2.start();
    }
}